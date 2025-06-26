/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import model.*;
import java.io.*;
import java.util.List;
/**
 *
 * @author Juan Osorio
 */
public class persistenciaArchivos {
    public static void guardarPacientes(List<Paciente> pacientes) {
        try (PrintWriter pw = new PrintWriter("pacientes.txt")) {
            for (Paciente p : pacientes) {
                pw.println(p.getNombre() + "," + p.getDocumento() + "," + p.getEps());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cargarPacientes(List<Paciente> pacientes) {
        pacientes.clear();
        try (BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    pacientes.add(new Paciente(datos[0], datos[1], datos[2], datos[3]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarMedicos(List<Medico> medicos) {
        try (PrintWriter pw = new PrintWriter("medicos.txt")) {
            for (Medico m : medicos) {
                pw.println(m.getNombre() + "," + m.getDocumento() + "," + m.getEspecialidad());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cargarMedicos(List<Medico> medicos) {
        medicos.clear();
        try (BufferedReader br = new BufferedReader(new FileReader("medicos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 6) {
                    medicos.add(new Medico(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5])); 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void guardarConsultas(List<Consulta> consultas) {
        consultas.clear();
        try(PrintWriter writer = new PrintWriter(new FileWriter("Consultas.txt"))) {
            for (Consulta c : consultas) {
                writer.println(c.getPaciente().getDocumento() + "; " + c.getMedico().getDocumento() + "; " + c.getFecha() + ", " + c.getSintomas() + "; " + c.getDiagnostico() + "; " + c.getTratamiento());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public static void cargarConsultas(List<Consulta> consultas, List<Paciente> pacientes, List<Medico> medicos){
        consultas.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader("consultas.txt"))){
            String linea;
            while((linea = reader.readLine()) != null){
                String[] datos = linea.split(",");
                String docPaciente = datos[0];
                String docMedico = datos[1];
                String fecha = datos[2];
                String sintomas = datos[3];
                String diagnostico = datos[4];
                String tratamiento = datos[5];
                
                Paciente paciente = null;
                Medico medico = null;
                
                for(Paciente p : pacientes){
                    if(p.getDocumento().equals(docPaciente)){
                        paciente = p;
                        break;
                    }
                }
                
                for(Medico m : medicos){
                    if(m.getDocumento().equals(docMedico)){
                        medico = m;
                        break;
                    }
                }
                
                if(paciente != null && medico != null){
                    consultas.add(new Consulta(paciente, medico, fecha, sintomas, diagnostico, tratamiento));
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}