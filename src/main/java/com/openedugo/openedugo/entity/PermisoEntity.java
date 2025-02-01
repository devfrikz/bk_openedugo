package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "permisos")
public class PermisoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permiso_id")
    private Integer permisoId;
    
    @Column(name = "nombre", nullable = false, length = 55)
    private String nombre;
    
    @Column(name = "descripcion", nullable = true, length = 150)
    private String descripcion;

    public PermisoEntity() {
    }

    public PermisoEntity(Integer permisoId, String nombre, String descripcion) {
        this.permisoId = permisoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getPermisoId() {
        return permisoId;
    }

    public void setPermisoId(Integer permisoId) {
        this.permisoId = permisoId;
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
