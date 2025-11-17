package com.proyecto.homesegurity.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "NEGOCIACION")
public class Negociacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_negociacion")
    private Integer id;

    @Column private String nombre_negociacion;
    @Column private String tipo_negociacion;

    public Negociacion() {}
}
