/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package clientes;

/**
 *
 * @author Aluno
 */
public class JInstituicao extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInstituicao
     */
    public JInstituicao() {
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
        label_nome = new javax.swing.JLabel();
        text_nome = new javax.swing.JTextField();
        label_endereco = new javax.swing.JLabel();
        text_endereco = new javax.swing.JTextField();
        label_cnpj = new javax.swing.JLabel();
        text_cnpj = new javax.swing.JTextField();
        label_resp = new javax.swing.JLabel();
        text_resp = new javax.swing.JTextField();
        label_cpf = new javax.swing.JLabel();
        text_cpf = new javax.swing.JTextField();
        label_telefone = new javax.swing.JLabel();
        text_telefone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cliente");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/building.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Pessoa Jurídica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        label_nome.setBackground(new java.awt.Color(51, 51, 51));
        label_nome.setForeground(new java.awt.Color(255, 255, 255));
        label_nome.setText("Nome:");

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

        label_endereco.setBackground(new java.awt.Color(51, 51, 51));
        label_endereco.setForeground(new java.awt.Color(255, 255, 255));
        label_endereco.setText("Endereço:");

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

        label_cnpj.setBackground(new java.awt.Color(51, 51, 51));
        label_cnpj.setForeground(new java.awt.Color(255, 255, 255));
        label_cnpj.setText("CNPJ:");

        text_cnpj.setBackground(new java.awt.Color(255, 255, 255));
        text_cnpj.setForeground(new java.awt.Color(0, 0, 0));
        text_cnpj.setText("CNPJ");
        text_cnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_cnpjFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_cnpjFocusLost(evt);
            }
        });

        label_resp.setBackground(new java.awt.Color(51, 51, 51));
        label_resp.setForeground(new java.awt.Color(255, 255, 255));
        label_resp.setText("Responsável:");

        text_resp.setBackground(new java.awt.Color(255, 255, 255));
        text_resp.setForeground(new java.awt.Color(0, 0, 0));
        text_resp.setText("Responsável");
        text_resp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_respFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_respFocusLost(evt);
            }
        });

        label_cpf.setBackground(new java.awt.Color(51, 51, 51));
        label_cpf.setForeground(new java.awt.Color(255, 255, 255));
        label_cpf.setText("CPF:");

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

        label_telefone.setBackground(new java.awt.Color(51, 51, 51));
        label_telefone.setForeground(new java.awt.Color(255, 255, 255));
        label_telefone.setText("Telefone:");

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
                            .addComponent(label_endereco)
                            .addComponent(label_nome)
                            .addComponent(label_cnpj))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_endereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_nome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(text_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 183, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_resp)
                            .addComponent(label_cpf)
                            .addComponent(label_telefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_resp)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(text_cpf)
                                    .addComponent(text_telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(text_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_endereco)
                    .addComponent(text_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cnpj)
                    .addComponent(text_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_resp)
                    .addComponent(text_resp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf)
                    .addComponent(text_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_telefone)
                    .addComponent(text_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void text_nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_nomeFocusGained
        if(text_nome.getText().equals("Nome")){
            text_nome.setText("");
        }
    }//GEN-LAST:event_text_nomeFocusGained

    private void text_enderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_enderecoFocusGained
       if(text_endereco.getText().equals("Endereço")){
            text_endereco.setText("");
        }
    }//GEN-LAST:event_text_enderecoFocusGained

    private void text_cnpjFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_cnpjFocusGained
        if(text_cnpj.getText().equals("CNPJ")){
            text_cnpj.setText("");
        }
    }//GEN-LAST:event_text_cnpjFocusGained

    private void text_respFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_respFocusGained
        if(text_resp.getText().equals("Responsável")){
            text_resp.setText("");
        }
    }//GEN-LAST:event_text_respFocusGained

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

    private void text_nomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_nomeFocusLost
               if(text_nome.getText().equals("")){
            text_nome.setText("Nome");
        }
    }//GEN-LAST:event_text_nomeFocusLost

    private void text_enderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_enderecoFocusLost
       if(text_endereco.getText().equals("")){
            text_endereco.setText("Endereço");
       }
    }//GEN-LAST:event_text_enderecoFocusLost

    private void text_cnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_cnpjFocusLost
        if(text_cnpj.getText().equals("")){
            text_cnpj.setText("CNPJ");
        }
    }//GEN-LAST:event_text_cnpjFocusLost

    private void text_respFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_respFocusLost
        if(text_resp.getText().equals("")){
            text_resp.setText("Responsável");
        }    }//GEN-LAST:event_text_respFocusLost

    private void text_cpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_cpfFocusLost
        if(text_cpf.getText().equals("")){
            text_cpf.setText("CPF");
        }    }//GEN-LAST:event_text_cpfFocusLost

    private void text_telefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_telefoneFocusLost
        if(text_telefone.getText().equals("")){
            text_telefone.setText("Telefone");
        }    }//GEN-LAST:event_text_telefoneFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_cnpj;
    private javax.swing.JLabel label_cpf;
    private javax.swing.JLabel label_endereco;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_resp;
    private javax.swing.JLabel label_telefone;
    private javax.swing.JTextField text_cnpj;
    private javax.swing.JTextField text_cpf;
    private javax.swing.JTextField text_endereco;
    private javax.swing.JTextField text_nome;
    private javax.swing.JTextField text_resp;
    private javax.swing.JTextField text_telefone;
    // End of variables declaration//GEN-END:variables
}
