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
@Table(name = "docente_materias")
public class DocenteMateriaEntity {

    @EmbeddedId
    private DocenteMateriaId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("docenteId") // Indica que esta relación se asocia al atributo docenteId de la clave compuesta
    @JoinColumn(name = "docente_id", nullable = false)
    private DocenteEntity docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("materiaId") // Indica que esta relación se asocia al atributo materiaId de la clave compuesta
    @JoinColumn(name = "materia_id", nullable = false)
    private MateriaEntity materia;

    // Constructor vacío
    public DocenteMateriaEntity() {}

    // Constructor con parámetros
    public DocenteMateriaEntity(DocenteMateriaId id, DocenteEntity docente, MateriaEntity materia) {
        this.id = id;
        this.docente = docente;
        this.materia = materia;
    }

    // Getters y Setters
    public DocenteMateriaId getId() {
        return id;
    }

    public void setId(DocenteMateriaId id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DocenteMateriaEntity)) return false;
        DocenteMateriaEntity that = (DocenteMateriaEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(docente, that.docente) &&
                Objects.equals(materia, that.materia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, docente, materia);
    }

    @Override
    public String toString() {
        return "DocenteMateriaEntity{" +
                "id=" + id +
                ", docente=" + docente +
                ", materia=" + materia +
                '}';
    }
}
