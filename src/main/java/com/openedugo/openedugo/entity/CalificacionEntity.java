/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 *
 * @author websuke
 */

@Entity
@Table (name = "calificaciones")
public class CalificacionEntity {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) 
    
    @Column(name = "calificacion_id")
    private Integer calificacionId;
    
    @Column(name = "estudiante_id",nullable = false)
    private Integer estudianteId;
     
    @Column(name = "materia_id",nullable = false)
    private Integer materiaId;
    
    @Column(name = "docente_id",nullable = false)
    private Integer docenteId;

    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="nota")
    private Double nota;   

    @Column(name="comentario")
    private String comentario;  
        
    @Column(name ="periodo", length = 25)
    private String periodo;
    
    /** Declaracion de llave Foraneas **/
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id")
    private EstudianteEntity estudiante;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_id")
    private MateriaEntity materia;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "docente_id")
    private DocenteEntity docente;
    
    //Constructor Vacio
    
    public CalificacionEntity() {
    }

    //Constructor con Parametros
    
    public CalificacionEntity(Integer calificacionId, Integer estudianteId, Integer materiaId, Integer docenteId, Date fecha, Double nota, String comentario, String periodo, EstudianteEntity estudiante, MateriaEntity materia, DocenteEntity docente) {
        this.calificacionId = calificacionId;
        this.estudianteId = estudianteId;
        this.materiaId = materiaId;
        this.docenteId = docenteId;
        this.fecha = fecha;
        this.nota = nota;
        this.comentario = comentario;
        this.periodo = periodo;
        this.estudiante = estudiante;
        this.materia = materia;
        this.docente = docente;
    }

    /** Declaracion de getter y setter **/
    
    public Integer getCalificacionId() {
        return calificacionId;
    }

    public void setCalificacionId(Integer calificacionId) {
        this.calificacionId = calificacionId;
    }

    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Integer getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Integer materiaId) {
        this.materiaId = materiaId;
    }

    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
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

    //Metodo ToString

    @Override
    public String toString() {
        return "CalificacionEntity{" + "calificacionId=" + calificacionId + ", estudianteId=" + estudianteId + ", materiaId=" + materiaId + ", docenteId=" + docenteId + ", fecha=" + fecha + ", nota=" + nota + ", comentario=" + comentario + ", periodo=" + periodo + ", estudiante=" + estudiante + ", materia=" + materia + ", docente=" + docente + '}';
    }
    
    //Metodos Equals y hashcode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.calificacionId);
        hash = 47 * hash + Objects.hashCode(this.estudianteId);
        hash = 47 * hash + Objects.hashCode(this.materiaId);
        hash = 47 * hash + Objects.hashCode(this.docenteId);
        hash = 47 * hash + Objects.hashCode(this.fecha);
        hash = 47 * hash + Objects.hashCode(this.nota);
        hash = 47 * hash + Objects.hashCode(this.comentario);
        hash = 47 * hash + Objects.hashCode(this.periodo);
        hash = 47 * hash + Objects.hashCode(this.estudiante);
        hash = 47 * hash + Objects.hashCode(this.materia);
        hash = 47 * hash + Objects.hashCode(this.docente);
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
        final CalificacionEntity other = (CalificacionEntity) obj;
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.periodo, other.periodo)) {
            return false;
        }
        if (!Objects.equals(this.calificacionId, other.calificacionId)) {
            return false;
        }
        if (!Objects.equals(this.estudianteId, other.estudianteId)) {
            return false;
        }
        if (!Objects.equals(this.materiaId, other.materiaId)) {
            return false;
        }
        if (!Objects.equals(this.docenteId, other.docenteId)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.nota, other.nota)) {
            return false;
        }
        if (!Objects.equals(this.estudiante, other.estudiante)) {
            return false;
        }
        if (!Objects.equals(this.materia, other.materia)) {
            return false;
        }
        return Objects.equals(this.docente, other.docente);
    }
    
    
}
