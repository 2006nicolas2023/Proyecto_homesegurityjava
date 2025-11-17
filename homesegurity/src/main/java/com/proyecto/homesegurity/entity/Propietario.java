package com.proyecto.homesegurity.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PROPIETARIO")
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_propietario")
    private Integer id;

    @Column private String nombre;
    @Column private String apellido;
    @Column private String tipo_documento;
    @Column private String num_documento;
    @Column private String telefono;
    @Column private String correo_electronico;
    @Column private String direccion;
    @Column private String fecha_nacimiento;
    @Column private String nacionalidad;
    @Column private String estado_civil;

    public Propietario() {}

    // getters y setters (los coloco si quieres)
}
