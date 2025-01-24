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
    private Integer asistencia_id;
    
    @Column(name = "horario_id",nullable = false)
    private Integer horario_id;
    
    @Column(name = "estudiante_id",nullable = false)
    private Integer estudiante_id;
    
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

    public Integer getAsistencia_id() {
        return asistencia_id;
    }

    public void setAsistencia_id(Integer asistencia_id) {
        this.asistencia_id = asistencia_id;
    }

    public Integer getHorario_id() {
        return horario_id;
    }

    public void setHorario_id(Integer horario_id) {
        this.horario_id = horario_id;
    }

    public Integer getEstudiante_id() {
        return estudiante_id;
    }

    public void setEstudiante_id(Integer estudiante_id) {
        this.estudiante_id = estudiante_id;
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
