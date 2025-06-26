/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User1
 */
public class Medico extends Persona{
    private String especialidad;
    private String horario;
    private String telefono;
    
    public Medico(String nombre, String documento, String correo, String especialidad, String horario, String telefono){
        super(nombre, documento, correo);
        this.especialidad = especialidad;
        this.horario = horario;
        this.telefono = telefono; 
    }
    
    public String getEspecialidad() { return especialidad; }
    public String getHorario() { return horario; }
    public String getTelefono() { return telefono; }
    
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad ; }
    public void setHorario(String horario) { this.horario = horario ; }
    public void setTelefono(String telefono) { this.telefono = telefono ; }
    
    @Override
    public String toString(){
        return nombre + " - " + documento;
    }
}
