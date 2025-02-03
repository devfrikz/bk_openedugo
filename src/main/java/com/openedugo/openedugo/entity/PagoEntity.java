/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;


 @Entity
@Table(name = "pagos")
 
public class PagoEntity {
    
     

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pago_id")
    private Integer id;
    
    @Column(name="fecha_pago")
    private Date fechaPago;

    
   @Column(name = "monto")
    private Double monto;
   
   @Column(name="referencia_pago")
    private String referenciaPago;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "factura_id",nullable = false)
    //private facturaId factura;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "sucursal_id")
    //private metodoPagoId metodo_Pago_Id;
   
   
    // Getter and setter 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getReferenciaPago() {
        return referenciaPago;
    }

    public void setReferenciaPago(String referenciaPago) {
        this.referenciaPago = referenciaPago;
    }
   
   
   
     
}
