package com.proyecto.homesegurity.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "metodologia")
public class Metodologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodologia")
    private Long id;

    @NotBlank
    @Size(max = 100)
    @Column(name = "nom_metodologia", nullable = false, length = 100)
    private String nombreMetodologia;

    @NotBlank
    @Size(max = 300)
    @Column(name = "descripcion", nullable = false, length = 300)
    private String descripcion;

    @NotBlank
    @Column(name = "objetivos", nullable = false, columnDefinition = "TEXT")
    private String objetivos;

    @NotBlank
    @Column(name = "fases_proceso", nullable = false, columnDefinition = "TEXT")
    private String fasesProceso;

    @NotBlank
    @Column(name = "herramientas", nullable = false, columnDefinition = "TEXT")
    private String herramientas;

    @NotBlank
    @Column(name = "beneficios", nullable = false, columnDefinition = "TEXT")
    private String beneficios;

    @NotBlank
    @Column(name = "recomendaciones", nullable = false, columnDefinition = "TEXT")
    private String recomendaciones;

    // GETTERS Y SETTERS
    public Long getId() { 
        return id; 
    }
    public void setId(Long id) { 
        this.id = id; 
    }

    public String getNombreMetodologia() { 
        return nombreMetodologia; 
    }
    public void setNombreMetodologia(String nombreMetodologia) { 
        this.nombreMetodologia = nombreMetodologia; 
    }

    public String getDescripcion() { 
        return descripcion; 
    }
    public void setDescripcion(String descripcion) { 
        this.descripcion = descripcion; 
    }

    public String getObjetivos() { 
        return objetivos; 
    }
    public void setObjetivos(String objetivos) { 
        this.objetivos = objetivos; 
    }

    public String getFasesProceso() { 
        return fasesProceso; 
    }
    public void setFasesProceso(String fasesProceso) { 
        this.fasesProceso = fasesProceso; 
    }

    public String getHerramientas() { 
        return herramientas; 
    }
    public void setHerramientas(String herramientas) { 
        this.herramientas = herramientas; 
    }

    public String getBeneficios() { 
        return beneficios; 
    }
    public void setBeneficios(String beneficios) { 
        this.beneficios = beneficios; 
    }

    public String getRecomendaciones() { 
        return recomendaciones; 
    }
    public void setRecomendaciones(String recomendaciones) { 
        this.recomendaciones = recomendaciones; 
    }
}
