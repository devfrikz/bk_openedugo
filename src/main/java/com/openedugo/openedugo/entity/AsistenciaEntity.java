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
@Table (name = "asistencia")
public class AsistenciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "asistencia_id")
    private Integer asistenciaId;
    
    @Column(name = "horario_id",nullable = false)
    private Integer horarioId;
    
    @Column(name = "estudiante_id",nullable = false)
    private Integer estudianteId;
    
    @Column(name = "fecha")
    private Date fecha;
    
    @Column(name = "presente")
    private Boolean presente;
    
    // Declaracion de llave foraneas

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "horario_id")
    private HorarioEntity horario;   
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id")
    private EstudianteEntity estudiante;
    
    //Constructor Vacio
    
    public AsistenciaEntity() {
    }

    //Constructor Con Parametros
    
    public AsistenciaEntity(Integer asistenciaId, Integer horarioId, Integer estudianteId, Date fecha, Boolean presente, HorarioEntity horario, EstudianteEntity estudiante) {
        this.asistenciaId = asistenciaId;
        this.horarioId = horarioId;
        this.estudianteId = estudianteId;
        this.fecha = fecha;
        this.presente = presente;
        this.horario = horario;
        this.estudiante = estudiante;
    }

    // Declaracion de getter y setter
    
    public Integer getAsistenciaId() {
        return asistenciaId;
    }

    public void setAsistenciaId(Integer asistenciaId) {
        this.asistenciaId = asistenciaId;
    }

    public Integer getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Integer horarioId) {
        this.horarioId = horarioId;
    }

    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getPresente() {
        return presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "AsistenciaEntity{" + "asistenciaId=" + asistenciaId + ", horarioId=" + horarioId + ", estudianteId=" + estudianteId + ", fecha=" + fecha + ", presente=" + presente + ", horario=" + horario + ", estudiante=" + estudiante + '}';
    }
    
    //Metodos Equals y hashcode

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.asistenciaId);
        hash = 23 * hash + Objects.hashCode(this.horarioId);
        hash = 23 * hash + Objects.hashCode(this.estudianteId);
        hash = 23 * hash + Objects.hashCode(this.fecha);
        hash = 23 * hash + Objects.hashCode(this.presente);
        hash = 23 * hash + Objects.hashCode(this.horario);
        hash = 23 * hash + Objects.hashCode(this.estudiante);
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
        final AsistenciaEntity other = (AsistenciaEntity) obj;
        if (!Objects.equals(this.asistenciaId, other.asistenciaId)) {
            return false;
        }
        if (!Objects.equals(this.horarioId, other.horarioId)) {
            return false;
        }
        if (!Objects.equals(this.estudianteId, other.estudianteId)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.presente, other.presente)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        return Objects.equals(this.estudiante, other.estudiante);
    }
    
    
}
