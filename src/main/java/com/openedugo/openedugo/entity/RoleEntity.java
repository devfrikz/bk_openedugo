package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")

public class RoleEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;
    
    @Column(name = "nombre", nullable = false, length = 55)
    private String nombre;
    
    @Column(name = "descripcion", nullable = true, length = 150)
    private String descripcion;

    public RoleEntity() {
    }

    public RoleEntity(Integer roleId, String nombre, String descripcion) {
        this.roleId = roleId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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

    @Override
    public String toString() {
        return "RoleEntity{" + "roleId=" + roleId + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

    
}
