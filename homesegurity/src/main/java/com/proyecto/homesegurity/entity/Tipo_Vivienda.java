package com.proyecto.homesegurity.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TIPO_VIVIENDA")
public class Tipo_Vivienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_tipo_vivienda")
    private Integer id;

    @Column(name = "Nombre_Tipo", nullable = false, length = 100)
    private String nombreTipo;

    @Column(name = "Descripcion", length = 255)
    private String descripcion;

    public Tipo_Vivienda() {}

    public Tipo_Vivienda(String nombreTipo, String descripcion) {
        this.nombreTipo = nombreTipo;
        this.descripcion = descripcion;
    }

    public Integer getId() { return id; }
    public String getNombreTipo() { return nombreTipo; }
    public void setNombreTipo(String nombreTipo) { this.nombreTipo = nombreTipo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
