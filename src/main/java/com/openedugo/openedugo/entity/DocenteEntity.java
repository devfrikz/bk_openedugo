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
import java.time.LocalDate;




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
    private Integer docente_id;
    
    @Column(name = "numero_profesor",nullable = false, unique = true,length = 50)
    private String numero_profesor;

    @Column(name="nombre", length = 100)
    private String nombre;
    
    @Column(name="apellidos",length = 100)
    private String apellidos;    

    @Column(name= "fecha_nacimiento")
    private LocalDate fecha_nacimiento;
    
    @Column(name="nacionalidad",length = 50)
    private String nacionalidad;
    
    @Column(name="departamento",length = 50)
    private String departamento; 
    
    @Column(name="direccion_domicilio",length = 250)
    private String direccion_domicilio; 
    
    @Column(name="cedula",length = 50)
    private String cedula; 
        
    @Column(name="telefono",length = 50)
    private String telefono; 
    
    @Column(name="celular",length = 50)
    private String celular; 

    @Column(name ="correo",length = 100)
    private String correo;
    
    @Column(name ="guia_aula",length = 100)
    private Boolean guia_aula;
    
    @Column(name ="sucursal_id")
    private Integer sucursal_id;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "sucursal_id")
    //private Sucursal sucursal;
    
    public Integer getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(Integer docente_id) {
        this.docente_id = docente_id;
    }

    public String getNumero_profesor() {
        return numero_profesor;
    }

    public void setNumero_profesor(String numero_profesor) {
        this.numero_profesor = numero_profesor;
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

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
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

    public String getDireccion_domicilio() {
        return direccion_domicilio;
    }

    public void setDireccion_domicilio(String direccion_domicilio) {
        this.direccion_domicilio = direccion_domicilio;
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

    public Boolean getGuia_aula() {
        return guia_aula;
    }

    public void setGuia_aula(Boolean guia_aula) {
        this.guia_aula = guia_aula;
    }

    public Integer getSucursal_id() {
        return sucursal_id;
    }

    public void setSucursal_id(Integer sucursal_id) {
        this.sucursal_id = sucursal_id;
    }
    

    
}
