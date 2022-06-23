/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package reports;

import conexao.conexao_bd;
import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class JReportarBug extends javax.swing.JInternalFrame {

    /**
     * Creates new form JReportarBug
     */
    private String usuario="",matricula="";
    public JReportarBug() {
        initComponents();
    }
    
    public void usuario_matricula(String usuario,String matricula){
        this.usuario = usuario;
        this.matricula = matricula;
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
        label_processo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texta_processo = new javax.swing.JTextArea();
        label_contadorProcesso = new javax.swing.JLabel();
        label_bug = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texta_bug = new javax.swing.JTextArea();
        label_contadorBug = new javax.swing.JLabel();
        button_enviar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte de Bug");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/bug_add.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        label_processo.setBackground(new java.awt.Color(51, 51, 51));
        label_processo.setForeground(new java.awt.Color(255, 255, 255));
        label_processo.setText("Informe o processo que você fez para encontrar o bug:");

        texta_processo.setBackground(new java.awt.Color(255, 255, 255));
        texta_processo.setColumns(20);
        texta_processo.setForeground(new java.awt.Color(0, 0, 0));
        texta_processo.setRows(5);
        jScrollPane1.setViewportView(texta_processo);

        label_contadorProcesso.setBackground(new java.awt.Color(51, 51, 51));
        label_contadorProcesso.setForeground(new java.awt.Color(255, 255, 255));
        label_contadorProcesso.setText("0/255");

        label_bug.setBackground(new java.awt.Color(51, 51, 51));
        label_bug.setForeground(new java.awt.Color(255, 255, 255));
        label_bug.setText("Informe o bug que ocorreu:");

        texta_bug.setBackground(new java.awt.Color(255, 255, 255));
        texta_bug.setColumns(20);
        texta_bug.setForeground(new java.awt.Color(0, 0, 0));
        texta_bug.setRows(5);
        jScrollPane2.setViewportView(texta_bug);

        label_contadorBug.setBackground(new java.awt.Color(51, 51, 51));
        label_contadorBug.setForeground(new java.awt.Color(255, 255, 255));
        label_contadorBug.setText("0/255");

        button_enviar.setBackground(new java.awt.Color(255, 255, 255));
        button_enviar.setForeground(new java.awt.Color(0, 0, 0));
        button_enviar.setText("Enviar");
        button_enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_enviarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_processo)
                            .addComponent(label_bug))
                        .addGap(0, 188, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_contadorProcesso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_contadorBug, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_enviar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_processo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_contadorProcesso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_bug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_contadorBug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_enviar)
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

    private void button_enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_enviarMouseClicked
        conexao_bd cbd = new conexao_bd();
        String processoBug = texta_processo.getText(),bug = texta_bug.getText();
        if(!texta_bug.getText().equals("")){
            cbd.ReportaBug(usuario,matricula,processoBug,bug);
            JOptionPane.showMessageDialog(null, "Bug reportado com sucesso!\nObrigado pela contribuição :D");
        }
    }//GEN-LAST:event_button_enviarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_enviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_bug;
    private javax.swing.JLabel label_contadorBug;
    private javax.swing.JLabel label_contadorProcesso;
    private javax.swing.JLabel label_processo;
    private javax.swing.JTextArea texta_bug;
    private javax.swing.JTextArea texta_processo;
    // End of variables declaration//GEN-END:variables
}
