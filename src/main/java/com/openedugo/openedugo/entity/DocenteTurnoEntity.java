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
import java.util.Objects;

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

    //constructor Vacio
    
    public DocenteTurnoEntity() {
    }
    
    //Constructor con Parametros

    public DocenteTurnoEntity(Integer docenteId, Integer turnoId, TurnoEntity turno, DocenteEntity docente) {
        this.docenteId = docenteId;
        this.turnoId = turnoId;
        this.turno = turno;
        this.docente = docente;
    }
       
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
     
    //Metodo ToString

    @Override
    public String toString() {
        return "DocenteTurnoEntity{" + "docenteId=" + docenteId + ", turnoId=" + turnoId + ", turno=" + turno + ", docente=" + docente + '}';
    }
    
    //Metodos Equals y hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.docenteId);
        hash = 29 * hash + Objects.hashCode(this.turnoId);
        hash = 29 * hash + Objects.hashCode(this.turno);
        hash = 29 * hash + Objects.hashCode(this.docente);
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
        final DocenteTurnoEntity other = (DocenteTurnoEntity) obj;
        if (!Objects.equals(this.docenteId, other.docenteId)) {
            return false;
        }
        if (!Objects.equals(this.turnoId, other.turnoId)) {
            return false;
        }
        if (!Objects.equals(this.turno, other.turno)) {
            return false;
        }
        return Objects.equals(this.docente, other.docente);
    }
    
}
