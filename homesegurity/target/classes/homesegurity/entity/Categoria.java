package com.proyecto.homesegurity.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CATEGORIA")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_categoria")
    private Integer id;

    @Column(name = "Tipo_propiedad", nullable = false, length = 100)
    private String tipoPropiedad;

    public Categoria() {}

    public Categoria(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public Integer getId() { return id; }
    public String getTipoPropiedad() { return tipoPropiedad; }
    public void setTipoPropiedad(String tipoPropiedad) { this.tipoPropiedad = tipoPropiedad; }
}
