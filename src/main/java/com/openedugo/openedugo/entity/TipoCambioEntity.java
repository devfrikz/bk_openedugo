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

@Entity
@Table(name = "tipo_cambio")

public class TipoCambioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "tc_id")
    private Integer id;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "tasa")
    private Double tasa;

    // Keys
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "moneda_id")
    private MonedaEntity moneda;

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

    public Double getTasa() {
        return tasa;
    }

    public void setTasa(Double tasa) {
        this.tasa = tasa;
    }

}
