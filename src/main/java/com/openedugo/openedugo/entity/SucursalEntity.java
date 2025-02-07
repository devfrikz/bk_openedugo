package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="sucursales")

public class SucursalEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sucursal_id")
    private Integer sucursalId;
    
    @Column(name = "nombre", nullable = false, length = 55)
    private String nombre;
    
    @Column(name = "direccion", nullable = true, length = 255)
    private String direccion;
    
    @Column(name = "telefono", nullable = true, length = 25)
    private String telefono;
    
    // Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    private AulaEntity aula;
    
    @OneToOne(fetch = FetchType.LAZY)
    private EstudianteEntity estudiante;

    public SucursalEntity() {
    }

    public SucursalEntity(Integer sucursalId, String nombre, String direccion, String telefono) {
        this.sucursalId = sucursalId;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    
    public Integer getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "SucursalEntity{" + "sucursalId=" + sucursalId + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.sucursalId);
        hash = 67 * hash + Objects.hashCode(this.nombre);
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
        final SucursalEntity other = (SucursalEntity) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.sucursalId, other.sucursalId);
    }
    
    
}
