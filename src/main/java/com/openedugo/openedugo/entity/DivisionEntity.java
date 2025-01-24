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
@Table (name = "divisiones")
public class DivisionEntity {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Integer division_id;
           
    @Column(name = "grado_id",nullable = false)
    private Integer grado_id;
    
    @Column(name = "nombre",nullable = false, length = 10)
    private String nombre;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "grado_id")
    //private Grado grado;

    public Integer getDivision_id() {
        return division_id;
    }

    public void setDivision_id(Integer division_id) {
        this.division_id = division_id;
    }

    public Integer getGrado_id() {
        return grado_id;
    }

    public void setGrado_id(Integer grado_id) {
        this.grado_id = grado_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
 
}
