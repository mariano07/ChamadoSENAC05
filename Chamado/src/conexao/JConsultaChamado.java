/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class JConsultaChamado extends javax.swing.JInternalFrame {

    private final static String chave="@#ch4m@d0$3n4cr3$tr1t0#@";
    private final static String url ="jdbc:mysql://172.20.126.128:3306/ChamadoSENAC";
    private final static String username ="chamado";
    private final static String password ="root";
    Connection conexao = null;
    Connection con = conexao;
    Statement st = null;
    ResultSet result = null;
    
    public JConsultaChamado() {
        initComponents();
    }
    private void Hidden(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Alterar = new javax.swing.JButton();
        text_Consulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List_Pendencias = new javax.swing.JList<>();
        check_FIltros = new javax.swing.JCheckBox();
        check_Consultas = new javax.swing.JCheckBox();
        box_Patrimonio = new javax.swing.JComboBox<>();
        box_Matricula = new javax.swing.JComboBox<>();
        box_Data = new javax.swing.JComboBox<>();
        box_status = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);

        Button_Alterar.setText("Alternar lista");
        Button_Alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_AlterarMouseClicked(evt);
            }
        });

        text_Consulta.setText("Pesquisar...                       ");
        text_Consulta.setPreferredSize(new java.awt.Dimension(236, 25));
        text_Consulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_ConsultaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_ConsultaFocusLost(evt);
            }
        });

        jScrollPane1.setViewportView(List_Pendencias);

        check_FIltros.setText("Filtros");
        check_FIltros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_FIltrosStateChanged(evt);
            }
        });

        check_Consultas.setText("Consultar");
        check_Consultas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_ConsultasStateChanged(evt);
            }
        });

        box_Patrimonio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patrimonio" }));
        box_Patrimonio.setToolTipText("");
        box_Patrimonio.setName(""); // NOI18N

        box_Matricula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matricula" }));

        box_Data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Data" }));

        box_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "Todos", "Conc", "Pend" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Button_Alterar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(check_FIltros)
                                .addGap(18, 18, 18)
                                .addComponent(box_Patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(box_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(box_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(box_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(check_Consultas)
                                .addGap(18, 18, 18)
                                .addComponent(text_Consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_Consultas)
                    .addComponent(text_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_FIltros)
                    .addComponent(box_Patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Alterar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_AlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AlterarMouseClicked
       
    }//GEN-LAST:event_Button_AlterarMouseClicked

    private void check_ConsultasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_ConsultasStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_check_ConsultasStateChanged

    private void check_FIltrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_FIltrosStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_check_FIltrosStateChanged

    private void text_ConsultaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ConsultaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ConsultaFocusGained

    private void text_ConsultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ConsultaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ConsultaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Alterar;
    private javax.swing.JList<String> List_Pendencias;
    private javax.swing.JComboBox<String> box_Data;
    private javax.swing.JComboBox<String> box_Matricula;
    private javax.swing.JComboBox<String> box_Patrimonio;
    private javax.swing.JComboBox<String> box_status;
    private javax.swing.JCheckBox check_Consultas;
    private javax.swing.JCheckBox check_FIltros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField text_Consulta;
    // End of variables declaration//GEN-END:variables
}
