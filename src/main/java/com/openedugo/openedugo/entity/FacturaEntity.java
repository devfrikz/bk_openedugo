package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "facturas")

public class FacturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "factura_id")
    private double id;
    
    @Column(name = "fecha_emision")

    private Date fechaEmision;

    @Column(name = "total")

    private Double total;

    
    @Column(name = "estado", nullable = true)
    @Enumerated(EnumType.STRING)
    private String estado;
    
    
    // Keys
     
     
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id")
    private EstudianteEntity estudiante;
    
     
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "moneda_id")
    private MonedaEntity moneda;  
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_pago_id")
    private TipoPagoEntity tipoPago;
    
    // getter and setter
    

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    public void setTotal(Double total) {
        this.total = total;
    }

}
