package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DocenteTurnoId implements Serializable {

    @Column(name = "docente_id")
    private Integer docenteId;

    @Column(name = "turno_id")
    private Integer turnoId;

    public DocenteTurnoId() {}

    public DocenteTurnoId(Integer docenteId, Integer turnoId) {
        this.docenteId = docenteId;
        this.turnoId = turnoId;
    }

    // Getters y Setters
    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public Integer getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(Integer turnoId) {
        this.turnoId = turnoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DocenteTurnoId)) return false;
        DocenteTurnoId that = (DocenteTurnoId) o;
        return Objects.equals(docenteId, that.docenteId) &&
                Objects.equals(turnoId, that.turnoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docenteId, turnoId);
    }
}
