/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cliente;

/**
 *
 * @author Aluno
 */
public class JCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form JCliente
     */
    public JCliente() {
        initComponents();
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
        text_cpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_telefone = new javax.swing.JTextField();
        text_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        text_endereco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setTitle("Clientes");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Pessoa Física", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
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

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CPF:");

        text_cpf.setBackground(new java.awt.Color(255, 255, 255));
        text_cpf.setForeground(new java.awt.Color(0, 0, 0));
        text_cpf.setText("CPF");
        text_cpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_cpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_cpfFocusLost(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Telefone:");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("E-mail:");

        text_telefone.setBackground(new java.awt.Color(255, 255, 255));
        text_telefone.setForeground(new java.awt.Color(0, 0, 0));
        text_telefone.setText("Telefone");
        text_telefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_telefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_telefoneFocusLost(evt);
            }
        });

        text_email.setEditable(false);
        text_email.setBackground(new java.awt.Color(255, 255, 255));
        text_email.setForeground(new java.awt.Color(0, 0, 0));
        text_email.setText("E-mail");
        text_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_emailFocusLost(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Endereço:");

        text_endereco.setBackground(new java.awt.Color(255, 255, 255));
        text_endereco.setForeground(new java.awt.Color(0, 0, 0));
        text_endereco.setText("Endereço");
        text_endereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_enderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_enderecoFocusLost(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Adicionar");

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
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(text_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(text_nome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_endereco)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(text_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(text_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
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

    private void text_nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_nomeFocusGained
        if(text_nome.getText().equals("Nome")){
            text_nome.setText("");
        }
    }//GEN-LAST:event_text_nomeFocusGained

    private void text_cpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_cpfFocusGained
        if(text_cpf.getText().equals("CPF")){
            text_cpf.setText("");
        }
    }//GEN-LAST:event_text_cpfFocusGained

    private void text_telefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_telefoneFocusGained
        if(text_telefone.getText().equals("Telefone")){
            text_telefone.setText("");
        }
    }//GEN-LAST:event_text_telefoneFocusGained

    private void text_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_emailFocusGained
           if(text_email.getText().equals("E-mail")){
            text_email.setText("");
        }    }//GEN-LAST:event_text_emailFocusGained

    private void text_enderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_enderecoFocusGained
          if(text_endereco.getText().equals("Endereço")){
            text_endereco.setText("");
        }
    }//GEN-LAST:event_text_enderecoFocusGained

    private void text_nomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_nomeFocusLost
        if(text_nome.getText().equals("")){
            text_nome.setText("Nome");
        }    }//GEN-LAST:event_text_nomeFocusLost

    private void text_cpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_cpfFocusLost
        if(text_cpf.getText().equals("")){
            text_cpf.setText("CPF");
        }    }//GEN-LAST:event_text_cpfFocusLost

    private void text_telefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_telefoneFocusLost
        if(text_telefone.getText().equals("")){
            text_telefone.setText("Telefone");
        }    }//GEN-LAST:event_text_telefoneFocusLost

    private void text_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_emailFocusLost
        if(text_email.getText().equals("")){
            text_email.setText("E-mail");
        }    }//GEN-LAST:event_text_emailFocusLost

    private void text_enderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_enderecoFocusLost
        if(text_endereco.getText().equals("")){
            text_endereco.setText("Endereço");
        }    }//GEN-LAST:event_text_enderecoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField text_cpf;
    private javax.swing.JTextField text_email;
    private javax.swing.JTextField text_endereco;
    private javax.swing.JTextField text_nome;
    private javax.swing.JTextField text_telefone;
    // End of variables declaration//GEN-END:variables
}
