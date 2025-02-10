package com.openedugo.openedugo.entity;

import jakarta.persistence.*;
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

    // ❌ ERROR: @OneToMany no es correcto aquí
    // ✅ SOLUCIÓN: Cambiado a @ManyToOne porque muchas aulas pueden pertenecer a una sucursal
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sucursal_id", nullable = true)
    private SucursalEntity sucursal;

    public AulaEntity() {}

    public AulaEntity(Integer aulaId, String nombre, Integer capacidad, SucursalEntity sucursal) {
        this.aulaId = aulaId;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.sucursal = sucursal;
    }

    public Integer getAulaId() { return aulaId; }
    public void setAulaId(Integer aulaId) { this.aulaId = aulaId; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getCapacidad() { return capacidad; }
    public void setCapacidad(Integer capacidad) { this.capacidad = capacidad; }

    public SucursalEntity getSucursal() { return sucursal; }
    public void setSucursal(SucursalEntity sucursal) { this.sucursal = sucursal; }

    @Override
    public String toString() {
        return "AulaEntity{" + "aulaId=" + aulaId + ", nombre=" + nombre + ", capacidad=" + capacidad + ", sucursal=" + sucursal + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(aulaId, nombre, capacidad, sucursal);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AulaEntity other = (AulaEntity) obj;
        return Objects.equals(aulaId, other.aulaId) &&
                Objects.equals(nombre, other.nombre) &&
                Objects.equals(capacidad, other.capacidad) &&
                Objects.equals(sucursal, other.sucursal);
    }
}
