package com.openedugo.openedugo.entity;

import jakarta.persistence.*;
import java.util.Set;
import java.util.Objects;

@Entity
@Table(name = "roles_permisos")
public class RolePermisoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Se necesita un ID único en la tabla intermedia.
    private Integer id;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "roles_permisos",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permiso_id")
    )
    private Set<PermisoEntity> permisos;

    public RolePermisoEntity() {
    }

    public RolePermisoEntity(Set<PermisoEntity> permisos) {
        this.permisos = permisos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<PermisoEntity> getPermisos() {
        return permisos;
    }

    public void setPermisos(Set<PermisoEntity> permisos) {
        this.permisos = permisos;
    }

    @Override
    public String toString() {
        return "RolePermisoEntity{" + "id=" + id + ", permisos=" + permisos + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permisos);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RolePermisoEntity that = (RolePermisoEntity) obj;
        return Objects.equals(id, that.id) && Objects.equals(permisos, that.permisos);
    }
}
