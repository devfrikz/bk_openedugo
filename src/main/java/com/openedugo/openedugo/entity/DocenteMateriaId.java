package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DocenteMateriaId implements Serializable {

    @Column(name = "docente_id")
    private Integer docenteId;

    @Column(name = "materia_id")
    private Integer materiaId;

    public DocenteMateriaId() {}

    public DocenteMateriaId(Integer docenteId, Integer materiaId) {
        this.docenteId = docenteId;
        this.materiaId = materiaId;
    }

    // Getters y Setters
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DocenteMateriaId)) return false;
        DocenteMateriaId that = (DocenteMateriaId) o;
        return Objects.equals(docenteId, that.docenteId) &&
                Objects.equals(materiaId, that.materiaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docenteId, materiaId);
    }
}
