package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "aulas")
public class AulaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aula_id")
    private Integer aulaId;
    
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "capacidad", nullable = true)
    private Integer capacidad;
    
    @OneToMany(mappedBy = "aula")
    @JoinColumn(name = "sucursal_id", nullable = true)
    private SucursalEntity sucursal;

    public AulaEntity() {
    }

    public AulaEntity(Integer aulaId, String nombre, Integer capacidad, SucursalEntity sucursal) {
        this.aulaId = aulaId;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.sucursal = sucursal;
    }


    public Integer getAulaId() {
        return aulaId;
    }

    public void setAulaId(Integer aulaId) {
        this.aulaId = aulaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public SucursalEntity getSucursal() {
        return sucursal;
    }

    public void setSucursal(SucursalEntity sucursal) {
        this.sucursal = sucursal;
    }

    

    @Override
    public String toString() {
        return "AulaEntity{" + "aulaId=" + aulaId + ", nombre=" + nombre + ", capacidad=" + capacidad + ", sucursalId=" + sucursal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.aulaId);
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.sucursal);
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
        final AulaEntity other = (AulaEntity) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.aulaId, other.aulaId)) {
            return false;
        }
        return Objects.equals(this.sucursal, other.sucursal);
    }

    
    
    
}
