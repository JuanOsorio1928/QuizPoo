/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import model.Clinica;
import model.Paciente;
import model.Medico;
import model.Consulta;
import java.util.List;
/**
 *
 * @author Juan Osorio
 */
public class ClinicaViewModel {
    private Clinica clinica;
    
    public ClinicaViewModel() {
        clinica = new Clinica();
    }
    
    public void registrarPaciente(Paciente paciente){
        clinica.registrarPaciente(paciente);
    }
    
    public void registrarMedico(Medico medico){
        clinica.registrarMedico(medico);
    }
    
    public void registroConsulta(Consulta consulta){
        clinica.registrarConsulta(consulta);
    }
    
    public Paciente buscarPacientePorDocumento(String documento){
        return clinica.buscarPacientePorDocumento(documento);
    }
    
    public Medico buscarMedicoPorDocumento(String documento){
        return clinica.buscarMedicoPorDocumento(documento);
    }
    
    public List<Consulta> historialPaciente(String documentoPaciente){
        return clinica.historialPaciente(documentoPaciente);
    }
    
    public List<Consulta> consultaPorMedico(String documentoMedico){
        return clinica.consultasPorMedico(documentoMedico);
    }
    
    public List<Paciente> obtenerTodosLosPacientes(){
        return clinica.getPacientes();
    }
    
    public List<Medico> obtenerTodosLosMedicos(){
        return clinica.getMedicos();
    }
    
    public List<Consulta> obtenerTodasLasConsultas(){
        return clinica.getConsultas();
    }
}
