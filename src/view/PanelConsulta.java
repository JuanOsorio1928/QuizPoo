/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import ViewModel.ClinicaViewModel;
import model.Consulta;
import model.Medico;
import model.Paciente;
import javax.swing.JOptionPane;
import java.time.LocalDate;
/**
 *
 * @author User1
 */
public class PanelConsulta extends javax.swing.JPanel {

    private ClinicaViewModel viewModel;
    
    public PanelConsulta(ClinicaViewModel viewModel) {
        this.viewModel = viewModel;
        initComponents();
        cargarPacientesYMedicos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMotivoConsulta = new javax.swing.JTextField();
        btnRegistroConsulta = new javax.swing.JButton();
        ComboMedico = new javax.swing.JComboBox<>();
        ComboPaciente = new javax.swing.JComboBox<>();

        txtMotivoConsulta.setText("jTextField1");
        txtMotivoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotivoConsultaActionPerformed(evt);
            }
        });

        btnRegistroConsulta.setText("Registrar Consulta");
        btnRegistroConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroConsultaActionPerformed(evt);
            }
        });

        ComboMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMedicoActionPerformed(evt);
            }
        });

        ComboPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ComboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnRegistroConsulta)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnRegistroConsulta)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroConsultaActionPerformed
        registrarConsulta();
    }//GEN-LAST:event_btnRegistroConsultaActionPerformed

    private void ComboMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboMedicoActionPerformed

    private void ComboPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboPacienteActionPerformed

    private void txtMotivoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotivoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotivoConsultaActionPerformed
    
    private void cargarPacientesYMedicos(){
        ComboPaciente.removeAllItems();
        ComboMedico.removeAllItems();
        
        for (Paciente p : viewModel.obtenerTodosLosPacientes()){
            ComboPaciente.addItem(p.getNombre() + " - " + p.getDocumento() + " - ");
        }
        for(Medico m : viewModel.obtenerTodosLosMedicos()){
            ComboMedico.addItem(m.getNombre() + " - " + m.getDocumento() + " - ");
        }
    }
    
    private void registrarConsulta(){
        String pacientetxt = (String) ComboPaciente.getSelectedItem();
        String medicotxt = (String) ComboMedico.getSelectedItem();
        String motivotxt = (String) txtMotivoConsulta.getText();
        
        if(pacientetxt == null || medicotxt == null || motivotxt.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los espacios.");
            return;
        }
        
        String docPaciente = pacientetxt.split(" - ")[1];
        String docMedico = medicotxt.split (" - ")[1];
        
        Paciente paciente = viewModel.buscarPacientePorDocumento(docPaciente);
        Medico medico = viewModel.buscarMedicoPorDocumento(docMedico);
        
        if (paciente == null || medico == null){
            JOptionPane.showMessageDialog(this, "paciente o medico no encontrados.");
            return;
        }
        
        String fecha = LocalDate.now().toString();
        String sintomas = motivotxt;
        String diagnostico = "Pendiente.";
        String tratamiento = "Pendiente.";
        Consulta consulta = new Consulta(paciente, medico, fecha, sintomas, diagnostico, tratamiento);
        viewModel.registroConsulta(consulta);
        JOptionPane.showMessageDialog(this, "Consulta registrada correctamente.");
        txtMotivoConsulta.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboMedico;
    private javax.swing.JComboBox<String> ComboPaciente;
    private javax.swing.JButton btnRegistroConsulta;
    private javax.swing.JTextField txtMotivoConsulta;
    // End of variables declaration//GEN-END:variables
}
