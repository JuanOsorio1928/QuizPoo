/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Juan Osorio
 */
public class Admin extends Persona {
    private String cargo;
    
    public Admin (String nombre, String documento, String correo, String cargo){
        super (nombre, documento, correo);
        this.cargo = cargo;
    }
    
    public String getCargo () { return cargo; }
    
    public void setCargo (String cargo) {this.cargo = cargo ; }
}
