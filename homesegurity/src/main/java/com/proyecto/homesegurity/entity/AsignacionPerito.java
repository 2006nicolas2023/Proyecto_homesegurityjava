package com.proyecto.homesegurity.entity;

import com.proyecto.homesegurity.entity.enums.EstadoAsignacion;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "asignacion_perito")
public class AsignacionPerito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignacion_perito")
    private long idAsignacionPerito;

    @NotNull
    @Column(name = "fecha_asignacion", nullable = false)
    private LocalDate fechaAsignacion;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_asignacion", nullable = false, length = 20)
    private EstadoAsignacion estadoAsignacion;

    @Size(max = 300)
    @Column(name = "observaciones", length = 300)
    private String observaciones;

    // FK a PERITO
    @ManyToOne
    @JoinColumn(name = "id_perito", nullable = false)
    private Perito perito;

    // FK a AVALUOS
    @ManyToOne
    @JoinColumn(name = "id_avaluos", nullable = false)
    private Avaluos avaluos;

    // Getters y Setters
    public Long getId() {
        return idAsignacionPerito;
    }

    public void setId(Long id) {
        this.idAsignacionPerito = id;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public EstadoAsignacion getEstadoAsignacion() {
        return estadoAsignacion;
    }

    public void setEstadoAsignacion(EstadoAsignacion estadoAsignacion) {
        this.estadoAsignacion = estadoAsignacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Perito getPerito() {
        return perito;
    }

    public void setPerito(Perito perito) {
        this.perito = perito;
    }

    public Avaluos getAvaluos() {
        return avaluos;
    }

    public void setAvaluos(Avaluos avaluos) {
        this.avaluos = avaluos;
    }
}
 