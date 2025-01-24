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
    private Integer horario_id;
    
    @Column(name = "docente_id",nullable = false)
    private Integer docente_id;
    
    @Column(name = "materia_id",nullable = false)
    private Integer materia_id;
    
    @Column(name = "aula_id",nullable = false)
    private Integer aula_id;
    
    @Column(name = "turno_id",nullable = false)
    private Integer turno_id;

    @Column(name="dia_semana", length = 15)
    private String dia_semana;
    
    @Column(name="hora_inicio")
    private Time hora_inicio;    

    @Column(name="hora_fin")
    private Time hora_fin;  
        
    @Column(name ="division_id")
    private Integer division_id;
    
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

    public Integer getHorario_id() {
        return horario_id;
    }

    public void setHorario_id(Integer horario_id) {
        this.horario_id = horario_id;
    }

    public Integer getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(Integer docente_id) {
        this.docente_id = docente_id;
    }

    public Integer getMateria_id() {
        return materia_id;
    }

    public void setMateria_id(Integer materia_id) {
        this.materia_id = materia_id;
    }

    public Integer getAula_id() {
        return aula_id;
    }

    public void setAula_id(Integer aula_id) {
        this.aula_id = aula_id;
    }

    public Integer getTurno_id() {
        return turno_id;
    }

    public void setTurno_id(Integer turno_id) {
        this.turno_id = turno_id;
    }

    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(String dia_semana) {
        this.dia_semana = dia_semana;
    }

    public Time getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Time getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Time hora_fin) {
        this.hora_fin = hora_fin;
    }

    public Integer getDivision_id() {
        return division_id;
    }

    public void setDivision_id(Integer division_id) {
        this.division_id = division_id;
    }
    
}
