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
import java.sql.Time;


/**
 *
 * @author websuke
 */

@Entity
@Table (name = "horarios")
public class HorarioEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "horario_id")
    private Integer horarioId;
    
    @Column(name = "docente_id",nullable = false)
    private Integer docenteId;
    
    @Column(name = "materia_id",nullable = false)
    private Integer materiaId;
    
    @Column(name = "aula_id",nullable = false)
    private Integer aulaId;
    
    @Column(name = "turno_id",nullable = false)
    private Integer turnoId;

    @Column(name="dia_semana", length = 15)
    private String diaSemana;
    
    @Column(name="hora_inicio")
    private Time horaInicio;    

    @Column(name="hora_fin")
    private Time horaFin;  
        
    @Column(name ="division_id")
    private Integer divisionId;
    
    //**llave foraneas**//
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "docente_id")
    //private Docente docente;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "materia_id")
    //private Materia materia;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "aula_id")
    //private Aula aula;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "turno_id")
    //private Turno turno;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "division_id")
    //private Division division;

    public Integer getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Integer horarioId) {
        this.horarioId = horarioId;
    }

    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public Integer getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Integer materiaId) {
        this.materiaId = materiaId;
    }

    public Integer getAulaId() {
        return aulaId;
    }

    public void setAulaId(Integer aulaId) {
        this.aulaId = aulaId;
    }

    public Integer getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(Integer turnoId) {
        this.turnoId = turnoId;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }


    
}
