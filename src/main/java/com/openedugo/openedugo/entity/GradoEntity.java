/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openedugo.openedugo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author websuke
 */

@Entity
@Table(name="grados")
public class GradoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grado_id")
    private Integer gradoId;
    
    @Column(name = "nombre",nullable = false, length = 55)
    private String nombre;
   
    @Column(name= "descripcion",length = 255)
    private String descripcion;

    @OneToMany(mappedBy = "grado")
    private List<DivisionEntity> divisiones = new ArrayList<>();
    //Constructor Vacio

    public GradoEntity() {
    }

    //Constructor con parametros

    public GradoEntity(Integer gradoId, String nombre, String descripcion) {
        this.gradoId = gradoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }



    // Getter y Setter
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "GradoEntity{" + "gradoId=" + gradoId + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    //Metodos Equals y hashcode

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.gradoId);
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.descripcion);
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
        final GradoEntity other = (GradoEntity) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.gradoId, other.gradoId);
    }
    
    
}
