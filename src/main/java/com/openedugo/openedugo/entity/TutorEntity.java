package com.openedugo.openedugo.entity;

import com.openedugo.openedugo.enums.TipoTutor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "tutor")
public class TutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tutor_id")
    private Integer tutorId;
    
    @Column(name = "estudiante_id", nullable = false)
    private Integer estudianteId;
    
    @Column(name = "tipo", nullable = true)
    @Enumerated(EnumType.STRING)
    private TipoTutor tipo;
    
    @Column(name = "nombre", nullable = true, length = 100)
    private String nombre;
    
    @Column(name = "celular", nullable = true, length = 20)
    private String celular;
    
    @Column(name = "centro_trabajo", nullable = true, length = 100)
    private String centro_trabajo;
    
    @Column(name = "trabajo_celular", nullable = true, length = 20)
    private String trabajo_celular;
    
    @Column(name = "profesion", nullable = true, length = 100)
    private String profesion;
    
    @Column(name = "ingreso_estimado",precision = 10, scale = 2 , nullable = true)
    private BigDecimal ingreso_estimado;

    public TutorEntity() {
    }

    public TutorEntity(Integer tutorId, Integer estudianteId, TipoTutor tipo, String nombre, String celular, String centro_trabajo, String trabajo_celular, String profesion, BigDecimal ingreso_estimado) {
        this.tutorId = tutorId;
        this.estudianteId = estudianteId;
        this.tipo = tipo;
        this.nombre = nombre;
        this.celular = celular;
        this.centro_trabajo = centro_trabajo;
        this.trabajo_celular = trabajo_celular;
        this.profesion = profesion;
        this.ingreso_estimado = ingreso_estimado;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }

    public TipoTutor getTipo() {
        return tipo;
    }

    public void setTipo(TipoTutor tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCentro_trabajo() {
        return centro_trabajo;
    }

    public void setCentro_trabajo(String centro_trabajo) {
        this.centro_trabajo = centro_trabajo;
    }

    public String getTrabajo_celular() {
        return trabajo_celular;
    }

    public void setTrabajo_celular(String trabajo_celular) {
        this.trabajo_celular = trabajo_celular;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public BigDecimal getIngreso_estimado() {
        return ingreso_estimado;
    }

    public void setIngreso_estimado(BigDecimal ingreso_estimado) {
        this.ingreso_estimado = ingreso_estimado;
    }
    
    
}
