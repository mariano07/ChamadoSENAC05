/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package estatisticas;

import conexao.conexao_bd;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class JIndividual extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIndividual
     */
    private String matricula;
    private static conexao_bd cbd = new conexao_bd();
    public JIndividual() {
        initComponents();
        popular();
    }
     public void matricula(String matricula){
         this.matricula = matricula;
     }
      private void popular(){
          JOptionPane.showMessageDialog(null,"Populando");
          
        
        int[] dados = new int [8];
        dados = cbd.Estatisticas(matricula);
        text_nivservico.setText(String.valueOf(dados[0]));
        text_nivsatisfacao.setText(String.valueOf(dados[1]));
        text_tempoatend.setText(String.valueOf(dados[2]));
        text_tempoespera.setText(String.valueOf(dados[3]));
        text_taxampli.setText(String.valueOf(dados[4]));
        text_taxabandono.setText(String.valueOf(dados[5]));
        text_pendentes.setText(String.valueOf(dados[6]));
        invalidate();
        validate();
      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        label_taxabandono = new javax.swing.JLabel();
        label_nivsatisacao = new javax.swing.JLabel();
        label_tempoatend = new javax.swing.JLabel();
        label_tempoespera = new javax.swing.JLabel();
        label_taxamplificacao = new javax.swing.JLabel();
        label_nivservico = new javax.swing.JLabel();
        button_fechar = new javax.swing.JButton();
        text_taxabandono = new javax.swing.JTextField();
        text_nivsatisfacao = new javax.swing.JTextField();
        text_tempoatend = new javax.swing.JTextField();
        text_tempoespera = new javax.swing.JTextField();
        text_taxampli = new javax.swing.JTextField();
        text_nivservico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        text_pendentes = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Estatísticas Individuais");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/chart_curve.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Individuais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        label_taxabandono.setBackground(new java.awt.Color(51, 51, 51));
        label_taxabandono.setForeground(new java.awt.Color(255, 255, 255));
        label_taxabandono.setText("Taxa de Abadono:");

        label_nivsatisacao.setBackground(new java.awt.Color(51, 51, 51));
        label_nivsatisacao.setForeground(new java.awt.Color(255, 255, 255));
        label_nivsatisacao.setText("Nível de Satisfaçao:");

        label_tempoatend.setBackground(new java.awt.Color(51, 51, 51));
        label_tempoatend.setForeground(new java.awt.Color(255, 255, 255));
        label_tempoatend.setText("Tempo Médio de Atendimento:");

        label_tempoespera.setBackground(new java.awt.Color(51, 51, 51));
        label_tempoespera.setForeground(new java.awt.Color(255, 255, 255));
        label_tempoespera.setText("Tempo Médio de Espera:");

        label_taxamplificacao.setBackground(new java.awt.Color(51, 51, 51));
        label_taxamplificacao.setForeground(new java.awt.Color(255, 255, 255));
        label_taxamplificacao.setText("Taxa de Amplificação:");

        label_nivservico.setBackground(new java.awt.Color(51, 51, 51));
        label_nivservico.setForeground(new java.awt.Color(255, 255, 255));
        label_nivservico.setText("Nível de Serviço:");

        button_fechar.setText("Fechar");
        button_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_fecharMouseClicked(evt);
            }
        });

        text_taxabandono.setEditable(false);
        text_taxabandono.setBackground(new java.awt.Color(255, 255, 255));
        text_taxabandono.setForeground(new java.awt.Color(51, 51, 51));
        text_taxabandono.setText("0");

        text_nivsatisfacao.setEditable(false);
        text_nivsatisfacao.setBackground(new java.awt.Color(255, 255, 255));
        text_nivsatisfacao.setForeground(new java.awt.Color(51, 51, 51));
        text_nivsatisfacao.setText("0");

        text_tempoatend.setEditable(false);
        text_tempoatend.setBackground(new java.awt.Color(255, 255, 255));
        text_tempoatend.setForeground(new java.awt.Color(51, 51, 51));
        text_tempoatend.setText("0");

        text_tempoespera.setEditable(false);
        text_tempoespera.setBackground(new java.awt.Color(255, 255, 255));
        text_tempoespera.setForeground(new java.awt.Color(51, 51, 51));
        text_tempoespera.setText("0");

        text_taxampli.setEditable(false);
        text_taxampli.setBackground(new java.awt.Color(255, 255, 255));
        text_taxampli.setForeground(new java.awt.Color(51, 51, 51));
        text_taxampli.setText("0");

        text_nivservico.setEditable(false);
        text_nivservico.setBackground(new java.awt.Color(255, 255, 255));
        text_nivservico.setForeground(new java.awt.Color(51, 51, 51));
        text_nivservico.setText("0");

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pendentes");

        text_pendentes.setEditable(false);
        text_pendentes.setBackground(new java.awt.Color(255, 255, 255));
        text_pendentes.setForeground(new java.awt.Color(51, 51, 51));
        text_pendentes.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_fechar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nivsatisacao)
                            .addComponent(label_tempoatend)
                            .addComponent(label_tempoespera)
                            .addComponent(label_taxamplificacao)
                            .addComponent(label_nivservico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_nivservico, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(text_taxampli)
                            .addComponent(text_tempoespera)
                            .addComponent(text_tempoatend)
                            .addComponent(text_nivsatisfacao)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_taxabandono)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_taxabandono, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(text_pendentes))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nivservico)
                    .addComponent(text_nivservico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nivsatisacao)
                    .addComponent(text_nivsatisfacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tempoatend)
                    .addComponent(text_tempoatend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tempoespera)
                    .addComponent(text_tempoespera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_taxamplificacao)
                    .addComponent(text_taxampli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_taxabandono)
                    .addComponent(text_taxabandono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(text_pendentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(button_fechar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_fecharMouseClicked
        this.dispose();
    }//GEN-LAST:event_button_fecharMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_nivsatisacao;
    private javax.swing.JLabel label_nivservico;
    private javax.swing.JLabel label_taxabandono;
    private javax.swing.JLabel label_taxamplificacao;
    private javax.swing.JLabel label_tempoatend;
    private javax.swing.JLabel label_tempoespera;
    private javax.swing.JTextField text_nivsatisfacao;
    private javax.swing.JTextField text_nivservico;
    private javax.swing.JTextField text_pendentes;
    private javax.swing.JTextField text_taxabandono;
    private javax.swing.JTextField text_taxampli;
    private javax.swing.JTextField text_tempoatend;
    private javax.swing.JTextField text_tempoespera;
    // End of variables declaration//GEN-END:variables
}
