/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;




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
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "sucursal_id")
    //private Sucursal sucursal;

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
    


    
}
