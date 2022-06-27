/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chamado;

import maquinas.JCadastro;
import clientes.JCliente;
import clientes.JInstituicao;
import conexao.JConsultaPendentes;
import defeito.jCadastroDef;
import estatisticas.JEstatisticas;
import estatisticas.JIndividual;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import login.JLogin;
import menu_ajuda.JAjuda;
import procura.JProcura;
import procura.JResultado;
import reports.JFeedback;
import reports.JReportarBug;
import tecnico.JAddTecnico;
import tecnico.JDeletaTecnico;
import tecnico.JEditarTecnico;

/**
 *
 * @author alunos
 */
public class JMain extends javax.swing.JFrame {
    private static JIndividual jsi =  new JIndividual();
    private static JEstatisticas je = new JEstatisticas();
    private static JInstituicao ji = new JInstituicao();
    private static JCliente jcl = new JCliente();
    private static JAddTecnico jt = new JAddTecnico();
    private static jCadastroDef jcd = new jCadastroDef();
    private static JCadastro jc = new JCadastro();
    private static JProcura jp = new JProcura();
    private static JResultado jr = new JResultado();
    private static JConsultaPendentes jcp = new JConsultaPendentes();
    private static JDeletaTecnico jdt = new JDeletaTecnico();
    private static JEditarTecnico jet = new JEditarTecnico();
    private static JReportarBug jrb = new JReportarBug();
    private static JFeedback jf = new JFeedback();
    private static JAjuda ja = new JAjuda();
    
    public JMain() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens_icones/senac_icone.png")));
        setExtendedState(JMain.MAXIMIZED_BOTH);
    }
    
    public String checa_cargo(String cargo,String matricula,String nome){
        if(cargo.equals("ADM")){
            JOptionPane.showMessageDialog(null, "Bem vindo "+nome+" :D");
            return matricula;
        }else if (cargo.equals("TEC")){
            JOptionPane.showMessageDialog(null, "Bem vindo "+nome+" :D");
            menu_tecnicos.setVisible(false);
            mitem_estequipe.setVisible(false);
            return matricula;
        }else{
            return matricula;
        }
    }
    
    public void setTexto(String usuario,String matricula){
        menu_nomeU.setText(usuario);
        mitem_matricula.setText(matricula);
    }
    
    private void logoff(){
        JLogin jl = new JLogin();
        jl.setVisible(true);
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        tela_principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_nomeU = new javax.swing.JMenu();
        mitem_matricula = new javax.swing.JMenuItem();
        mitem_editarUsu = new javax.swing.JMenuItem();
        mitem_ajuda = new javax.swing.JMenuItem();
        mitem_logoff = new javax.swing.JMenuItem();
        menu_report = new javax.swing.JMenu();
        mitem_bugReport = new javax.swing.JMenuItem();
        mitem_feedback = new javax.swing.JMenuItem();
        menu_chamados = new javax.swing.JMenu();
        mitem_addchamado = new javax.swing.JMenuItem();
        mitem_editchamado = new javax.swing.JMenuItem();
        menu_procurar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menu_estatisticas = new javax.swing.JMenu();
        mitem_estequipe = new javax.swing.JMenuItem();
        mitem_estind = new javax.swing.JMenuItem();
        menu_tecnicos = new javax.swing.JMenu();
        mitem_addtec = new javax.swing.JMenuItem();
        mitem_deltec = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de T.I");
        setMinimumSize(new java.awt.Dimension(1366, 768));

        tela_principal.setBackground(new java.awt.Color(51, 51, 51));
        tela_principal.setToolTipText(null);

        javax.swing.GroupLayout tela_principalLayout = new javax.swing.GroupLayout(tela_principal);
        tela_principal.setLayout(tela_principalLayout);
        tela_principalLayout.setHorizontalGroup(
            tela_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        tela_principalLayout.setVerticalGroup(
            tela_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setBorder(null);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menu_nomeU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/user_gray.png"))); // NOI18N
        menu_nomeU.setFocusable(false);
        menu_nomeU.setRolloverEnabled(false);

        mitem_matricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/vcard.png"))); // NOI18N
        mitem_matricula.setText("a");
        mitem_matricula.setToolTipText("Sua matricula");
        menu_nomeU.add(mitem_matricula);

        mitem_editarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/vcard_edit.png"))); // NOI18N
        mitem_editarUsu.setText("Editar Usuário");
        mitem_editarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_editarUsuActionPerformed(evt);
            }
        });
        menu_nomeU.add(mitem_editarUsu);

        mitem_ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/help.png"))); // NOI18N
        mitem_ajuda.setText("Menu Ajuda");
        mitem_ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_ajudaActionPerformed(evt);
            }
        });
        menu_nomeU.add(mitem_ajuda);

        mitem_logoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/cancel.png"))); // NOI18N
        mitem_logoff.setText("Deslogar");
        mitem_logoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitem_logoffMousePressed(evt);
            }
        });
        menu_nomeU.add(mitem_logoff);

        jMenuBar1.add(menu_nomeU);

        menu_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/bug.png"))); // NOI18N
        menu_report.setText("Reportar");

        mitem_bugReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/bug_add.png"))); // NOI18N
        mitem_bugReport.setText("Reportar Bug");
        mitem_bugReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_bugReportActionPerformed(evt);
            }
        });
        menu_report.add(mitem_bugReport);

        mitem_feedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/report_add.png"))); // NOI18N
        mitem_feedback.setText("Feedback");
        mitem_feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_feedbackActionPerformed(evt);
            }
        });
        menu_report.add(mitem_feedback);

        jMenuBar1.add(menu_report);

        menu_chamados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/computer.png"))); // NOI18N
        menu_chamados.setText("Chamados");

        mitem_addchamado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/computer_add.png"))); // NOI18N
        mitem_addchamado.setText("Registrar chamado");
        mitem_addchamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_addchamadoActionPerformed(evt);
            }
        });
        menu_chamados.add(mitem_addchamado);

        mitem_editchamado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/computer_edit.png"))); // NOI18N
        mitem_editchamado.setText("Editar chamado");
        menu_chamados.add(mitem_editchamado);

        jMenuBar1.add(menu_chamados);

        menu_procurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/magnifier.png"))); // NOI18N
        menu_procurar.setText("Procurar");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/magnifier.png"))); // NOI18N
        jMenuItem1.setText("Consulta Pend");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_procurar.add(jMenuItem1);

        jMenuBar1.add(menu_procurar);

        menu_estatisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/chart_curve.png"))); // NOI18N
        menu_estatisticas.setText("Estatísticas");

        mitem_estequipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/group_link.png"))); // NOI18N
        mitem_estequipe.setText("Equipe");
        mitem_estequipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_estequipeActionPerformed(evt);
            }
        });
        menu_estatisticas.add(mitem_estequipe);

        mitem_estind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/user.png"))); // NOI18N
        mitem_estind.setText("Individuais");
        mitem_estind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_estindActionPerformed(evt);
            }
        });
        menu_estatisticas.add(mitem_estind);

        jMenuBar1.add(menu_estatisticas);

        menu_tecnicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/group.png"))); // NOI18N
        menu_tecnicos.setText("Técnicos");

        mitem_addtec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/group_add.png"))); // NOI18N
        mitem_addtec.setText("Adicionar Técnico");
        mitem_addtec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_addtecActionPerformed(evt);
            }
        });
        menu_tecnicos.add(mitem_addtec);

        mitem_deltec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/group_delete.png"))); // NOI18N
        mitem_deltec.setText("Deletar Técnico");
        mitem_deltec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_deltecActionPerformed(evt);
            }
        });
        menu_tecnicos.add(mitem_deltec);

        jMenuBar1.add(menu_tecnicos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela_principal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mitem_addchamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_addchamadoActionPerformed
        if(!jc.isVisible()){
        tela_principal.add(jc);
        jc.matricula(mitem_matricula.getText(), menu_nomeU.getText());
        jc.setVisible(true);
        }
    }//GEN-LAST:event_mitem_addchamadoActionPerformed

    private void mitem_logoffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitem_logoffMousePressed
        JLogin jl = new JLogin();
        jl.setVisible(true);
        dispose();
    }//GEN-LAST:event_mitem_logoffMousePressed

    private void mitem_ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_ajudaActionPerformed
        if(!ja.isVisible()){
            tela_principal.add(ja);
            ja.setVisible(true);
      }
    }//GEN-LAST:event_mitem_ajudaActionPerformed

    private void mitem_addtecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_addtecActionPerformed
      if(!jt.isVisible()){
            tela_principal.add(jt);
            jt.setVisible(true);
      }
    }//GEN-LAST:event_mitem_addtecActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mitem_estequipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_estequipeActionPerformed
         if(!je.isVisible()){
            tela_principal.add(je);
            je.setVisible(true);
      }
    }//GEN-LAST:event_mitem_estequipeActionPerformed

    private void mitem_estindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_estindActionPerformed
        if(!jsi.isVisible()){
            tela_principal.add(jsi);
            jsi.setVisible(true);
      }
    }//GEN-LAST:event_mitem_estindActionPerformed

    private void mitem_deltecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_deltecActionPerformed
        if(!jdt.isVisible()){
            tela_principal.add(jdt);
            jdt.setVisible(true);
      }
    }//GEN-LAST:event_mitem_deltecActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(!jcp.isVisible()){
            tela_principal.add(jcp);
            jcp.setVisible(true);
      }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mitem_editarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_editarUsuActionPerformed
        String matricula = mitem_matricula.getText();
        if(!jet.isVisible()){
            jet.getmatricula(matricula);
            tela_principal.add(jet);
            jet.setVisible(true);
      }
    }//GEN-LAST:event_mitem_editarUsuActionPerformed

    private void mitem_bugReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_bugReportActionPerformed
        if(!jrb.isVisible()){
            jrb.usuario_matricula(menu_nomeU.getText(),mitem_matricula.getText());
            tela_principal.add(jrb);
            jrb.setVisible(true);
      }
    }//GEN-LAST:event_mitem_bugReportActionPerformed

    private void mitem_feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_feedbackActionPerformed
        if(!jf.isVisible()){
            jf.usuario_matricula(menu_nomeU.getText(),mitem_matricula.getText());
            tela_principal.add(jf);
            jf.setVisible(true);
      }
    }//GEN-LAST:event_mitem_feedbackActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMain().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menu_chamados;
    private javax.swing.JMenu menu_estatisticas;
    private javax.swing.JMenu menu_nomeU;
    private javax.swing.JMenu menu_procurar;
    private javax.swing.JMenu menu_report;
    private javax.swing.JMenu menu_tecnicos;
    private javax.swing.JMenuItem mitem_addchamado;
    private javax.swing.JMenuItem mitem_addtec;
    private javax.swing.JMenuItem mitem_ajuda;
    private javax.swing.JMenuItem mitem_bugReport;
    private javax.swing.JMenuItem mitem_deltec;
    private javax.swing.JMenuItem mitem_editarUsu;
    private javax.swing.JMenuItem mitem_editchamado;
    private javax.swing.JMenuItem mitem_estequipe;
    private javax.swing.JMenuItem mitem_estind;
    private javax.swing.JMenuItem mitem_feedback;
    private javax.swing.JMenuItem mitem_logoff;
    private javax.swing.JMenuItem mitem_matricula;
    private javax.swing.JDesktopPane tela_principal;
    // End of variables declaration//GEN-END:variables

}
