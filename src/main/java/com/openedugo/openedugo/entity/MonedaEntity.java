
package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "monedas")

public class MonedaEntity {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     
     @Column(name="moneda_id")
     private Integer id;
     
     @Column(name="codigo",nullable=false,length=3)
     private String codigo;
     
     @Column(name="simbolo",length=5)
     private String simbolo;
     
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

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
     
     
    
}
