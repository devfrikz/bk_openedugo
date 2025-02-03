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
@Table (name = "docente_materias")

public class DocenteMateriaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "docente_id", nullable = false)
    private Integer docenteId;
    
     @Column(name = "materia_id", nullable = false)
    private Integer materiaId;
     
      /** Declarar llaves foraneas **/ 
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "materia_id")
    private MateriaEntity materia;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "docente_id")
    private DocenteEntity docente;
    
    //constructor Vacio

    public DocenteMateriaEntity() {
    }

    //Constructor con Parametros
    
    public DocenteMateriaEntity(Integer docenteId, Integer materiaId, MateriaEntity materia, DocenteEntity docente) {
        this.docenteId = docenteId;
        this.materiaId = materiaId;
        this.materia = materia;
        this.docente = docente;
    }

    /** Declaracion de getter y setter **/
    
    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public Integer getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Integer materiaId) {
        this.materiaId = materiaId;
    }
         
    //Metodo ToString

    @Override
    public String toString() {
        return "DocenteMateriaEntity{" + "docenteId=" + docenteId + ", materiaId=" + materiaId + ", materia=" + materia + ", docente=" + docente + '}';
    }
    
    //Metodos Equals y hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.docenteId);
        hash = 13 * hash + Objects.hashCode(this.materiaId);
        hash = 13 * hash + Objects.hashCode(this.materia);
        hash = 13 * hash + Objects.hashCode(this.docente);
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
        final DocenteMateriaEntity other = (DocenteMateriaEntity) obj;
        if (!Objects.equals(this.docenteId, other.docenteId)) {
            return false;
        }
        if (!Objects.equals(this.materiaId, other.materiaId)) {
            return false;
        }
        if (!Objects.equals(this.materia, other.materia)) {
            return false;
        }
        return Objects.equals(this.docente, other.docente);
    }
    
}
