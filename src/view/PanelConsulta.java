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
        initComponents();
        this.viewModel = viewModel;
        cargarPacientesYMedicos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMotivoConsulta = new javax.swing.JTextField();
        btnRegistroConsulta = new javax.swing.JButton();
        ComboMedico = new javax.swing.JComboBox<>();
        ComboPaciente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        txtMotivoConsulta.setText("Descripccion de su cita");
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

        ComboMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMedicoActionPerformed(evt);
            }
        });

        ComboPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPacienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione paciente:");

        jLabel2.setText("Seleccione Medico:");

        jLabel3.setText("Motivo de su consulta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnRegistroConsulta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistroConsulta)
                .addContainerGap(53, Short.MAX_VALUE))
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
            ComboPaciente.addItem(p);
        }
        for(Medico m : viewModel.obtenerTodosLosMedicos()){
            ComboMedico.addItem(m);
        }
    }
    
    private void registrarConsulta(){
        Paciente paciente = (Paciente) ComboPaciente.getSelectedItem();
        Medico medico = (Medico) ComboMedico.getSelectedItem();
        String motivotxt = txtMotivoConsulta.getText().trim();
        
        if(paciente == null || medico == null || motivotxt.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los espacios.");
            return;
        }
        
        String fecha = LocalDate.now().toString();
        String diagnostico = "Pendiente. ";
        String tratamiento = "Pendiente.";
        
        Consulta consulta = new Consulta (paciente, medico, fecha, motivotxt, diagnostico, tratamiento);
        viewModel.registroConsulta(consulta);
        JOptionPane.showMessageDialog(this, "Consulta registrada correctamente.");
        txtMotivoConsulta.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Medico> ComboMedico;
    private javax.swing.JComboBox<Paciente> ComboPaciente;
    private javax.swing.JButton btnRegistroConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtMotivoConsulta;
    // End of variables declaration//GEN-END:variables
}
