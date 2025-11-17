package com.proyecto.homesegurity.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "REPORTE_ARRIENDO")
public class Reporte_Arriendo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_reporte")
    private Integer id;

    @Column private Double valor_arriendo;
    @Column private Double gasto_administracion;
    @Column private Double gasto_poliza;
    @Column private Double valor_propietario;
    @Column private String fecha_calculo;

    @ManyToOne
    @JoinColumn(name = "Id_vivienda")
    private Vivienda vivienda;
}
