package com.proyecto.homesegurity.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "VIVIENDA")
public class Vivienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_vivienda")
    private Integer id;

    @Column private Double metros_cuadrados;
    @Column private Integer numero_habitaciones;
    @Column private Integer numero_baños;
    @Column private String estado_inmueble;
    @Column private String direccion;
    @Column private String codigo_postal;
    @Column private Double valor_terreno;

    @ManyToOne
    @JoinColumn(name = "Id_propietario")
    private Propietario propietario;

    @ManyToOne
    @JoinColumn(name = "Id_tipo_vivienda")
    private Tipo_Vivienda tipoVivienda;

    @ManyToOne
    @JoinColumn(name = "Id_categoria")
    private Categoria categoria;

    public Vivienda() {}
}
