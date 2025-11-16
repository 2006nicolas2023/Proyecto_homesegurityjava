package com.proyecto.homesegurity.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "avaluos")
public class Avaluos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_avaluos")
    private Long idAvaluos;

    @NotNull
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @NotBlank
    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @NotNull
    @Column(name = "valor", nullable = false)
    private Double valor;

    @NotBlank
    @Column(name = "metodo_utilizado", nullable = false, length = 100)
    private String metodoUtilizado;

    @NotNull
    @Column(name = "anio", nullable = false)
    private Integer anio;

    @NotBlank
    @Column(name = "estado", nullable = false, length = 20)
    private String estado;

    @Column(name = "observaciones", columnDefinition = "TEXT")
    private String observaciones;

    @Column(name = "comparativo", columnDefinition = "TEXT")
    private String comparativo;

    @Column(name = "reposicion", columnDefinition = "TEXT")
    private String reposicion;

    // ------- RELACIONES --------

    // FK a vivienda
    //@ManyToOne
    //@JoinColumn(name = "id_vivienda", nullable = false)
    //private Vivienda vivienda;

    // FK a metodologia
    @ManyToOne
    @JoinColumn(name = "id_metodologia", nullable = false)
    private Metodologia metodologia;

    // GETTERS Y SETTERS

    public Long getId() { 
        return idAvaluos; 
    }
    public void setId(Long id) { 
        this.idAvaluos = id; 
    }

    public LocalDate getFecha() { 
        return fecha; 
    }
    public void setFecha(LocalDate fecha) { 
        this.fecha = fecha; 
    }

    public String getTipo() { 
        return tipo; 
    }
    public void setTipo(String tipo) { 
        this.tipo = tipo; 
    }

    public Double getValor() { 
        return valor; 
    }
    public void setValor(Double valor) { 
        this.valor = valor; 
    }

    public String getMetodoUtilizado() { 
        return metodoUtilizado; 
    }
    public void setMetodoUtilizado(String metodoUtilizado) { 
        this.metodoUtilizado = metodoUtilizado; 
    }

    public Integer getAnio() { 
        return anio; 
    }
    public void setAnio(Integer anio) { 
        this.anio = anio; 
    }

    public String getEstado() { 
        return estado; 
    }
    public void setEstado(String estado) { 
        this.estado = estado; 
    }

    public String getObservaciones() { 
        return observaciones; 
    }
    public void setObservaciones(String observaciones) { 
        this.observaciones = observaciones; 
    }

    public String getComparativo() { 
        return comparativo; 
    }
    public void setComparativo(String comparativo) { 
        this.comparativo = comparativo; 
    }

    public String getReposicion() { 
        return reposicion; 
    }
    public void setReposicion(String reposicion) { 
        this.reposicion = reposicion; 
    }

    //public Vivienda getVivienda() { 
    //return vivienda; 
    //}
    //public void setVivienda(Vivienda vivienda) { 
    //this.vivienda = vivienda;
    //}

    public Metodologia getMetodologia() { 
        return metodologia; 
    }
    public void setMetodologia(Metodologia metodologia) { 
        this.metodologia = metodologia; 
    }
}
