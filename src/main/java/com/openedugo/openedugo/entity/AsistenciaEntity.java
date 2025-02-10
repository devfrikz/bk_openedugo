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
 * Entidad que representa la asistencia de un estudiante.
 *
 * ERROR CORREGIDO:
 * Se eliminó el mapeo duplicado de las columnas "horario_id" y "estudiante_id".
 *
 * En la versión original se tenía:
 *   - Un campo primitivo (horarioId y estudianteId) mapeando "horario_id" y "estudiante_id"
 *   - Una relación ManyToOne que mapea las mismas columnas.
 *
 * Ahora se utilizan únicamente las relaciones:
 *   - La relación "horario" mapea la columna "horario_id".
 *   - La relación "estudiante" mapea la columna "estudiante_id".
 */
@Entity
@Table(name = "asistencia")
public class AsistenciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asistencia_id")
    private Integer asistenciaId;

    // Se eliminan los campos redundantes: horarioId y estudianteId.
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "presente")
    private Boolean presente;

    // Relaciones foráneas (las columnas se mapearán únicamente a través de estos atributos)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "horario_id", nullable = false)
    private HorarioEntity horario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id", nullable = false)
    private EstudianteEntity estudiante;

    // Constructor vacío
    public AsistenciaEntity() {
    }

    // Constructor con parámetros (se eliminaron los parámetros redundantes de tipo Integer)
    public AsistenciaEntity(Integer asistenciaId, Date fecha, Boolean presente, HorarioEntity horario, EstudianteEntity estudiante) {
        this.asistenciaId = asistenciaId;
        this.fecha = fecha;
        this.presente = presente;
        this.horario = horario;
        this.estudiante = estudiante;
    }

    // Getters y Setters
    public Integer getAsistenciaId() {
        return asistenciaId;
    }

    public void setAsistenciaId(Integer asistenciaId) {
        this.asistenciaId = asistenciaId;
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

    public HorarioEntity getHorario() {
        return horario;
    }

    public void setHorario(HorarioEntity horario) {
        this.horario = horario;
    }

    public EstudianteEntity getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteEntity estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "AsistenciaEntity{"
                + "asistenciaId=" + asistenciaId
                + ", fecha=" + fecha
                + ", presente=" + presente
                + ", horario=" + horario
                + ", estudiante=" + estudiante
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.asistenciaId);
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
