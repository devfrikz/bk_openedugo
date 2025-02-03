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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 *
 * @author websuke
 */
@Entity
@Table (name = "docente_turnos")

public class DocenteTurnoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "docente_id", nullable = false)
    private Integer docenteId;
    
     @Column(name = "turno_id", nullable = false)
    private Integer turnoId;
     
              
    /**Declarar llaves foraneas**/ 
     
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "turno_id")
    private TurnoEntity turno;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "docente_id")
    private DocenteEntity docente;

 /** Declaracion de getter y setter **/
    
    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public Integer getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(Integer turnoId) {
        this.turnoId = turnoId;
    }
     
 
}
