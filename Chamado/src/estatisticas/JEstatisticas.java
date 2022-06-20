/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package estatisticas;

/**
 *
 * @author Aluno
 */
public class JEstatisticas extends javax.swing.JInternalFrame {

    /**
     * Creates new form JEstatisticas
     */
    public JEstatisticas() {
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
        label_taxabandono = new javax.swing.JLabel();
        text_taxabandono = new javax.swing.JTextField();
        label_nivsatisfacao = new javax.swing.JLabel();
        text_nivsatisfacao = new javax.swing.JTextField();
        label_tempoatendimeto = new javax.swing.JLabel();
        text_tempatendimento = new javax.swing.JTextField();
        label_tempoespera = new javax.swing.JLabel();
        text_tempespera = new javax.swing.JTextField();
        label_taxampli = new javax.swing.JLabel();
        text_taxampli = new javax.swing.JTextField();
        label_nivservico = new javax.swing.JLabel();
        text_nivservico = new javax.swing.JTextField();
        button_fechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Estatísticas da Equipe");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        label_taxabandono.setBackground(new java.awt.Color(51, 51, 51));
        label_taxabandono.setForeground(new java.awt.Color(255, 255, 255));
        label_taxabandono.setText("Taxa de Abandono:");

        text_taxabandono.setEditable(false);
        text_taxabandono.setBackground(new java.awt.Color(255, 255, 255));
        text_taxabandono.setForeground(new java.awt.Color(0, 0, 0));
        text_taxabandono.setText("0");

        label_nivsatisfacao.setBackground(new java.awt.Color(51, 51, 51));
        label_nivsatisfacao.setForeground(new java.awt.Color(255, 255, 255));
        label_nivsatisfacao.setText("Nível de Satisfação:");

        text_nivsatisfacao.setEditable(false);
        text_nivsatisfacao.setBackground(new java.awt.Color(255, 255, 255));
        text_nivsatisfacao.setForeground(new java.awt.Color(0, 0, 0));
        text_nivsatisfacao.setText("0");

        label_tempoatendimeto.setBackground(new java.awt.Color(51, 51, 51));
        label_tempoatendimeto.setForeground(new java.awt.Color(255, 255, 255));
        label_tempoatendimeto.setText("Tempo Médio de Atendimento:");

        text_tempatendimento.setEditable(false);
        text_tempatendimento.setBackground(new java.awt.Color(255, 255, 255));
        text_tempatendimento.setForeground(new java.awt.Color(0, 0, 0));
        text_tempatendimento.setText("0");

        label_tempoespera.setBackground(new java.awt.Color(51, 51, 51));
        label_tempoespera.setForeground(new java.awt.Color(255, 255, 255));
        label_tempoespera.setText("Tempo Medio de Espera:");

        text_tempespera.setEditable(false);
        text_tempespera.setBackground(new java.awt.Color(255, 255, 255));
        text_tempespera.setForeground(new java.awt.Color(0, 0, 0));
        text_tempespera.setText("0");

        label_taxampli.setBackground(new java.awt.Color(51, 51, 51));
        label_taxampli.setForeground(new java.awt.Color(255, 255, 255));
        label_taxampli.setText("Taxa de Amplificação:");

        text_taxampli.setEditable(false);
        text_taxampli.setBackground(new java.awt.Color(255, 255, 255));
        text_taxampli.setForeground(new java.awt.Color(0, 0, 0));
        text_taxampli.setText("0");

        label_nivservico.setBackground(new java.awt.Color(51, 51, 51));
        label_nivservico.setForeground(new java.awt.Color(255, 255, 255));
        label_nivservico.setText("Nível de Serviço:");

        text_nivservico.setEditable(false);
        text_nivservico.setBackground(new java.awt.Color(255, 255, 255));
        text_nivservico.setForeground(new java.awt.Color(0, 0, 0));
        text_nivservico.setText("0");

        button_fechar.setBackground(new java.awt.Color(255, 255, 255));
        button_fechar.setForeground(new java.awt.Color(0, 0, 0));
        button_fechar.setText("Fechar");
        button_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_fecharMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pendentes");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_taxampli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(text_taxampli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_tempoespera)
                            .addComponent(label_tempoatendimeto)
                            .addComponent(label_nivsatisfacao)
                            .addComponent(label_nivservico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(text_nivsatisfacao)
                                .addComponent(text_tempatendimento)
                                .addComponent(text_tempespera, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                            .addComponent(text_nivservico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_fechar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_taxabandono)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_taxabandono, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nivservico)
                    .addComponent(text_nivservico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nivsatisfacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nivsatisfacao))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tempoatendimeto)
                    .addComponent(text_tempatendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tempoespera)
                    .addComponent(text_tempespera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_taxampli)
                    .addComponent(text_taxampli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_taxabandono)
                    .addComponent(text_taxabandono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(button_fechar)
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

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

    private void button_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_fecharMouseClicked
        this.dispose();
    }//GEN-LAST:event_button_fecharMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_nivsatisfacao;
    private javax.swing.JLabel label_nivservico;
    private javax.swing.JLabel label_taxabandono;
    private javax.swing.JLabel label_taxampli;
    private javax.swing.JLabel label_tempoatendimeto;
    private javax.swing.JLabel label_tempoespera;
    private javax.swing.JTextField text_nivsatisfacao;
    private javax.swing.JTextField text_nivservico;
    private javax.swing.JTextField text_taxabandono;
    private javax.swing.JTextField text_taxampli;
    private javax.swing.JTextField text_tempatendimento;
    private javax.swing.JTextField text_tempespera;
    // End of variables declaration//GEN-END:variables
}
