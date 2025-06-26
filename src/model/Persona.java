/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;
/**
 *
 * @author Juan Osorio
 */
public abstract class Persona {
    protected String nombre;
    protected String documento;
    protected String correo;
    
    public Persona(String nombre, String documento, String correo) {
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
    }
    
    public String getNombre(){ return nombre; }
    public String getDocumento(){ return documento; }
    public String getCorreo(){ return correo; }
    
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDocumento(String documento) { this.documento = documento; }
    public void setCorreo(String correo) { this.correo = correo; }
    
    @Override
    public String toString() {
        return nombre + " - " + documento + " - " + correo + ". ";
    }
}
