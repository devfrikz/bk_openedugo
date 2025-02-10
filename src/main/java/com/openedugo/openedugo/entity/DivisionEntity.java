package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 * División de un grado.
 *
 * Error corregido: Se eliminó el mapeo duplicado de la columna "grado_id".
 * Antes se tenía tanto el campo "gradoId" como la relación ManyToOne que usaba la misma columna.
 * Ahora se utiliza únicamente la relación "grado" para mapear la columna "grado_id".
 *
 * Esta solución evita que Hibernate intente mapear dos veces la misma columna.
 *
 * @author websuke
 */
@Entity
@Table(name = "divisiones")
public class DivisionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Integer divisionId;

    @Column(name = "nombre", nullable = false, length = 10)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "grado_id", nullable = false)
    private GradoEntity grado;

    // Constructor vacío
    public DivisionEntity() {
    }

    // Constructor con parámetros
    public DivisionEntity(Integer divisionId, String nombre, GradoEntity grado) {
        this.divisionId = divisionId;
        this.nombre = nombre;
        this.grado = grado;
    }

    // Getters y Setters
    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GradoEntity getGrado() {
        return grado;
    }

    public void setGrado(GradoEntity grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "DivisionEntity{" + "divisionId=" + divisionId + ", nombre=" + nombre + ", grado=" + grado + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.divisionId);
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.grado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final DivisionEntity other = (DivisionEntity) obj;
        if (!Objects.equals(this.nombre, other.nombre))
            return false;
        if (!Objects.equals(this.divisionId, other.divisionId))
            return false;
        return Objects.equals(this.grado, other.grado);
    }
}
