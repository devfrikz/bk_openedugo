package com.openedugo.openedugo.entity;

import jakarta.persistence.*;
import java.sql.Date;
import java.time.Year;

@Entity
@Table(name="matriculas")
public class MatriculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="matricula_id")
    private Integer id;

    @Column(name="fecha")
    private Date fecha;

    @Column(name="ano_academico")
    private Year anoAcademico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id", insertable = false, updatable = false)
    private EstudianteEntity estudiante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "division_id")
    private DivisionEntity division;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estado_id")
    private EstadoEntity estado;

    public MatriculaEntity() {}

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

    public Year getAnoAcademico() {
        return anoAcademico;
    }

    public void setAnoAcademico(Year anoAcademico) {
        this.anoAcademico = anoAcademico;
    }
}
