/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;
import java.util.Objects;




/**
 *
 * @author websuke
 */
@Entity
@Table(name="docentes")
public class DocenteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "docente_id")
    private Integer docenteId;
    
    @Column(name = "numero_profesor",nullable = false, unique = true,length = 50)
    private String numeroProfesor;

    @Column(name="nombre", length = 100)
    private String nombre;
    
    @Column(name="apellidos",length = 100)
    private String apellidos;    

    @Column(name= "fecha_nacimiento")
    private Date fechaNacimiento;
    
    @Column(name="nacionalidad",length = 50)
    private String nacionalidad;
    
    @Column(name="departamento",length = 50)
    private String departamento; 
    
    @Column(name="direccion_domicilio",length = 250)
    private String direccionDomicilio; 
    
    @Column(name="cedula",length = 50)
    private String cedula; 
        
    @Column(name="telefono",length = 50)
    private String telefono; 
    
    @Column(name="celular",length = 50)
    private String celular; 

    @Column(name ="correo",length = 100)
    private String correo;
    
    @Column(name ="guia_aula",length = 100)
    private Boolean guiaAula;
    
    @Column(name ="sucursal_id")
    private Integer sucursalId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sucursal_id")
    private SucursalEntity sucursal;
    
    //constructor Vacio
    
    public DocenteEntity() {
    }

    //Constructor con Parametros
    public DocenteEntity(Integer docenteId, String numeroProfesor, String nombre, String apellidos, Date fechaNacimiento, String nacionalidad, String departamento, String direccionDomicilio, String cedula, String telefono, String celular, String correo, Boolean guiaAula, Integer sucursalId, SucursalEntity sucursal) {    
        this.docenteId = docenteId;
        this.numeroProfesor = numeroProfesor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.departamento = departamento;
        this.direccionDomicilio = direccionDomicilio;
        this.cedula = cedula;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.guiaAula = guiaAula;
        this.sucursalId = sucursalId;
        this.sucursal = sucursal;
    }

    //getter y setter
    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public String getNumeroProfesor() {
        return numeroProfesor;
    }

    public void setNumeroProfesor(String numeroProfesor) {
        this.numeroProfesor = numeroProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getGuiaAula() {
        return guiaAula;
    }

    public void setGuiaAula(Boolean guiaAula) {
        this.guiaAula = guiaAula;
    }

    public Integer getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "DocenteEntity{" + "docenteId=" + docenteId + ", numeroProfesor=" + numeroProfesor + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + ", departamento=" + departamento + ", direccionDomicilio=" + direccionDomicilio + ", cedula=" + cedula + ", telefono=" + telefono + ", celular=" + celular + ", correo=" + correo + ", guiaAula=" + guiaAula + ", sucursalId=" + sucursalId + ", sucursal=" + sucursal + '}';
    }
    
    //Metodos Equals y hashcode

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.docenteId);
        hash = 79 * hash + Objects.hashCode(this.numeroProfesor);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellidos);
        hash = 79 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 79 * hash + Objects.hashCode(this.nacionalidad);
        hash = 79 * hash + Objects.hashCode(this.departamento);
        hash = 79 * hash + Objects.hashCode(this.direccionDomicilio);
        hash = 79 * hash + Objects.hashCode(this.cedula);
        hash = 79 * hash + Objects.hashCode(this.telefono);
        hash = 79 * hash + Objects.hashCode(this.celular);
        hash = 79 * hash + Objects.hashCode(this.correo);
        hash = 79 * hash + Objects.hashCode(this.guiaAula);
        hash = 79 * hash + Objects.hashCode(this.sucursalId);
        hash = 79 * hash + Objects.hashCode(this.sucursal);
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
        final DocenteEntity other = (DocenteEntity) obj;
        if (!Objects.equals(this.numeroProfesor, other.numeroProfesor)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.departamento, other.departamento)) {
            return false;
        }
        if (!Objects.equals(this.direccionDomicilio, other.direccionDomicilio)) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.docenteId, other.docenteId)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.guiaAula, other.guiaAula)) {
            return false;
        }
        if (!Objects.equals(this.sucursalId, other.sucursalId)) {
            return false;
        }
        return Objects.equals(this.sucursal, other.sucursal);
    }
    
    
    
}
