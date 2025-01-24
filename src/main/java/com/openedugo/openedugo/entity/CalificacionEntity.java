/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.text.DecimalFormat;

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
    private Integer calificacion_id;
    
    @Column(name = "estudiante_id",nullable = false)
    private Integer estudiante_id;
     
    @Column(name = "materia_id",nullable = false)
    private Integer materia_id;
    
    @Column(name = "docente_id",nullable = false)
    private Integer docente_id;

    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="nota")
    private Double nota;
    DecimalFormat df = new DecimalFormat("#.##");    

    @Column(name="comentario")
    private String comentario;  
        
    @Column(name ="periodo", length = 25)
    private String periodo;
    
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "estudiante_id")
    //private Estudiante estudiante;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "materia_id")
    //private Materia materia;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "docente_id")
    //private Docente docente;

    public Integer getCalificacion_id() {
        return calificacion_id;
    }

    public void setCalificacion_id(Integer calificacion_id) {
        this.calificacion_id = calificacion_id;
    }

    public Integer getEstudiante_id() {
        return estudiante_id;
    }

    public void setEstudiante_id(Integer estudiante_id) {
        this.estudiante_id = estudiante_id;
    }

    public Integer getMateria_id() {
        return materia_id;
    }

    public void setMateria_id(Integer materia_id) {
        this.materia_id = materia_id;
    }

    public Integer getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(Integer docente_id) {
        this.docente_id = docente_id;
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

    public DecimalFormat getDf() {
        return df;
    }

    public void setDf(DecimalFormat df) {
        this.df = df;
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
    
    
    
}
