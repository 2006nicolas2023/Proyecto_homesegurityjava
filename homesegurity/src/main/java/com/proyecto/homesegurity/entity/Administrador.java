package com.proyecto.homesegurity.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "administrador")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrador")
    private Integer idAdministrador;

    @Column(name = "anos_experiencia")
    private Integer anosExperiencia;

    // Relación con usuario
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Administrador() {}

    public Administrador(Integer anosExperiencia, Usuario usuario) {
        this.anosExperiencia = anosExperiencia;
        this.usuario = usuario;
    }

    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Integer getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(Integer anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
