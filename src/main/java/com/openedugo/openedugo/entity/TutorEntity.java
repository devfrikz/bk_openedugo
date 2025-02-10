package com.openedugo.openedugo.entity;

import com.openedugo.openedugo.enums.TipoTutor;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tutor")
public class TutorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tutor_id")
    private Integer tutorId;

    // Relación corregida: ManyToOne con estudiante
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id", nullable = false)
    private EstudianteEntity estudiante;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TipoTutor tipo;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "celular", length = 20)
    private String celular;

    @Column(name = "centro_trabajo", length = 100)
    private String centroTrabajo;

    @Column(name = "trabajo_celular", length = 20)
    private String trabajoCelular;

    @Column(name = "profesion", length = 100)
    private String profesion;

    @Column(name = "ingreso_estimado", precision = 10, scale = 2)
    private BigDecimal ingresoEstimado;

    public TutorEntity() {}

    // Constructor actualizado
    public TutorEntity(EstudianteEntity estudiante, TipoTutor tipo, String nombre,
                       String celular, String centroTrabajo, String trabajoCelular,
                       String profesion, BigDecimal ingresoEstimado) {
        this.estudiante = estudiante;
        this.tipo = tipo;
        this.nombre = nombre;
        this.celular = celular;
        this.centroTrabajo = centroTrabajo;
        this.trabajoCelular = trabajoCelular;
        this.profesion = profesion;
        this.ingresoEstimado = ingresoEstimado;
    }

    // Getters y Setters
    public Integer getTutorId() { return tutorId; }
    public void setTutorId(Integer tutorId) { this.tutorId = tutorId; }

    public EstudianteEntity getEstudiante() { return estudiante; }
    public void setEstudiante(EstudianteEntity estudiante) { this.estudiante = estudiante; }

    public TipoTutor getTipo() { return tipo; }
    public void setTipo(TipoTutor tipo) { this.tipo = tipo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }

    public String getCentroTrabajo() { return centroTrabajo; }
    public void setCentroTrabajo(String centroTrabajo) { this.centroTrabajo = centroTrabajo; }

    public String getTrabajoCelular() { return trabajoCelular; }
    public void setTrabajoCelular(String trabajoCelular) { this.trabajoCelular = trabajoCelular; }

    public String getProfesion() { return profesion; }
    public void setProfesion(String profesion) { this.profesion = profesion; }

    public BigDecimal getIngresoEstimado() { return ingresoEstimado; }
    public void setIngresoEstimado(BigDecimal ingresoEstimado) { this.ingresoEstimado = ingresoEstimado; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TutorEntity)) return false;
        TutorEntity that = (TutorEntity) o;
        return Objects.equals(tutorId, that.tutorId) &&
                tipo == that.tipo &&
                Objects.equals(estudiante, that.estudiante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tutorId, tipo, estudiante);
    }

    @Override
    public String toString() {
        return "TutorEntity{" +
                "tutorId=" + tutorId +
                ", tipo=" + tipo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}