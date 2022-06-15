/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chamado;

import ajuda.JMenu_Ajuda;
import cadastro_maquinas.JCadastro;
import cliente.JCliente;
import defeito.jCadastroDef;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import login.JLogin;
import procura.JProcura;
import procura.JResultado;
import tecnico.JTecnico;

/**
 *
 * @author alunos
 */
public class JMain extends javax.swing.JFrame {
    private static JCliente jcl = new JCliente();
    private static JTecnico jt = new JTecnico();
    private static jCadastroDef jcd = new jCadastroDef();
    private static JCadastro jc = new JCadastro();
    private static JProcura jp = new JProcura();
    private static JResultado jr = new JResultado();
    private static JMenu_Ajuda ma = new JMenu_Ajuda();
    
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
            jMenuItem2.setVisible(false);
            return matricula;
        }else{
            return matricula;
        }
    }
    
    public void setTexto(String nome,String matricula){
        menu_nomeU.setText(nome);
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

        tela_principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_nomeU = new javax.swing.JMenu();
        mitem_matricula = new javax.swing.JMenuItem();
        mitem_ajuda = new javax.swing.JMenuItem();
        mitem_logoff = new javax.swing.JMenuItem();
        menu_maquinas = new javax.swing.JMenu();
        mitem_addmaq = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menu_procurar = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_tecnicos = new javax.swing.JMenu();
        mitem_addtec = new javax.swing.JMenuItem();
        mitem_deltec = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de T.I");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        tela_principal.setBackground(new java.awt.Color(102, 102, 102));
        tela_principal.setToolTipText("");

        javax.swing.GroupLayout tela_principalLayout = new javax.swing.GroupLayout(tela_principal);
        tela_principal.setLayout(tela_principalLayout);
        tela_principalLayout.setHorizontalGroup(
            tela_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        tela_principalLayout.setVerticalGroup(
            tela_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menu_nomeU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/user_gray.png"))); // NOI18N
        menu_nomeU.setFocusable(false);
        menu_nomeU.setRolloverEnabled(false);

        mitem_matricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/vcard.png"))); // NOI18N
        mitem_matricula.setText("a");
        menu_nomeU.add(mitem_matricula);

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

        menu_maquinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/computer.png"))); // NOI18N
        menu_maquinas.setText("Maquinas");

        mitem_addmaq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/computer_add.png"))); // NOI18N
        mitem_addmaq.setText("Registrar Maquina");
        mitem_addmaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_addmaqActionPerformed(evt);
            }
        });
        menu_maquinas.add(mitem_addmaq);

        jMenuItem2.setText("jMenuItem2");
        menu_maquinas.add(jMenuItem2);

        jMenuBar1.add(menu_maquinas);

        menu_procurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/magnifier.png"))); // NOI18N
        menu_procurar.setText("Procurar");
        menu_procurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_procurarMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_procurar);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/group_link.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/user_suit.png"))); // NOI18N
        jMenuItem1.setText("Adicionar PF");
        jMenu1.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/building.png"))); // NOI18N
        jMenuItem3.setText("Adicionar PJ");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

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

    private void mitem_addmaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_addmaqActionPerformed
        if(!jc.isVisible()){
        tela_principal.add(jc);
        jc.setVisible(true);
        }
    }//GEN-LAST:event_mitem_addmaqActionPerformed

    private void menu_procurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_procurarMouseClicked
        if(!jr.isVisible()){
            tela_principal.add(jr);
            jr.setVisible(true);
        }
    }//GEN-LAST:event_menu_procurarMouseClicked

    private void mitem_logoffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitem_logoffMousePressed
        JLogin jl = new JLogin();
        jl.setVisible(true);
        dispose();
    }//GEN-LAST:event_mitem_logoffMousePressed

    private void mitem_ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_ajudaActionPerformed
        if(!ma.isVisible()){
            tela_principal.add(ma);
            ma.setVisible(true);
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
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menu_maquinas;
    private javax.swing.JMenu menu_nomeU;
    private javax.swing.JMenu menu_procurar;
    private javax.swing.JMenu menu_tecnicos;
    private javax.swing.JMenuItem mitem_addmaq;
    private javax.swing.JMenuItem mitem_addtec;
    private javax.swing.JMenuItem mitem_ajuda;
    private javax.swing.JMenuItem mitem_deltec;
    private javax.swing.JMenuItem mitem_logoff;
    private javax.swing.JMenuItem mitem_matricula;
    private javax.swing.JDesktopPane tela_principal;
    // End of variables declaration//GEN-END:variables

}
