package com.openedugo.openedugo.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "sucursales")
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

    // ❌ ERROR: @ManyToOne en AulaEntity no es correcto porque una sucursal puede tener muchas aulas
    // ✅ SOLUCIÓN: Usamos @OneToMany en la lista de aulas con mappedBy = "sucursal"
    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AulaEntity> aulas;

    public SucursalEntity() {}

    public SucursalEntity(Integer sucursalId, String nombre, String direccion, String telefono) {
        this.sucursalId = sucursalId;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getSucursalId() { return sucursalId; }
    public void setSucursalId(Integer sucursalId) { this.sucursalId = sucursalId; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public List<AulaEntity> getAulas() { return aulas; }
    public void setAulas(List<AulaEntity> aulas) { this.aulas = aulas; }

    @Override
    public String toString() {
        return "SucursalEntity{" + "sucursalId=" + sucursalId + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(sucursalId, nombre, direccion, telefono);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SucursalEntity other = (SucursalEntity) obj;
        return Objects.equals(sucursalId, other.sucursalId) &&
                Objects.equals(nombre, other.nombre) &&
                Objects.equals(direccion, other.direccion) &&
                Objects.equals(telefono, other.telefono);
    }
}
