
package com.openedugo.openedugo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name="facturas")

public class FacturaEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "factura_id")
  private double id;
  //@columnn(name = "estudiante_id", nullable = false , unique = true, )
   
  @Column (name ="fecha_emision")
  
  private Date fechaEmision;
  
  @Column(name = "total")
  
  private Double total;
  
  // Como funcionan las relaciones One to Many / Many to one / one to one / Many to Many
  
  
  //@Column("moneda_id")
  //@Column("tipo_pago_id")
  //@Column("estado")

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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
  
  
  
  
  
  
}
