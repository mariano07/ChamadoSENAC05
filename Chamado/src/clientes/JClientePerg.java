/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package clientes;

import conexao.JClienteExistente;
import conexao.JInstituicaoExistente;
import javax.swing.JDesktopPane;

/**
 *
 * @author Aluno
 */
public class JClientePerg extends javax.swing.JInternalFrame {
    private static JCliente jc = new JCliente();
    private static JInstituicao ji = new JInstituicao();
    private static JClienteExistente jce = new JClienteExistente();
    private static JInstituicaoExistente jie = new JInstituicaoExistente();
    private String patrimonio;
    /**
     * Creates new form JClientePerg
     */
    public JClientePerg() {
        initComponents();
    }
    
    public void patrimonio(String patrimonio){
        this.patrimonio = patrimonio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        check_pf = new javax.swing.JCheckBox();
        check_pj = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        check_pfExis = new javax.swing.JCheckBox();
        check_pjexis = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cliente");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/group_link.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        check_pf.setBackground(new java.awt.Color(51, 51, 51));
        check_pf.setForeground(new java.awt.Color(255, 255, 255));
        check_pf.setText("Pessoa Física");
        check_pf.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_pfStateChanged(evt);
            }
        });

        check_pj.setBackground(new java.awt.Color(51, 51, 51));
        check_pj.setForeground(new java.awt.Color(255, 255, 255));
        check_pj.setText("Pessoa Jurídica");
        check_pj.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_pjStateChanged(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Avançar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        check_pfExis.setBackground(new java.awt.Color(51, 51, 51));
        check_pfExis.setForeground(new java.awt.Color(255, 255, 255));
        check_pfExis.setText("PF Existente");
        check_pfExis.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_pfExisStateChanged(evt);
            }
        });

        check_pjexis.setBackground(new java.awt.Color(51, 51, 51));
        check_pjexis.setForeground(new java.awt.Color(255, 255, 255));
        check_pjexis.setText("PJ Existente");
        check_pjexis.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_pjexisStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_pj)
                            .addComponent(check_pf)
                            .addComponent(check_pfExis)
                            .addComponent(check_pjexis))
                        .addGap(0, 210, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(check_pf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_pj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_pfExis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_pjexis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(check_pf.isSelected()){
            JDesktopPane desktop = getDesktopPane();
            desktop.add(jc);
            jc.setVisible(true);
            this.dispose();
        }else if(check_pj.isSelected()){
            JDesktopPane desktop = getDesktopPane();
            desktop.add(ji);
            ji.setVisible(true);
            this.dispose();
        }else if(check_pfExis.isSelected()){
            JDesktopPane desktop = getDesktopPane();
            desktop.add(jce);
            jce.patrimonio(this.patrimonio);
            jce.setVisible(true);
            this.dispose();
        }else if(check_pjexis.isSelected()){
            JDesktopPane desktop = getDesktopPane();
            desktop.add(jie);
            jie.patrimonio(this.patrimonio);
            jie.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void check_pfStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_pfStateChanged
        if(check_pf.isSelected()){
            check_pj.setSelected(false);
            check_pfExis.setSelected(false);
            check_pjexis.setSelected(false);
        }
    }//GEN-LAST:event_check_pfStateChanged

    private void check_pjStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_pjStateChanged
        if(check_pj.isSelected()){
            check_pf.setSelected(false);
            check_pfExis.setSelected(false);
            check_pjexis.setSelected(false);
        }
    }//GEN-LAST:event_check_pjStateChanged

    private void check_pfExisStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_pfExisStateChanged
        if(check_pfExis.isSelected()){
            check_pf.setSelected(false);
            check_pj.setSelected(false);
            check_pjexis.setSelected(false);
        }
    }//GEN-LAST:event_check_pfExisStateChanged

    private void check_pjexisStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_pjexisStateChanged
        if(check_pjexis.isSelected()){
            check_pf.setSelected(false);
            check_pj.setSelected(false);
            check_pfExis.setSelected(false);
            
        }    }//GEN-LAST:event_check_pjexisStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check_pf;
    private javax.swing.JCheckBox check_pfExis;
    private javax.swing.JCheckBox check_pj;
    private javax.swing.JCheckBox check_pjexis;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
