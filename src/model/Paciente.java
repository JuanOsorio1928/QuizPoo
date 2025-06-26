/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Juan Osorio
 */
public class Paciente extends Persona{
    private String eps;
    
    public Paciente(String nombre, String documento, String correo, String eps) {
        super(nombre, documento, correo);
        this.eps = eps;
    }
    
    public String getEps () { return eps; }
    
    public void setEps (String eps) {this.eps = eps; }
    
    @Override
    public String toString(){
        return nombre + " - " + documento;
    }
}
