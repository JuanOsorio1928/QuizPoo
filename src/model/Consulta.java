/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Juan Osorio
 */
public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private String sintomas;
    private String diagnostico;
    private String tratamiento;
    
    public Consulta(Paciente paciente, Medico medico, String fecha, String sintomas, String diagnostico, String tratamiento){
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha; 
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }
    
    public Paciente getPaciente(){ return paciente; }
    public Medico getMedico(){ return medico; }
    public String getFecha () {return fecha;}
    public String getSintomas () {return sintomas;}
    public String getDiagnostico () {return diagnostico;}
    public String getTratamiento () {return tratamiento;}
    
    public void setFecha (String fecha) {this.fecha = fecha; } 
    public void setSintomas (String sintomas) {this.sintomas = sintomas; }
    public void setDiagnostico (String diagnostico) {this.diagnostico = diagnostico; } 
    public void setTratamiento (String tratamiento) {this.tratamiento = tratamiento; } 
    
    public String resumenConsulta() {
        return "Paciente: " + paciente.getNombre() +
           "\nMédico: " + medico.getNombre() +
           "\nFecha: " + fecha +
           "\nSíntomas: " + sintomas +
           "\nDiagnóstico: " + diagnostico +
           "\nTratamiento: " + tratamiento;
        }
    }
