package com.proyecto.homesegurity.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "GESTION_ASESORIA")
public class Gestion_Asesoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_gestion")
    private Integer id;

    @Column private String fecha;
    @Column private String hora;
    @Column private String lugar;
    @Column private String observacion;
    @Column private String estado;

    @ManyToOne
    @JoinColumn(name = "Id_negociacion")
    private Negociacion negociacion;

    @ManyToOne
    @JoinColumn(name = "Id_cliente")
    private Propietario cliente;

    @ManyToOne
    @JoinColumn(name = "Id_agente")
    private Propietario agente;
}
