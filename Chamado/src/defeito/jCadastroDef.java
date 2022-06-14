/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package defeito;

import cadastro_maquinas.JCadastro;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class jCadastroDef extends javax.swing.JInternalFrame {
    JCadastro jc = new JCadastro();
    /**
     * Creates new form jCadastroDef
     */
    public jCadastroDef() {
        initComponents();
    }
    
    public void defeitoInfo(String defeito){
        texta_defeito.setText(defeito);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_defeito = new javax.swing.JPanel();
        label_defeito = new javax.swing.JLabel();
        label_solucao = new javax.swing.JLabel();
        label_info = new javax.swing.JLabel();
        button_defeito = new javax.swing.JButton();
        box_subsoft = new javax.swing.JCheckBox();
        box_subhard = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        texta_solucao = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        texta_defeito = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Defeitos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/computer_error.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(345, 445));
        setPreferredSize(new java.awt.Dimension(345, 445));

        panel_defeito.setBackground(new java.awt.Color(102, 102, 102));

        label_defeito.setBackground(new java.awt.Color(102, 102, 102));
        label_defeito.setForeground(new java.awt.Color(0, 0, 0));
        label_defeito.setText("Defeito informado:");

        label_solucao.setBackground(new java.awt.Color(102, 102, 102));
        label_solucao.setForeground(new java.awt.Color(0, 0, 0));
        label_solucao.setText("Qual técnica foi usada para verificar o erro:");

        label_info.setBackground(new java.awt.Color(255, 255, 255));
        label_info.setForeground(new java.awt.Color(0, 0, 0));
        label_info.setText("(marque as caixas para \"Sim\")");

        button_defeito.setText("Proximo");

        box_subsoft.setBackground(new java.awt.Color(102, 102, 102));
        box_subsoft.setForeground(new java.awt.Color(0, 0, 0));
        box_subsoft.setText("Foi necessário substituir algum Software?");

        box_subhard.setBackground(new java.awt.Color(102, 102, 102));
        box_subhard.setForeground(new java.awt.Color(0, 0, 0));
        box_subhard.setText("Foi necessário substituir algum Hardware?");

        texta_solucao.setBackground(new java.awt.Color(255, 255, 255));
        texta_solucao.setColumns(20);
        texta_solucao.setForeground(new java.awt.Color(0, 0, 0));
        texta_solucao.setRows(5);
        jScrollPane1.setViewportView(texta_solucao);

        texta_defeito.setBackground(new java.awt.Color(255, 255, 255));
        texta_defeito.setColumns(20);
        texta_defeito.setForeground(new java.awt.Color(0, 0, 0));
        texta_defeito.setRows(5);
        jScrollPane3.setViewportView(texta_defeito);

        javax.swing.GroupLayout panel_defeitoLayout = new javax.swing.GroupLayout(panel_defeito);
        panel_defeito.setLayout(panel_defeitoLayout);
        panel_defeitoLayout.setHorizontalGroup(
            panel_defeitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_defeitoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_defeitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_defeitoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(label_info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_defeito)
                        .addGap(16, 16, 16))
                    .addGroup(panel_defeitoLayout.createSequentialGroup()
                        .addGroup(panel_defeitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_subsoft)
                            .addComponent(box_subhard)
                            .addComponent(label_solucao)
                            .addComponent(label_defeito)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(33, Short.MAX_VALUE))))
            .addGroup(panel_defeitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_defeitoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        panel_defeitoLayout.setVerticalGroup(
            panel_defeitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_defeitoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_defeito)
                .addGap(148, 148, 148)
                .addComponent(label_solucao)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box_subsoft)
                .addGap(8, 8, 8)
                .addComponent(box_subhard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_defeitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_info)
                    .addComponent(button_defeito))
                .addGap(7, 7, 7))
            .addGroup(panel_defeitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_defeitoLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(248, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_defeito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_defeito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(800, 400, 341, 443);
    }// </editor-fold>//GEN-END:initComponents
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box_subhard;
    private javax.swing.JCheckBox box_subsoft;
    private javax.swing.JButton button_defeito;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_defeito;
    private javax.swing.JLabel label_info;
    private javax.swing.JLabel label_solucao;
    private javax.swing.JPanel panel_defeito;
    private javax.swing.JTextArea texta_defeito;
    private javax.swing.JTextArea texta_solucao;
    // End of variables declaration//GEN-END:variables
}
