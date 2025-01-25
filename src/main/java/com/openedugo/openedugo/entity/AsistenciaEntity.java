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


/**
 *
 * @author websuke
 */

@Entity
@Table (name = "asistencia")
public class AsistenciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "asistencia_id")
    private Integer asistenciaId;
    
    @Column(name = "horario_id",nullable = false)
    private Integer horarioId;
    
    @Column(name = "estudiante_id",nullable = false)
    private Integer estudianteId;
    
    @Column(name = "fecha")
    private Date fecha;
    
    @Column(name = "presente")
    private Boolean presente;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "horario_id")
    //private Horario horario;   
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "estudiante_id")
    //private Estudiante estudiante;

    public Integer getAsistenciaId() {
        return asistenciaId;
    }

    public void setAsistenciaId(Integer asistenciaId) {
        this.asistenciaId = asistenciaId;
    }

    public Integer getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Integer horarioId) {
        this.horarioId = horarioId;
    }

    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }



    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getPresente() {
        return presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }
    
}
