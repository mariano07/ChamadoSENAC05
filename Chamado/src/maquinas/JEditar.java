/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package maquinas;

import conexao.JConsultaChamado;
import conexao.conexao_bd;

/**
 *
 * @author alunos
 */
public class JEditar extends javax.swing.JInternalFrame {
    
    private String negar ="0123456789";
    private static conexao_bd cbd = new conexao_bd();
    private static JConsultaChamado jcc = new JConsultaChamado();
    private int id = 0;
    
    public JEditar() {
        initComponents();
    }
    
    public void popular(int id,String[] dados){
        this.id = id;
        text_patrimonio.setText(dados[0]);
        text_sala.setText(dados[1]);
        text_pmae.setText(dados[2]);
        text_processador.setText(dados[3]);
        text_memoria.setText(dados[4]);
        text_gpu.setText(dados[5]);
        text_fonte.setText(dados[6]);
        text_ssd.setText(dados[7]);
        text_hd.setText(dados[8]);
        text_cooler.setText(dados[9]);
        text_coolercpu.setText(dados[10]);
        text_gabinete.setText(dados[11]);
        texta_defeito.setText(dados[12]);
        texta_solucao.setText(dados[13]);
    }
    private void reseta(){
        this.id = 0;
        text_patrimonio.setText("");
        text_sala.setText("");
        text_pmae.setText("");
        text_processador.setText("");
        text_memoria.setText("");
        text_gpu.setText("");
        text_fonte.setText("");
        text_ssd.setText("");
        text_hd.setText("");
        text_cooler.setText("");
        text_coolercpu.setText("");
        text_gabinete.setText("");
        texta_defeito.setText("");
        texta_solucao.setText("");
        getParent().add(jcc);
        jcc.setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        label_processador = new javax.swing.JLabel();
        text_processador = new javax.swing.JTextField();
        label_pmae = new javax.swing.JLabel();
        text_pmae = new javax.swing.JTextField();
        label_hd = new javax.swing.JLabel();
        text_hd = new javax.swing.JTextField();
        label_memoria = new javax.swing.JLabel();
        text_memoria = new javax.swing.JTextField();
        label_fonte = new javax.swing.JLabel();
        text_fonte = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        label_ccpu = new javax.swing.JLabel();
        text_coolercpu = new javax.swing.JTextField();
        label_cooler = new javax.swing.JLabel();
        text_cooler = new javax.swing.JTextField();
        label_ssd = new javax.swing.JLabel();
        text_ssd = new javax.swing.JTextField();
        label_gpu = new javax.swing.JLabel();
        text_gpu = new javax.swing.JTextField();
        label_gabinete = new javax.swing.JLabel();
        text_gabinete = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        label_patrimonio = new javax.swing.JLabel();
        text_patrimonio = new javax.swing.JTextField();
        label_sala = new javax.swing.JLabel();
        text_sala = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        label_defeito = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texta_defeito = new javax.swing.JTextArea();
        label_solucao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texta_solucao = new javax.swing.JTextArea();
        button_editar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Edição de chamado");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/computer_edit.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Componentes presentes na máquina:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));

        label_processador.setBackground(new java.awt.Color(51, 51, 51));
        label_processador.setForeground(new java.awt.Color(255, 255, 255));
        label_processador.setText("Processador:");

        text_processador.setBackground(new java.awt.Color(255, 255, 255));
        text_processador.setForeground(new java.awt.Color(0, 0, 0));
        text_processador.setText("Modelo");
        text_processador.setMinimumSize(new java.awt.Dimension(200, 22));
        text_processador.setPreferredSize(new java.awt.Dimension(200, 22));

        label_pmae.setBackground(new java.awt.Color(51, 51, 51));
        label_pmae.setForeground(new java.awt.Color(255, 255, 255));
        label_pmae.setText("Placa Mãe:");

        text_pmae.setBackground(new java.awt.Color(255, 255, 255));
        text_pmae.setForeground(new java.awt.Color(0, 0, 0));
        text_pmae.setText("Modelo");
        text_pmae.setMinimumSize(new java.awt.Dimension(200, 22));
        text_pmae.setPreferredSize(new java.awt.Dimension(200, 22));

        label_hd.setBackground(new java.awt.Color(51, 51, 51));
        label_hd.setForeground(new java.awt.Color(255, 255, 255));
        label_hd.setText("HD:");

        text_hd.setBackground(new java.awt.Color(255, 255, 255));
        text_hd.setForeground(new java.awt.Color(0, 0, 0));
        text_hd.setText("Modelo");
        text_hd.setMinimumSize(new java.awt.Dimension(200, 22));
        text_hd.setPreferredSize(new java.awt.Dimension(200, 22));

        label_memoria.setBackground(new java.awt.Color(51, 51, 51));
        label_memoria.setForeground(new java.awt.Color(255, 255, 255));
        label_memoria.setText("Memória:");

        text_memoria.setBackground(new java.awt.Color(255, 255, 255));
        text_memoria.setForeground(new java.awt.Color(0, 0, 0));
        text_memoria.setText("Modelo");
        text_memoria.setMinimumSize(new java.awt.Dimension(200, 22));
        text_memoria.setPreferredSize(new java.awt.Dimension(200, 22));

        label_fonte.setBackground(new java.awt.Color(51, 51, 51));
        label_fonte.setForeground(new java.awt.Color(255, 255, 255));
        label_fonte.setText("Fonte:");

        text_fonte.setBackground(new java.awt.Color(255, 255, 255));
        text_fonte.setForeground(new java.awt.Color(51, 51, 51));
        text_fonte.setText("Modelo");
        text_fonte.setMinimumSize(new java.awt.Dimension(200, 22));
        text_fonte.setPreferredSize(new java.awt.Dimension(200, 22));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        label_ccpu.setBackground(new java.awt.Color(51, 51, 51));
        label_ccpu.setForeground(new java.awt.Color(255, 255, 255));
        label_ccpu.setText("Cooler CPU:");

        text_coolercpu.setBackground(new java.awt.Color(255, 255, 255));
        text_coolercpu.setForeground(new java.awt.Color(0, 0, 0));
        text_coolercpu.setText("Modelo");
        text_coolercpu.setMinimumSize(new java.awt.Dimension(200, 22));
        text_coolercpu.setPreferredSize(new java.awt.Dimension(200, 22));

        label_cooler.setBackground(new java.awt.Color(51, 51, 51));
        label_cooler.setForeground(new java.awt.Color(255, 255, 255));
        label_cooler.setText("Cooler:");

        text_cooler.setBackground(new java.awt.Color(255, 255, 255));
        text_cooler.setForeground(new java.awt.Color(51, 51, 51));
        text_cooler.setText("Modelo");
        text_cooler.setMinimumSize(new java.awt.Dimension(200, 22));
        text_cooler.setPreferredSize(new java.awt.Dimension(200, 22));

        label_ssd.setBackground(new java.awt.Color(51, 51, 51));
        label_ssd.setForeground(new java.awt.Color(255, 255, 255));
        label_ssd.setText("SSD:");

        text_ssd.setBackground(new java.awt.Color(255, 255, 255));
        text_ssd.setForeground(new java.awt.Color(0, 0, 0));
        text_ssd.setText("Modelo");
        text_ssd.setMinimumSize(new java.awt.Dimension(200, 22));
        text_ssd.setPreferredSize(new java.awt.Dimension(200, 22));

        label_gpu.setBackground(new java.awt.Color(51, 51, 51));
        label_gpu.setForeground(new java.awt.Color(255, 255, 255));
        label_gpu.setText("Placa de Vídeo:");

        text_gpu.setBackground(new java.awt.Color(255, 255, 255));
        text_gpu.setForeground(new java.awt.Color(0, 0, 0));
        text_gpu.setText("Modelo");
        text_gpu.setMinimumSize(new java.awt.Dimension(200, 22));
        text_gpu.setPreferredSize(new java.awt.Dimension(200, 22));

        label_gabinete.setBackground(new java.awt.Color(51, 51, 51));
        label_gabinete.setForeground(new java.awt.Color(255, 255, 255));
        label_gabinete.setText("Gabinete:");

        text_gabinete.setBackground(new java.awt.Color(255, 255, 255));
        text_gabinete.setForeground(new java.awt.Color(51, 51, 51));
        text_gabinete.setText("Modelo");
        text_gabinete.setMinimumSize(new java.awt.Dimension(200, 22));
        text_gabinete.setPreferredSize(new java.awt.Dimension(200, 22));

        label_patrimonio.setBackground(new java.awt.Color(51, 51, 51));
        label_patrimonio.setForeground(new java.awt.Color(255, 255, 255));
        label_patrimonio.setText("Patrimônio");

        text_patrimonio.setBackground(new java.awt.Color(255, 255, 255));
        text_patrimonio.setForeground(new java.awt.Color(0, 0, 0));
        text_patrimonio.setText("0");
        text_patrimonio.setMinimumSize(new java.awt.Dimension(208, 22));
        text_patrimonio.setPreferredSize(new java.awt.Dimension(208, 22));

        label_sala.setBackground(new java.awt.Color(51, 51, 51));
        label_sala.setForeground(new java.awt.Color(255, 255, 255));
        label_sala.setText("Sala");

        text_sala.setBackground(new java.awt.Color(255, 255, 255));
        text_sala.setForeground(new java.awt.Color(0, 0, 0));
        text_sala.setText("Sala");
        text_sala.setMinimumSize(new java.awt.Dimension(208, 22));
        text_sala.setPreferredSize(new java.awt.Dimension(208, 22));

        label_defeito.setBackground(new java.awt.Color(51, 51, 51));
        label_defeito.setForeground(new java.awt.Color(255, 255, 255));
        label_defeito.setText("Defeito");

        texta_defeito.setBackground(new java.awt.Color(255, 255, 255));
        texta_defeito.setColumns(20);
        texta_defeito.setForeground(new java.awt.Color(0, 0, 0));
        texta_defeito.setRows(5);
        jScrollPane1.setViewportView(texta_defeito);

        label_solucao.setBackground(new java.awt.Color(51, 51, 51));
        label_solucao.setForeground(new java.awt.Color(255, 255, 255));
        label_solucao.setText("Solução");

        texta_solucao.setBackground(new java.awt.Color(255, 255, 255));
        texta_solucao.setColumns(20);
        texta_solucao.setForeground(new java.awt.Color(0, 0, 0));
        texta_solucao.setRows(5);
        jScrollPane2.setViewportView(texta_solucao);

        button_editar.setBackground(new java.awt.Color(255, 255, 255));
        button_editar.setForeground(new java.awt.Color(51, 51, 51));
        button_editar.setText("Editar");
        button_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_editarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_editar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_processador)
                                            .addComponent(label_memoria)
                                            .addComponent(label_pmae)
                                            .addComponent(label_hd)
                                            .addComponent(label_fonte))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(text_fonte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(text_pmae, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(text_processador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(text_hd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(text_memoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(label_ccpu)
                                                    .addComponent(label_gpu)
                                                    .addComponent(label_gabinete)
                                                    .addComponent(label_ssd))
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(text_coolercpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(text_cooler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(text_ssd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(text_gpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(text_gabinete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(label_cooler)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_solucao)
                                            .addComponent(label_sala))
                                        .addGap(319, 319, 319))
                                    .addComponent(label_defeito))
                                .addGap(0, 82, Short.MAX_VALUE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label_patrimonio)
                                .addGap(18, 18, 18)
                                .addComponent(text_patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_processador)
                            .addComponent(text_processador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_pmae)
                            .addComponent(text_pmae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_hd)
                            .addComponent(text_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_memoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_memoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_fonte)
                            .addComponent(text_fonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_coolercpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_cooler))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_cooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_ccpu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_ssd))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_gpu)
                            .addComponent(text_gpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_gabinete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_gabinete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_patrimonio)
                    .addComponent(text_patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_sala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_sala, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(label_defeito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_solucao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_editar))
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

    private void button_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_editarMouseClicked
        String processador, pmae, ram, hd, ssd, ccpu, cool, gpu, fonte, gabinete, patrimonio, sala, defeito, solucao;
        patrimonio = text_patrimonio.getText();
        sala = text_sala.getText();
        pmae = text_pmae.getText();
        processador = text_processador.getText();
        ram = text_memoria.getText();
        gpu = text_gpu.getText();
        fonte = text_fonte.getText();
        ssd = text_ssd.getText();
        hd = text_hd.getText();
        cool = text_cooler.getText();
        ccpu = text_coolercpu.getText();
        gabinete = text_gabinete.getText();
        defeito = texta_defeito.getText();
        solucao = texta_solucao.getText();
        
        cbd.AtualizaChamado(id,patrimonio,sala,pmae,processador,ram,gpu,fonte,ssd,hd,cool,ccpu,gabinete);
        if(solucao.equals("")){
            cbd.AtualizaDef(id, defeito);
        }else{
            cbd.AtualizaDefSolu(id, defeito, solucao);
        }
        reseta();
    }//GEN-LAST:event_button_editarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_editar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel label_ccpu;
    private javax.swing.JLabel label_cooler;
    private javax.swing.JLabel label_defeito;
    private javax.swing.JLabel label_fonte;
    private javax.swing.JLabel label_gabinete;
    private javax.swing.JLabel label_gpu;
    private javax.swing.JLabel label_hd;
    private javax.swing.JLabel label_memoria;
    private javax.swing.JLabel label_patrimonio;
    private javax.swing.JLabel label_pmae;
    private javax.swing.JLabel label_processador;
    private javax.swing.JLabel label_sala;
    private javax.swing.JLabel label_solucao;
    private javax.swing.JLabel label_ssd;
    private javax.swing.JTextField text_cooler;
    private javax.swing.JTextField text_coolercpu;
    private javax.swing.JTextField text_fonte;
    private javax.swing.JTextField text_gabinete;
    private javax.swing.JTextField text_gpu;
    private javax.swing.JTextField text_hd;
    private javax.swing.JTextField text_memoria;
    private javax.swing.JTextField text_patrimonio;
    private javax.swing.JTextField text_pmae;
    private javax.swing.JTextField text_processador;
    private javax.swing.JTextField text_sala;
    private javax.swing.JTextField text_ssd;
    private javax.swing.JTextArea texta_defeito;
    private javax.swing.JTextArea texta_solucao;
    // End of variables declaration//GEN-END:variables
}