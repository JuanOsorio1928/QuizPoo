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
                if (datos.length == 3) {
                    medicos.add(new Medico(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5])); 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}