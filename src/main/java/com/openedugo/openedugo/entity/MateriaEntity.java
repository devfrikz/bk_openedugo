
package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "materias")
public class MateriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "materia_id")
    private Integer id;
    
    
    @Column(name = "codigo",nullable = false, unique = true,length = 10)
     private String codigo;
     
     @Column(name="nombre",nullable=false,length = 100)
     private String nombre;
    
     @Column(name = "descripcion")
     private String descripcion;   
     
     // Keys
     
     
     
     
     // Getter y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
     
     
     
}
