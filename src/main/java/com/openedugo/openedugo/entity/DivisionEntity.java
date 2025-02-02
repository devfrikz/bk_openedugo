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
import java.util.Objects;

/**
 *
 * @author websuke
 */

@Entity
@Table (name = "divisiones")
public class DivisionEntity {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Integer divisionId;
           
    @Column(name = "grado_id",nullable = false)
    private Integer gradoId;
    
    @Column(name = "nombre",nullable = false, length = 10)
    private String nombre;
    
    //Declaracion de llave foranea
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grado_id")
    private GradoEntity grado;
    
    //Constructor Vacio
   
    public DivisionEntity() {
    }
    
    //Constructor Con Parametros

    public DivisionEntity(Integer divisionId, Integer gradoId, String nombre, GradoEntity grado) {
        this.divisionId = divisionId;
        this.gradoId = gradoId;
        this.nombre = nombre;
        this.grado = grado;
    }

    //Declaracion de Getter y setter
    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public Integer getGradoId() {
        return gradoId;
    }

    public void setGradoId(Integer gradoId) {
        this.gradoId = gradoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "DivisionEntity{" + "divisionId=" + divisionId + ", gradoId=" + gradoId + ", nombre=" + nombre + ", grado=" + grado + '}';
    }
    
    //Metodos Equals y hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.divisionId);
        hash = 41 * hash + Objects.hashCode(this.gradoId);
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.grado);
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
        final DivisionEntity other = (DivisionEntity) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.divisionId, other.divisionId)) {
            return false;
        }
        if (!Objects.equals(this.gradoId, other.gradoId)) {
            return false;
        }
        return Objects.equals(this.grado, other.grado);
    }    
    
}
