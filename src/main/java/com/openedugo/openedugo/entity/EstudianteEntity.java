package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "estudiantes")
public class EstudianteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estudiante_id")
    private Integer estudianteId;
    
    @Column(name = "numero_alumno", nullable = false)
    private Integer numeroAlumno;
    
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "apellido", nullable = false, length = 100)
    private String apellido;
    
    @Column(name = "fecha_nacimiento", nullable = true)
    private Date fechaNacimiento;
    
    @Column(name = "lugar_nacimiento", nullable = true, length = 100)
    private String lugarNacimiento;
    
    @Column(name = "nacionalidad", nullable = true, length = 50)
    private String nacionalidad;
    
    @Column(name = "departamento", nullable = true, length = 50)
    private String departamento;
    
    @Column(name = "direccion_domicilio", nullable = true, length = 255)
    private String direccionDomicilio;
    
    @Column(name = "distrito", nullable = true, length = 50)
    private String distrito;
    
    @Column(name = "barrio", nullable = true, length = 50)
    private String barrio;
    
    @Column(name = "centro_procedencia", nullable = true, length = 100)
    private String centroProcedencia;
    
    @Column(name = "repitente", nullable = true)
    private char repitente;
    
    @Column(name = "padecimiento", nullable = true, length = 255)
    private String padecimiento;
    
    @Column(name = "diagnosticado", nullable = true)
    private char diagnosticado;
    
    @Column(name = "estado_id", nullable = true)
    private Integer estadoId;
    
    @Column(name = "sucursal_id", nullable = true)
    private Integer sucursalId;
}
