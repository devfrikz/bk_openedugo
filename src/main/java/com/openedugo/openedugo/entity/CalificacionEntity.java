package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;
import java.util.Objects;

/**
 * Entidad que representa la calificación de un estudiante.
 *
 * ERROR CORREGIDO:
 * Se eliminó el mapeo duplicado de las columnas "horario_id" y "estudiante_id" (en este caso, se mantiene la relación).
 * Ahora se utiliza únicamente la relación ManyToOne para mapear la columna "estudiante_id".
 */
@Entity
@Table(name = "calificaciones")
public class CalificacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calificacion_id")
    private Integer calificacionId;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "nota")
    private Double nota;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "periodo", length = 25)
    private String periodo;

    // Mapeo de la columna estudiante_id mediante la relación ManyToOne.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id", nullable = false)
    private EstudianteEntity estudiante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_id", nullable = false)
    private MateriaEntity materia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "docente_id", nullable = false)
    private DocenteEntity docente;

    // Constructor vacío
    public CalificacionEntity() {}

    // Constructor con parámetros (sin campos duplicados)
    public CalificacionEntity(Integer calificacionId, Date fecha, Double nota, String comentario, String periodo,
                              EstudianteEntity estudiante, MateriaEntity materia, DocenteEntity docente) {
        this.calificacionId = calificacionId;
        this.fecha = fecha;
        this.nota = nota;
        this.comentario = comentario;
        this.periodo = periodo;
        this.estudiante = estudiante;
        this.materia = materia;
        this.docente = docente;
    }

    // Getters y Setters
    public Integer getCalificacionId() {
        return calificacionId;
    }

    public void setCalificacionId(Integer calificacionId) {
        this.calificacionId = calificacionId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public EstudianteEntity getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteEntity estudiante) {
        this.estudiante = estudiante;
    }

    public MateriaEntity getMateria() {
        return materia;
    }

    public void setMateria(MateriaEntity materia) {
        this.materia = materia;
    }

    public DocenteEntity getDocente() {
        return docente;
    }

    public void setDocente(DocenteEntity docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "CalificacionEntity{" +
                "calificacionId=" + calificacionId +
                ", fecha=" + fecha +
                ", nota=" + nota +
                ", comentario=" + comentario +
                ", periodo=" + periodo +
                ", estudiante=" + estudiante +
                ", materia=" + materia +
                ", docente=" + docente +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.calificacionId);
        hash = 23 * hash + Objects.hashCode(this.fecha);
        hash = 23 * hash + Objects.hashCode(this.nota);
        hash = 23 * hash + Objects.hashCode(this.comentario);
        hash = 23 * hash + Objects.hashCode(this.periodo);
        hash = 23 * hash + Objects.hashCode(this.estudiante);
        hash = 23 * hash + Objects.hashCode(this.materia);
        hash = 23 * hash + Objects.hashCode(this.docente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CalificacionEntity other = (CalificacionEntity) obj;
        return Objects.equals(this.calificacionId, other.calificacionId) &&
                Objects.equals(this.fecha, other.fecha) &&
                Objects.equals(this.nota, other.nota) &&
                Objects.equals(this.comentario, other.comentario) &&
                Objects.equals(this.periodo, other.periodo) &&
                Objects.equals(this.estudiante, other.estudiante) &&
                Objects.equals(this.materia, other.materia) &&
                Objects.equals(this.docente, other.docente);
    }
}
