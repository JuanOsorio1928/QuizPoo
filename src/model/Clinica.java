/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Juan Osorio
 */
public class Clinica {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Consulta> consultas;
    
    public Clinica(){
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
        consultas = new ArrayList<>();
    }
    
    public void registrarPaciente(Paciente paciente){ pacientes.add(paciente); }
    public void registrarMedico(Medico medico){ medicos.add(medico); }
    public void registrarConsulta(Consulta consulta){ consultas.add(consulta); }
    
    public Paciente buscarPacientePorDocumento(String documento){
        for (Paciente p : pacientes){
            if (p.getDocumento().equals(documento)) return p;
        }
        return null;
    }
    
    public Medico buscarMedicoPorDocumento(String documento){
        for (Medico m : medicos){
            if (m.getDocumento().equals(documento)) return m;
        }
        return null;
    }
    
    public List<Consulta> historialPaciente(String documentoPaciente) {
        return consultas.stream()
                .filter( c -> c.getPaciente().getDocumento().equals(documentoPaciente))
                .collect(Collectors.toList());
        }
    public List<Consulta> consultasPorMedico(String documentoMedico){
        return consultas.stream()
                .filter(c -> c.getMedico().getDocumento().equals(documentoMedico))
                .collect(Collectors.toList());
        }
    
    public List<Paciente> getPacientes() { return pacientes; }
    public List<Medico> getMedicos() { return medicos; }
    public List<Consulta> getConsultas() { return consultas; }
    }

