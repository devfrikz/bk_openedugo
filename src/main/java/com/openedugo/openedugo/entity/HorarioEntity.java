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
 * Entidad que representa un horario.
 *
 * ERROR CORREGIDO:
 * Se han eliminado los mapeos duplicados de las claves foráneas (docente_id, materia_id, aula_id, turno_id, division_id)
 * que se mapeaban tanto como campos primitivos como en las relaciones ManyToOne. Ahora se utilizan únicamente las relaciones.
 */
@Entity
@Table(name = "horarios")
public class HorarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "horario_id")
    private Integer horarioId;

    @Column(name = "dia_semana", length = 15)
    private String diaSemana;

    @Column(name = "hora_inicio")
    private Time horaInicio;

    @Column(name = "hora_fin")
    private Time horaFin;

    // Relaciones foráneas

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "docente_id", nullable = false)
    private DocenteEntity docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_id", nullable = false)
    private MateriaEntity materia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aula_id", nullable = false)
    private AulaEntity aula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "turno_id", nullable = false)
    private TurnoEntity turno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "division_id")
    private DivisionEntity division;

    // Constructor vacío
    public HorarioEntity() {
    }

    // Constructor con parámetros
    public HorarioEntity(Integer horarioId, String diaSemana, Time horaInicio, Time horaFin,
                         DocenteEntity docente, MateriaEntity materia, AulaEntity aula,
                         TurnoEntity turno, DivisionEntity division) {
        this.horarioId = horarioId;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.docente = docente;
        this.materia = materia;
        this.aula = aula;
        this.turno = turno;
        this.division = division;
    }

    // Getters y Setters
    public Integer getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Integer horarioId) {
        this.horarioId = horarioId;
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

    public DocenteEntity getDocente() {
        return docente;
    }

    public void setDocente(DocenteEntity docente) {
        this.docente = docente;
    }

    public MateriaEntity getMateria() {
        return materia;
    }

    public void setMateria(MateriaEntity materia) {
        this.materia = materia;
    }

    public AulaEntity getAula() {
        return aula;
    }

    public void setAula(AulaEntity aula) {
        this.aula = aula;
    }

    public TurnoEntity getTurno() {
        return turno;
    }

    public void setTurno(TurnoEntity turno) {
        this.turno = turno;
    }

    public DivisionEntity getDivision() {
        return division;
    }

    public void setDivision(DivisionEntity division) {
        this.division = division;
    }

    // toString
    @Override
    public String toString() {
        return "HorarioEntity{" +
                "horarioId=" + horarioId +
                ", diaSemana='" + diaSemana + '\'' +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", docente=" + docente +
                ", materia=" + materia +
                ", aula=" + aula +
                ", turno=" + turno +
                ", division=" + division +
                '}';
    }

    // equals y hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.horarioId);
        hash = 23 * hash + Objects.hashCode(this.diaSemana);
        hash = 23 * hash + Objects.hashCode(this.horaInicio);
        hash = 23 * hash + Objects.hashCode(this.horaFin);
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final HorarioEntity other = (HorarioEntity) obj;
        if (!Objects.equals(this.horarioId, other.horarioId)) {
            return false;
        }
        if (!Objects.equals(this.diaSemana, other.diaSemana)) {
            return false;
        }
        if (!Objects.equals(this.horaInicio, other.horaInicio)) {
            return false;
        }
        if (!Objects.equals(this.horaFin, other.horaFin)) {
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
