/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author zuhey
 */
public class Personas {
   // Atributos
    private String nombres, apellidos, direccion, telefono, fecha;
    // Constructores
    
    public Personas(){}
    public Personas(String nombres, String apellidos, String direccion, String telefono, String fecha) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha = fecha;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    // metodos crud
    protected String [] crear() {return null;}
    protected void leer (){}
    protected void actualizar (){}
    protected void eliminar (){}
    
}