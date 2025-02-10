package com.openedugo.openedugo.entity;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "estudiantes")
public class EstudianteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estudiante_id", updatable = false, nullable = false)
    private Integer estudianteId;

    @Column(name = "numero_alumno", nullable = false, unique = true)
    private Integer numeroAlumno;

    @Column(name = "nombres", nullable = false, length = 100)
    private String nombres;

    @Column(name = "apellidos", nullable = false, length = 100)
    private String apellidos;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "lugar_nacimiento", length = 100)
    private String lugarNacimiento;

    @Column(name = "nacionalidad", length = 50)
    private String nacionalidad;

    @Column(name = "departamento", length = 50)
    private String departamento;

    @Column(name = "direccion_domicilio", length = 255)
    private String direccionDomicilio;

    @Column(name = "distrito", length = 50)
    private String distrito;

    @Column(name = "barrio", length = 50)
    private String barrio;

    @Column(name = "centro_procedencia", length = 100)
    private String centroProcedencia;

    @Column(name = "repitente")
    private Boolean repitente;

    @Column(name = "padecimiento", length = 255)
    private String padecimiento;

    @Column(name = "diagnosticado")
    private Boolean diagnosticado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estado_id")
    private EstadoEntity estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sucursal_id")
    private SucursalEntity sucursal;

    // Relación corregida: Un estudiante puede tener múltiples tutores
    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TutorEntity> tutores = new ArrayList<>();

    public EstudianteEntity() {}

    // Constructor actualizado con nueva relación
    public EstudianteEntity(Integer estudianteId, Integer numeroAlumno, String nombres, String apellidos,
                            Date fechaNacimiento, String lugarNacimiento, String nacionalidad,
                            String departamento, String direccionDomicilio, String distrito,
                            String barrio, String centroProcedencia, Boolean repitente,
                            String padecimiento, Boolean diagnosticado, EstadoEntity estado,
                            SucursalEntity sucursal) {
        this.estudianteId = estudianteId;
        this.numeroAlumno = numeroAlumno;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.nacionalidad = nacionalidad;
        this.departamento = departamento;
        this.direccionDomicilio = direccionDomicilio;
        this.distrito = distrito;
        this.barrio = barrio;
        this.centroProcedencia = centroProcedencia;
        this.repitente = repitente;
        this.padecimiento = padecimiento;
        this.diagnosticado = diagnosticado;
        this.estado = estado;
        this.sucursal = sucursal;
    }

    // Getters y Setters
    public Integer getEstudianteId() { return estudianteId; }
    public void setEstudianteId(Integer estudianteId) { this.estudianteId = estudianteId; }

    public Integer getNumeroAlumno() { return numeroAlumno; }
    public void setNumeroAlumno(Integer numeroAlumno) { this.numeroAlumno = numeroAlumno; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getLugarNacimiento() { return lugarNacimiento; }
    public void setLugarNacimiento(String lugarNacimiento) { this.lugarNacimiento = lugarNacimiento; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getDireccionDomicilio() { return direccionDomicilio; }
    public void setDireccionDomicilio(String direccionDomicilio) { this.direccionDomicilio = direccionDomicilio; }

    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }

    public String getBarrio() { return barrio; }
    public void setBarrio(String barrio) { this.barrio = barrio; }

    public String getCentroProcedencia() { return centroProcedencia; }
    public void setCentroProcedencia(String centroProcedencia) { this.centroProcedencia = centroProcedencia; }

    public Boolean getRepitente() { return repitente; }
    public void setRepitente(Boolean repitente) { this.repitente = repitente; }

    public String getPadecimiento() { return padecimiento; }
    public void setPadecimiento(String padecimiento) { this.padecimiento = padecimiento; }

    public Boolean getDiagnosticado() { return diagnosticado; }
    public void setDiagnosticado(Boolean diagnosticado) { this.diagnosticado = diagnosticado; }

    public EstadoEntity getEstado() { return estado; }
    public void setEstado(EstadoEntity estado) { this.estado = estado; }

    public SucursalEntity getSucursal() { return sucursal; }
    public void setSucursal(SucursalEntity sucursal) { this.sucursal = sucursal; }

    public List<TutorEntity> getTutores() { return tutores; }
    public void setTutores(List<TutorEntity> tutores) { this.tutores = tutores; }

    // Métodos de relación bidireccional
    public void addTutor(TutorEntity tutor) {
        tutores.add(tutor);
        tutor.setEstudiante(this);
    }

    public void removeTutor(TutorEntity tutor) {
        tutores.remove(tutor);
        tutor.setEstudiante(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstudianteEntity)) return false;
        EstudianteEntity that = (EstudianteEntity) o;
        return Objects.equals(estudianteId, that.estudianteId) &&
                Objects.equals(numeroAlumno, that.numeroAlumno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estudianteId, numeroAlumno);
    }

    @Override
    public String toString() {
        return "EstudianteEntity{" +
                "estudianteId=" + estudianteId +
                ", numeroAlumno=" + numeroAlumno +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}