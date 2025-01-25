
package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;


@Entity
@Table(name = "tipo_cambio")


public class TipoCambioEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="tc_id")
    private Integer id;
    
    //moneda_ID already created
     //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "moneda_id")
    //private Moneda moneda;
    
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name = "tasa")
    private Double tasa;
    
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
