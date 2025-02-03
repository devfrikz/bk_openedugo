package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.sql.Date;
import java.util.LinkedList;
import java.util.Objects;

@Entity
@Table(name = "estudiantes")
public class EstudianteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estudiante_id")
    private Integer estudianteId;
    
    @Column(name = "numero_alumno", nullable = false)
    private Integer numeroAlumno;
    
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "apellido", nullable = false, length = 100)
    private String apellido;
    
    @Column(name = "fecha_nacimiento", nullable = true)
    private Date fechaNacimiento;
    
    @Column(name = "lugar_nacimiento", nullable = true, length = 100)
    private String lugarNacimiento;
    
    @Column(name = "nacionalidad", nullable = true, length = 50)
    private String nacionalidad;
    
    @Column(name = "departamento", nullable = true, length = 50)
    private String departamento;
    
    @Column(name = "direccion_domicilio", nullable = true, length = 255)
    private String direccionDomicilio;
    
    @Column(name = "distrito", nullable = true, length = 50)
    private String distrito;
    
    @Column(name = "barrio", nullable = true, length = 50)
    private String barrio;
    
    @Column(name = "centro_procedencia", nullable = true, length = 100)
    private String centroProcedencia;
    
    @Column(name = "repitente", nullable = true)
    private char repitente;
    
    @Column(name = "padecimiento", nullable = true, length = 255)
    private String padecimiento;
    
    @Column(name = "diagnosticado", nullable = true)
    private char diagnosticado;
    
    @OneToOne
    @JoinColumn(name = "estado_id", nullable = true)
    private EstadoEntity estado;
    
    @OneToOne
    @JoinColumn(name = "sucursal_id", nullable = true)
    private SucursalEntity sucursal;

    public EstudianteEntity() {
    }

    public EstudianteEntity(Integer estudianteId, Integer numeroAlumno, String nombre, String apellido, Date fechaNacimiento, String lugarNacimiento, String nacionalidad, String departamento, String direccionDomicilio, String distrito, String barrio, String centroProcedencia, char repitente, String padecimiento, char diagnosticado, EstadoEntity estado, SucursalEntity sucursal) {
        this.estudianteId = estudianteId;
        this.numeroAlumno = numeroAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Integer getNumeroAlumno() {
        return numeroAlumno;
    }

    public void setNumeroAlumno(Integer numeroAlumno) {
        this.numeroAlumno = numeroAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCentroProcedencia() {
        return centroProcedencia;
    }

    public void setCentroProcedencia(String centroProcedencia) {
        this.centroProcedencia = centroProcedencia;
    }

    public char getRepitente() {
        return repitente;
    }

    public void setRepitente(char repitente) {
        this.repitente = repitente;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public char getDiagnosticado() {
        return diagnosticado;
    }

    public void setDiagnosticado(char diagnosticado) {
        this.diagnosticado = diagnosticado;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }

    public SucursalEntity getSucursal() {
        return sucursal;
    }

    public void setSucursal(SucursalEntity sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "EstudianteEntity{" + "estudianteId=" + estudianteId + ", numeroAlumno=" + numeroAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", lugarNacimiento=" + lugarNacimiento + ", nacionalidad=" + nacionalidad + ", departamento=" + departamento + ", direccionDomicilio=" + direccionDomicilio + ", distrito=" + distrito + ", barrio=" + barrio + ", centroProcedencia=" + centroProcedencia + ", repitente=" + repitente + ", padecimiento=" + padecimiento + ", diagnosticado=" + diagnosticado + ", estado=" + estado + ", sucursal=" + sucursal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.estudianteId);
        hash = 37 * hash + Objects.hashCode(this.numeroAlumno);
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.apellido);
        hash = 37 * hash + Objects.hashCode(this.estado);
        hash = 37 * hash + Objects.hashCode(this.sucursal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EstudianteEntity other = (EstudianteEntity) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.estudianteId, other.estudianteId)) {
            return false;
        }
        if (!Objects.equals(this.numeroAlumno, other.numeroAlumno)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return Objects.equals(this.sucursal, other.sucursal);
    }
    
    
}
