/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import chamado.JMain;
import conexao.conexao_bd;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class JLogin extends javax.swing.JFrame {

    /**
     * Creates new form JLogin
     */
    public JLogin() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens_icones/user_go.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Login = new javax.swing.JPanel();
        label_msg_login = new javax.swing.JLabel();
        text_usuario_login = new javax.swing.JTextField();
        label_usuario_login = new javax.swing.JLabel();
        label_senha_login = new javax.swing.JLabel();
        Button_login = new javax.swing.JButton();
        label_msg2_login = new javax.swing.JLabel();
        label_icone_login = new javax.swing.JLabel();
        password_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setMinimumSize(new java.awt.Dimension(451, 304));

        JPanel_Login.setBackground(new java.awt.Color(102, 102, 102));

        label_msg_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_msg_login.setForeground(new java.awt.Color(0, 0, 0));
        label_msg_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_msg_login.setText("Bem Vindo ao sistema de chamados de T.I do Senac");

        text_usuario_login.setBackground(new java.awt.Color(255, 255, 255));
        text_usuario_login.setForeground(new java.awt.Color(0, 0, 0));
        text_usuario_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_usuario_loginKeyPressed(evt);
            }
        });

        label_usuario_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_usuario_login.setForeground(new java.awt.Color(0, 0, 0));
        label_usuario_login.setText("Usuário:");

        label_senha_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_senha_login.setForeground(new java.awt.Color(0, 0, 0));
        label_senha_login.setText("Senha:");

        Button_login.setForeground(new java.awt.Color(0, 0, 0));
        Button_login.setText("Login");
        Button_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_loginMouseClicked(evt);
            }
        });

        label_msg2_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_msg2_login.setForeground(new java.awt.Color(0, 0, 0));
        label_msg2_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_msg2_login.setText("Informe seu usuário e senha");

        label_icone_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_icone_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/senac_logo.png"))); // NOI18N

        password_senha.setBackground(new java.awt.Color(255, 255, 255));
        password_senha.setForeground(new java.awt.Color(0, 0, 0));
        password_senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_senhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout JPanel_LoginLayout = new javax.swing.GroupLayout(JPanel_Login);
        JPanel_Login.setLayout(JPanel_LoginLayout);
        JPanel_LoginLayout.setHorizontalGroup(
            JPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_LoginLayout.createSequentialGroup()
                .addGroup(JPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_LoginLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(JPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPanel_LoginLayout.createSequentialGroup()
                                .addGroup(JPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_senha_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_usuario_login))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(text_usuario_login)
                                    .addComponent(password_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                            .addComponent(label_msg2_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(Button_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 128, Short.MAX_VALUE))
                    .addGroup(JPanel_LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_icone_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(label_msg_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPanel_LoginLayout.setVerticalGroup(
            JPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_LoginLayout.createSequentialGroup()
                .addComponent(label_msg_login, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_icone_login, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_msg2_login)
                .addGap(18, 18, 18)
                .addGroup(JPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_usuario_login))
                .addGap(18, 18, 18)
                .addGroup(JPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_senha_login)
                    .addComponent(password_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Button_login)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_loginMouseClicked
        conexao_bd cbd = new conexao_bd();
        
        String login = text_usuario_login.getText(),senha = password_senha.getText(),verificaC = "",verificaU = "";
        verificaC = cbd.Login(login, senha);
          
        if(verificaC.toString().equals("ADM")){
            verificaU = cbd.Usuario(login, senha);
            JMain jm = new JMain();
            jm.checa_cargo(verificaC, verificaU);
            jm.setTexto(verificaU);
            jm.setVisible(true);
            dispose();
        }else if (verificaC.equals("TEC")){
            verificaU = cbd.Usuario(login, senha);
            JMain jm = new JMain();
            jm.checa_cargo(verificaC, verificaU);
            jm.setTexto(verificaU);
            jm.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Usuário e senha incorretos\nou\nUsuário e senha não cadastrados!", "Login Inválido!",JOptionPane.ERROR_MESSAGE );  
        }
    }//GEN-LAST:event_Button_loginMouseClicked

    private void text_usuario_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_usuario_loginKeyPressed
        conexao_bd cbd = new conexao_bd();

        String login = text_usuario_login.getText(),senha = password_senha.getText(),verificaC = "",verificaU = "";
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            verificaC = cbd.Login(login, senha);
            if(verificaC.toString().equals("ADM")){
                verificaU = cbd.Usuario(login, senha);
                JMain jm = new JMain();
                jm.checa_cargo(verificaC, verificaU);
                jm.setTexto(verificaU);
                jm.setVisible(true);
                dispose();
            }else if (verificaC.equals("TEC")){
                verificaU = cbd.Usuario(login, senha);
                JMain jm = new JMain();
                jm.checa_cargo(verificaC, verificaU);
                jm.setTexto(verificaU);
                jm.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuário e senha incorretos\nou\nUsuário e senha não cadastrados!", "Login Inválido!",JOptionPane.ERROR_MESSAGE );  
            }
        }
    }//GEN-LAST:event_text_usuario_loginKeyPressed

    private void password_senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_senhaKeyPressed
        conexao_bd cbd = new conexao_bd();

        String login = text_usuario_login.getText(),senha = password_senha.getText(),verificaC = "",verificaU = "";
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            verificaC = cbd.Login(login, senha);
            if(verificaC.toString().equals("ADM")){
                verificaU = cbd.Usuario(login, senha);
                JMain jm = new JMain();
                jm.checa_cargo(verificaC, verificaU);
                jm.setTexto(verificaU);
                jm.setVisible(true);
                dispose();
            }else if (verificaC.equals("TEC")){
                verificaU = cbd.Usuario(login, senha);
                JMain jm = new JMain();
                jm.checa_cargo(verificaC, verificaU);
                jm.setTexto(verificaU);
                jm.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuário e senha incorretos\nou\nUsuário e senha não cadastrados!", "Login Inválido!",JOptionPane.ERROR_MESSAGE );  
            }
        }
    }//GEN-LAST:event_password_senhaKeyPressed

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
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_login;
    private javax.swing.JPanel JPanel_Login;
    private javax.swing.JLabel label_icone_login;
    private javax.swing.JLabel label_msg2_login;
    private javax.swing.JLabel label_msg_login;
    private javax.swing.JLabel label_senha_login;
    private javax.swing.JLabel label_usuario_login;
    private javax.swing.JPasswordField password_senha;
    private javax.swing.JTextField text_usuario_login;
    // End of variables declaration//GEN-END:variables
}