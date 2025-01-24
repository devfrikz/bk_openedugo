
package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.time.Year;

@Entity
@Table(name="matriculas")

public class MatriculaEntity {
    
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name="matricula_id")
    private Integer id;
  
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "estudiante_id",nullable = false)
    //private Estudiante estudiante;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "estado_id")
    //private Estado estado;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "division_id")
    //private Division division;
    
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="ano_academico")
    private Year ano_academico;
    
 
    // Getter y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Year getAno_academico() {
        return ano_academico;
    }

    public void setAno_academico(Year ano_academico) {
        this.ano_academico = ano_academico;
    }
    
    
    
    
    
    
}
