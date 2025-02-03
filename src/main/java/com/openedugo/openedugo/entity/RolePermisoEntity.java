package com.openedugo.openedugo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.LinkedList;
import java.util.Objects;

@Entity
@Table(name = "roles_permisos")
public class RolePermisoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private LinkedList<RoleEntity> role;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "permiso_id", nullable = false)
    private LinkedList<PermisoEntity> permiso;

    public RolePermisoEntity() {
    }

    public RolePermisoEntity(LinkedList<RoleEntity> role, LinkedList<PermisoEntity> permiso) {
        this.role = role;
        this.permiso = permiso;
    }

    public LinkedList<RoleEntity> getRole() {
        return role;
    }

    public void setRole(LinkedList<RoleEntity> role) {
        this.role = role;
    }

    public LinkedList<PermisoEntity> getPermiso() {
        return permiso;
    }

    public void setPermiso(LinkedList<PermisoEntity> permiso) {
        this.permiso = permiso;
    }

    @Override
    public String toString() {
        return "RolePermisoEntity{" + "role=" + role + ", permiso=" + permiso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.role);
        hash = 37 * hash + Objects.hashCode(this.permiso);
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
        final RolePermisoEntity other = (RolePermisoEntity) obj;
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        return Objects.equals(this.permiso, other.permiso);
    }
    
    
}
