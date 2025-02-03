package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "roles_permisos")
public class RolePermisoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "role_id", nullable = false)
    private Integer roleId;
            
    @Column(name = "permiso_id", nullable = false)
    private Integer permisoId;

    public RolePermisoEntity() {
    }

    public RolePermisoEntity(Integer roleId, Integer permisoId) {
        this.roleId = roleId;
        this.permisoId = permisoId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermisoId() {
        return permisoId;
    }

    public void setPermisoId(Integer permisoId) {
        this.permisoId = permisoId;
    }

    @Override
    public String toString() {
        return "RolePermisoEntity{" + "roleId=" + roleId + ", permisoId=" + permisoId + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.roleId);
        hash = 37 * hash + Objects.hashCode(this.permisoId);
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
        if (!Objects.equals(this.roleId, other.roleId)) {
            return false;
        }
        return Objects.equals(this.permisoId, other.permisoId);
    }
    
    
}
