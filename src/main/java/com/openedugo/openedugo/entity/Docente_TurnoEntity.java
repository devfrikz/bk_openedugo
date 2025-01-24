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

/**
 *
 * @author websuke
 */
@Entity
@Table (name = "docente_turnos")

public class Docente_TurnoEntity {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "docente_id", nullable = false)
    private Integer docente_id;
    
     @Column(name = "turno_id", nullable = false)
    private Integer turno_id;
     
         
    /**Declarar llaves foraneas*/ 

    public Integer getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(Integer docente_id) {
        this.docente_id = docente_id;
    }

    public Integer getTurno_id() {
        return turno_id;
    }

    public void setTurno_id(Integer turno_id) {
        this.turno_id = turno_id;
    }
 
     
     
}
