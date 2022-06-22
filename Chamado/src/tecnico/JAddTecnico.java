/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tecnico;

import conexao.conexao_bd;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class JAddTecnico extends javax.swing.JInternalFrame {
    private static conexao_bd cbd = new conexao_bd();

    /**
     * Creates new form JTecnico
     */
    public JAddTecnico() {
        initComponents();
    }
    
    public void reseta(){
        text_nome.setText("Nome");
        text_user.setText("Nome de usuário");
        text_matricula.setText("Matrícula");
        password_senha.setText("");
        password_confirma.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        text_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text_matricula = new javax.swing.JTextField();
        button_add = new javax.swing.JButton();
        password_senha = new javax.swing.JPasswordField();
        password_confirma = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Acionar Técnico");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/user_add.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        text_nome.setBackground(new java.awt.Color(255, 255, 255));
        text_nome.setForeground(new java.awt.Color(0, 0, 0));
        text_nome.setText("Nome");
        text_nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_nomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_nomeFocusLost(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuário");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");

        text_user.setBackground(new java.awt.Color(255, 255, 255));
        text_user.setForeground(new java.awt.Color(0, 0, 0));
        text_user.setText("Nome de usuário");
        text_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_userFocusLost(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar senha:");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Matrícula:");

        text_matricula.setBackground(new java.awt.Color(255, 255, 255));
        text_matricula.setForeground(new java.awt.Color(0, 0, 0));
        text_matricula.setText("Matrícula");
        text_matricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_matriculaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_matriculaFocusLost(evt);
            }
        });

        button_add.setBackground(new java.awt.Color(255, 255, 255));
        button_add.setForeground(new java.awt.Color(51, 51, 51));
        button_add.setText("Adicionar");
        button_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addMouseClicked(evt);
            }
        });

        password_senha.setBackground(new java.awt.Color(255, 255, 255));
        password_senha.setForeground(new java.awt.Color(51, 51, 51));

        password_confirma.setBackground(new java.awt.Color(255, 255, 255));
        password_confirma.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_user, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(password_confirma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(password_senha, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_add)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password_confirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(19, 19, 19)
                .addComponent(button_add)
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

    private void button_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addMouseClicked
        String nome, usuario, senha, matricula, confirma;
        nome = text_nome.getText();
        usuario = text_user.getText();
        senha = password_senha.getText();
        matricula = text_matricula.getText();
        confirma = password_confirma.getText();
        
        if(senha.equals(confirma)){
            cbd.AddTec(nome,matricula, usuario, senha );
             JOptionPane.showMessageDialog(null, "Técnico Adicionado Com Sucesso!");
            this.dispose();
            reseta();
        }else{
            JOptionPane.showMessageDialog(null, "Senhas Incompatíveis");
        }
    }//GEN-LAST:event_button_addMouseClicked

    private void text_nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_nomeFocusGained
        if(text_nome.getText().equals("Nome")){
            text_nome.setText("");
        }
    }//GEN-LAST:event_text_nomeFocusGained

    private void text_nomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_nomeFocusLost
        if(text_nome.getText().equals("")){
            text_nome.setText("Nome");
        }
    }//GEN-LAST:event_text_nomeFocusLost

    private void text_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_userFocusGained
        if(text_user.getText().equals("Nome de usuário")){
            text_user.setText("");
        }
    }//GEN-LAST:event_text_userFocusGained

    private void text_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_userFocusLost
          if(text_user.getText().equals("")){
            text_user.setText("Nome de usuário");
        }
    }//GEN-LAST:event_text_userFocusLost

    private void text_matriculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_matriculaFocusGained
         if(text_matricula.getText().equals("Matrícula")){
            text_matricula.setText("");
        }
    }//GEN-LAST:event_text_matriculaFocusGained

    private void text_matriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_matriculaFocusLost
        if(text_matricula.getText().equals("")){
            text_matricula.setText("Matrícula");
        }
    }//GEN-LAST:event_text_matriculaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password_confirma;
    private javax.swing.JPasswordField password_senha;
    private javax.swing.JTextField text_matricula;
    private javax.swing.JTextField text_nome;
    private javax.swing.JTextField text_user;
    // End of variables declaration//GEN-END:variables
}
