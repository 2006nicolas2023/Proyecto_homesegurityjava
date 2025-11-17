package com.proyecto.homesegurity.entity;

import jakarta.persistence.*;
import java.util.List;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "perito")
public class Perito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perito")
    private Long idPerito;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "documento_identidad", nullable = false, length = 20)
    @Pattern(regexp = "^[0-9]+$", message = "El documento solo puede contener números")
    private String documentoIdentidad;

    @Column(name = "correo_electronico", nullable = false, length = 100)
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@(gmail|hotmail)\\.com$", message = "Solo se permiten correos Gmail o Hotmail")
    private String correoElectronico;

    @Column(name = "telefono", nullable = false, length = 20)
    @Pattern(regexp = "^[0-9]{10}$", message = "El teléfono solo puede contener números")
    private String telefono;

    @Column(name = "registro_raa", nullable = false)
    private String registroRAA;

    @Column(name = "categoria_especializacion", nullable = false)
    private String categoriaEspecializacion;

    @Column(name = "formacion_academica", nullable = false)
    private String formacionAcademica;

    @Column(name = "experiencia_anios", nullable = false)
    private String experienciaAnios;

    @Column(name = "direccion_oficina", nullable = false)
    private String direccionOficina;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false, length = 10)
    private EstadoPerito estado;

    @OneToMany(mappedBy = "perito")
    private List<AsignacionPerito> asignaciones;

    // GETTERS Y SETTERS
    public Long getIdPerito() { return idPerito; }
    public void setIdPerito(Long idPerito) { this.idPerito = idPerito; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDocumentoIdentidad() { return documentoIdentidad; }
    public void setDocumentoIdentidad(String documentoIdentidad) { this.documentoIdentidad = documentoIdentidad; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getRegistroRAA() { return registroRAA; }
    public void setRegistroRAA(String registroRAA) { this.registroRAA = registroRAA; }

    public String getCategoriaEspecializacion() { return categoriaEspecializacion; }
    public void setCategoriaEspecializacion(String categoriaEspecializacion) { this.categoriaEspecializacion = categoriaEspecializacion; }

    public String getFormacionAcademica() { return formacionAcademica; }
    public void setFormacionAcademica(String formacionAcademica) { this.formacionAcademica = formacionAcademica; }

    public String getExperienciaAnios() { return experienciaAnios; }
    public void setExperienciaAnios(String experienciaAnios) { this.experienciaAnios = experienciaAnios; }

    public String getDireccionOficina() { return direccionOficina; }
    public void setDireccionOficina(String direccionOficina) { this.direccionOficina = direccionOficina; }

    public EstadoPerito getEstado() { return estado; }
    public void setEstado(EstadoPerito estado) { this.estado = estado; }
}
