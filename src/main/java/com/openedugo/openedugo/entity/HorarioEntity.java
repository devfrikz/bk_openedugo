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
import java.sql.Time;
import java.util.Objects;


/**
 *
 * @author websuke
 */

@Entity
@Table (name = "horarios")
public class HorarioEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "horario_id")
    private Integer horarioId;
    
    @Column(name = "docente_id",nullable = false)
    private Integer docenteId;
    
    @Column(name = "materia_id",nullable = false)
    private Integer materiaId;
    
    @Column(name = "aula_id",nullable = false)
    private Integer aulaId;
    
    @Column(name = "turno_id",nullable = false)
    private Integer turnoId;

    @Column(name="dia_semana", length = 15)
    private String diaSemana;
    
    @Column(name="hora_inicio")
    private Time horaInicio;    

    @Column(name="hora_fin")
    private Time horaFin;  
        
    @Column(name ="division_id")
    private Integer divisionId;
    
    //**llave foraneas**//
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "docente_id")
    private DocenteEntity docente;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_id")
    private MateriaEntity materia;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aula_id")
    private AulaEntity aula;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "turno_id")
    private TurnoEntity turno;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "division_id")
    private DivisionEntity division;
    
    //Constructor Vacio
    
    public HorarioEntity() {
    }

    //Constructor Con Parametros

    public HorarioEntity(Integer horarioId, Integer docenteId, Integer materiaId, Integer aulaId, Integer turnoId, String diaSemana, Time horaInicio, Time horaFin, Integer divisionId, DocenteEntity docente, MateriaEntity materia, AulaEntity aula, TurnoEntity turno, DivisionEntity division) {
        this.horarioId = horarioId;
        this.docenteId = docenteId;
        this.materiaId = materiaId;
        this.aulaId = aulaId;
        this.turnoId = turnoId;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.divisionId = divisionId;
        this.docente = docente;
        this.materia = materia;
        this.aula = aula;
        this.turno = turno;
        this.division = division;
    }
    
    //** Declaracion de getter y setter **//
    public Integer getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Integer horarioId) {
        this.horarioId = horarioId;
    }

    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public Integer getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Integer materiaId) {
        this.materiaId = materiaId;
    }

    public Integer getAulaId() {
        return aulaId;
    }

    public void setAulaId(Integer aulaId) {
        this.aulaId = aulaId;
    }

    public Integer getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(Integer turnoId) {
        this.turnoId = turnoId;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    //Metodo ToString

    @Override
    public String toString() {
        return "HorarioEntity{" + "horarioId=" + horarioId + ", docenteId=" + docenteId + ", materiaId=" + materiaId + ", aulaId=" + aulaId + ", turnoId=" + turnoId + ", diaSemana=" + diaSemana + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", divisionId=" + divisionId + ", docente=" + docente + ", materia=" + materia + ", aula=" + aula + ", turno=" + turno + ", division=" + division + '}';
    }
    
    //Metodos Equals y hashcode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.horarioId);
        hash = 23 * hash + Objects.hashCode(this.docenteId);
        hash = 23 * hash + Objects.hashCode(this.materiaId);
        hash = 23 * hash + Objects.hashCode(this.aulaId);
        hash = 23 * hash + Objects.hashCode(this.turnoId);
        hash = 23 * hash + Objects.hashCode(this.diaSemana);
        hash = 23 * hash + Objects.hashCode(this.horaInicio);
        hash = 23 * hash + Objects.hashCode(this.horaFin);
        hash = 23 * hash + Objects.hashCode(this.divisionId);
        hash = 23 * hash + Objects.hashCode(this.docente);
        hash = 23 * hash + Objects.hashCode(this.materia);
        hash = 23 * hash + Objects.hashCode(this.aula);
        hash = 23 * hash + Objects.hashCode(this.turno);
        hash = 23 * hash + Objects.hashCode(this.division);
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
        final HorarioEntity other = (HorarioEntity) obj;
        if (!Objects.equals(this.diaSemana, other.diaSemana)) {
            return false;
        }
        if (!Objects.equals(this.horarioId, other.horarioId)) {
            return false;
        }
        if (!Objects.equals(this.docenteId, other.docenteId)) {
            return false;
        }
        if (!Objects.equals(this.materiaId, other.materiaId)) {
            return false;
        }
        if (!Objects.equals(this.aulaId, other.aulaId)) {
            return false;
        }
        if (!Objects.equals(this.turnoId, other.turnoId)) {
            return false;
        }
        if (!Objects.equals(this.horaInicio, other.horaInicio)) {
            return false;
        }
        if (!Objects.equals(this.horaFin, other.horaFin)) {
            return false;
        }
        if (!Objects.equals(this.divisionId, other.divisionId)) {
            return false;
        }
        if (!Objects.equals(this.docente, other.docente)) {
            return false;
        }
        if (!Objects.equals(this.materia, other.materia)) {
            return false;
        }
        if (!Objects.equals(this.aula, other.aula)) {
            return false;
        }
        if (!Objects.equals(this.turno, other.turno)) {
            return false;
        }
        return Objects.equals(this.division, other.division);
    }
    
    
    
}
