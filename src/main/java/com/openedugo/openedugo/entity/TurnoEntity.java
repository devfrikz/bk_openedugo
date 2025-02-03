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
import java.util.Objects;

/**
 *
 * @author websuke
 */

@Entity
@Table(name="turnos")
public class TurnoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "turno_id")
    private Integer turnoId;
    
    @Column(name = "nombre",nullable = false, length = 55)
    private String nombre;
   
    @Column(name= "descripcion",length = 255)
    private String descripcion;  

    //constructor Vacio
    public TurnoEntity() {    
    }

    //Constructor con Parametros
    public TurnoEntity(Integer turnoId, String nombre, String descripcion) {    
        this.turnoId = turnoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //getter y setter
    public Integer getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(Integer turnoId) {
        this.turnoId = turnoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "TurnoEntity{" + "turnoId=" + turnoId + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    //Metodos Equals y hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.turnoId);
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.descripcion);
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
        final TurnoEntity other = (TurnoEntity) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.turnoId, other.turnoId);
    }
    
        
}
