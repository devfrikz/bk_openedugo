package com.openedugo.openedugo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "facturas")
public class FacturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "factura_id")
    private Long id;  // Se cambió de double a Long para clave primaria

    @Column(name = "fecha_emision", nullable = false)
    @Temporal(TemporalType.DATE)  // Se agregó para que Hibernate lo interprete correctamente
    private Date fechaEmision;

    @Column(name = "total", nullable = false)
    private Double total;

    // Relación con la tabla estados
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estado_id", nullable = false)  // Clave foránea a la tabla estados
    private EstadoEntity estado;

    // Relación con Estudiante
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id", nullable = false)
    private EstudianteEntity estudiante;

    // Relación con Moneda
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "moneda_id", nullable = false)
    private MonedaEntity moneda;

    // Relación con Tipo de Pago
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_pago_id", nullable = false)
    private TipoPagoEntity tipoPago;

    // Constructor vacío
    public FacturaEntity() {
    }

    // Constructor con parámetros
    public FacturaEntity(Long id, Date fechaEmision, Double total, EstadoEntity estado, EstudianteEntity estudiante, MonedaEntity moneda, TipoPagoEntity tipoPago) {
        this.id = id;
        this.fechaEmision = fechaEmision;
        this.total = total;
        this.estado = estado;
        this.estudiante = estudiante;
        this.moneda = moneda;
        this.tipoPago = tipoPago;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public EstadoEntity getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }

    public EstudianteEntity getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteEntity estudiante) {
        this.estudiante = estudiante;
    }

    public MonedaEntity getMoneda() {
        return moneda;
    }

    public void setMoneda(MonedaEntity moneda) {
        this.moneda = moneda;
    }

    public TipoPagoEntity getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPagoEntity tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "FacturaEntity{" +
                "id=" + id +
                ", fechaEmision=" + fechaEmision +
                ", total=" + total +
                ", estado=" + estado +
                ", estudiante=" + estudiante +
                ", moneda=" + moneda +
                ", tipoPago=" + tipoPago +
                '}';
    }
}
