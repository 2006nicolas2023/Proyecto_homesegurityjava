package com.proyecto.homesegurity.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gestion_asesoriamiento")
public class GestionAsesoriamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer idAgente;
    private Integer idCliente;
    private Integer idTipoAsesoramiento;
    private String descripcion;
    private String fecha;

    public GestionAsesoriamiento() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getIdAgente() { return idAgente; }
    public void setIdAgente(Integer idAgente) { this.idAgente = idAgente; }

    public Integer getIdCliente() { return idCliente; }
    public void setIdCliente(Integer idCliente) { this.idCliente = idCliente; }

    public Integer getIdTipoAsesoramiento() { return idTipoAsesoramiento; }
    public void setIdTipoAsesoramiento(Integer idTipoAsesoramiento) { this.idTipoAsesoramiento = idTipoAsesoramiento; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
}
