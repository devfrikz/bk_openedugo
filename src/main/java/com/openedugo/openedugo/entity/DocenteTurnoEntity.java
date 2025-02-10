package com.openedugo.openedugo.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "docente_turnos")
public class DocenteTurnoEntity {

    @EmbeddedId
    private DocenteTurnoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("docenteId")
    @JoinColumn(name = "docente_id", nullable = false)
    private DocenteEntity docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("turnoId")
    @JoinColumn(name = "turno_id", nullable = false)
    private TurnoEntity turno;

    // Constructor vacío
    public DocenteTurnoEntity() {}

    // Constructor con parámetros
    public DocenteTurnoEntity(DocenteTurnoId id, DocenteEntity docente, TurnoEntity turno) {
        this.id = id;
        this.docente = docente;
        this.turno = turno;
    }

    // Getters y Setters
    public DocenteTurnoId getId() {
        return id;
    }

    public void setId(DocenteTurnoId id) {
        this.id = id;
    }

    public DocenteEntity getDocente() {
        return docente;
    }

    public void setDocente(DocenteEntity docente) {
        this.docente = docente;
    }

    public TurnoEntity getTurno() {
        return turno;
    }

    public void setTurno(TurnoEntity turno) {
        this.turno = turno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DocenteTurnoEntity)) return false;
        DocenteTurnoEntity that = (DocenteTurnoEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(docente, that.docente) &&
                Objects.equals(turno, that.turno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, docente, turno);
    }

    @Override
    public String toString() {
        return "DocenteTurnoEntity{" +
                "id=" + id +
                ", docente=" + docente +
                ", turno=" + turno +
                '}';
    }
}
