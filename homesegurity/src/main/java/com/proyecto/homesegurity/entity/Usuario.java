package com.proyecto.homesegurity.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String primerNombre;
    private String primerApellido;
    private String contraseña;
    private Integer edad;
    private String correo;
    private String telefono;
    private String direccion;
    private String Num_Documento;
    private String Estado_Cuenta;

    public Usuario() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getPrimerNombre() { return primerNombre; }
    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }


    public String getPrimerApellido() { return primerApellido; }
    public void setPrimerApellido(String primerApellido) { this.primerApellido = primerApellido; }

    public String getNum_Documento() { return Num_Documento; }
    public void setNum_Documento(String Num_Documento) { this.Num_Documento = Num_Documento; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

     public String getEstado_Cuenta() { return Estado_Cuenta; }
    public void setEstado_Cuenta(String Estado_Cuenta) { this.Estado_Cuenta = Estado_Cuenta; }
}
