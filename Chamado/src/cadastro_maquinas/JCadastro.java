/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cadastro_maquinas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class JCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form JCadastro
     */
    public JCadastro() {
        initComponents();
        hidden();
        check_processador.setSelected(true);
        check_pmae.setSelected(true);
        check_ram.setSelected(true);
        check_hd.setSelected(true);
        check_coolercpu.setSelected(true);
        check_fonte.setSelected(true);
        check_gabinete.setSelected(true);
    }
    
    private void hidden(){
        //Esconde campos processador
        text_processador.setVisible(false);
        //Esconde texto placa mãe
        text_pmae.setVisible(false);
        //Esconde campos ram 
        ftext_ram.setVisible(false);
        box_ram.setVisible(false);
        box_capram.setVisible(false);
        qtd_ram.setVisible(false);
        spinner_ram.setVisible(false);
        //Esconde campos hd
        ftext_hd.setVisible(false);
        box_caphd.setVisible(false);
        text_hd.setVisible(false);
        qtd_hd.setVisible(false);
        spinner_hd.setVisible(false);
        //Esconde campos ssd
        ftext_ssd.setVisible(false);
        box_capssd.setVisible(false);
        text_ssd.setVisible(false);
        qtd_ssd.setVisible(false);
        spinner_ssd.setVisible(false);
        //Esconde campos coolers
        text_coolercpu.setVisible(false);
        text_cooler.setVisible(false);
        qtd_cooler.setVisible(false);
        spinner_cooler.setVisible(false);
        //Esconde campos gpu
        ftext_gpu.setVisible(false);
        box_gpu.setVisible(false);
        box_capgpu.setVisible(false);
        //Esconde campos fonte
        text_fonte.setVisible(false);
        ftext_fonte.setVisible(false);
        label_fonte.setVisible(false);
        //Esconde campos gabinete
        text_gabinete.setVisible(false);
    }
    private boolean verifica(){
        boolean verifica = false;
        if(!check_processador.isSelected() && !check_pmae.isSelected() && !check_ram.isSelected() && !check_hd.isSelected() && !check_ssd.isSelected() && !check_coolercpu.isSelected() && !check_cooler.isSelected() && !check_gpu.isSelected() && !check_fonte.isSelected() && !check_gabinete.isSelected()){
            JOptionPane.showMessageDialog(null, "Nenhum componente informado !!!");
        }
        else if(check_processador.isSelected() && text_processador.getText().equals("") || check_processador.isSelected() && text_processador.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Processador: Dados inválidos !!!");
        }
        else if(check_pmae.isSelected() && text_pmae.getText().equals("") || check_pmae.isSelected() && text_pmae.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Placa mãe: Dados inválidos !!!");
        }
        else if(check_ram.isSelected() && ftext_ram.getText().equals("    GB")) {
            JOptionPane.showMessageDialog(null, "Memória: Dados inválidos !!!");
        }
        else if(check_hd.isSelected() && ftext_hd.getText().equals("     GB")){
            JOptionPane.showMessageDialog(null, "HD: Dados inválidos !!!");
        }
        else if(check_ssd.isSelected() && ftext_ssd.getText().equals("     GB")){
            JOptionPane.showMessageDialog(null, "SSD: Dados inválidos !!!");
        }
        else if(check_coolercpu.isSelected() && text_coolercpu.getText().equals("") || check_coolercpu.isSelected() && text_coolercpu.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Cooler CPU: Dados inválidos !!!");
        }
        else if(check_cooler.isSelected() && text_cooler.getText().equals("") || check_cooler.isSelected() && text_cooler.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Cooler: Dados inválidos !!!");
        }
        else if(check_gpu.isSelected() && ftext_gpu.getText().equals("      MB")){
            JOptionPane.showMessageDialog(null, "Placa de vídeo: Dados inválidos !!!");
        }
        else if(check_fonte.isSelected() && text_fonte.getText().equals("") || check_fonte.isSelected() && text_fonte.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Fonte: Dados inválidos !!!");
        }
        else if(check_fonte.isSelected() && ftext_fonte.getText().equals("     W")){
            JOptionPane.showMessageDialog(null, "Fonte: Dados inválidos !!!");
        }
        else if(check_gabinete.isSelected() && text_gabinete.getText().equals("") || check_gabinete.isSelected() && text_gabinete.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Gabinete: Dados inválidos !!!");
        }
        else if(texta_defeito.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nenhum defeito informado !!!");
        }
        else {
             verifica = true;
        }
        return verifica;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        check_processador = new javax.swing.JCheckBox();
        check_pmae = new javax.swing.JCheckBox();
        check_ram = new javax.swing.JCheckBox();
        check_hd = new javax.swing.JCheckBox();
        check_coolercpu = new javax.swing.JCheckBox();
        check_gabinete = new javax.swing.JCheckBox();
        check_gpu = new javax.swing.JCheckBox();
        check_fonte = new javax.swing.JCheckBox();
        button_prox = new javax.swing.JButton();
        text_processador = new javax.swing.JTextField();
        text_pmae = new javax.swing.JTextField();
        qtd_ram = new javax.swing.JLabel();
        spinner_ram = new javax.swing.JSpinner();
        check_ssd = new javax.swing.JCheckBox();
        ftext_ram = new javax.swing.JFormattedTextField();
        ftext_hd = new javax.swing.JFormattedTextField();
        ftext_ssd = new javax.swing.JFormattedTextField();
        qtd_hd = new javax.swing.JLabel();
        spinner_hd = new javax.swing.JSpinner();
        qtd_ssd = new javax.swing.JLabel();
        spinner_ssd = new javax.swing.JSpinner();
        text_hd = new javax.swing.JTextField();
        text_ssd = new javax.swing.JTextField();
        check_cooler = new javax.swing.JCheckBox();
        text_coolercpu = new javax.swing.JTextField();
        text_cooler = new javax.swing.JTextField();
        box_ram = new javax.swing.JComboBox<>();
        spinner_cooler = new javax.swing.JSpinner();
        qtd_cooler = new javax.swing.JLabel();
        ftext_gpu = new javax.swing.JFormattedTextField();
        box_gpu = new javax.swing.JComboBox<>();
        ftext_fonte = new javax.swing.JFormattedTextField();
        text_fonte = new javax.swing.JTextField();
        text_gabinete = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texta_defeito = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        box_capram = new javax.swing.JComboBox<>();
        box_caphd = new javax.swing.JComboBox<>();
        box_capssd = new javax.swing.JComboBox<>();
        box_capgpu = new javax.swing.JComboBox<>();
        label_fonte = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de máquinas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/computer_add.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Componentes presentes na máquina:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        check_processador.setBackground(new java.awt.Color(102, 102, 102));
        check_processador.setForeground(new java.awt.Color(0, 0, 0));
        check_processador.setText("Processador");
        check_processador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_processadorStateChanged(evt);
            }
        });

        check_pmae.setBackground(new java.awt.Color(102, 102, 102));
        check_pmae.setForeground(new java.awt.Color(0, 0, 0));
        check_pmae.setText("Placa-mãe");
        check_pmae.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_pmaeStateChanged(evt);
            }
        });

        check_ram.setBackground(new java.awt.Color(102, 102, 102));
        check_ram.setForeground(new java.awt.Color(0, 0, 0));
        check_ram.setText("Memória");
        check_ram.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_ramStateChanged(evt);
            }
        });

        check_hd.setBackground(new java.awt.Color(102, 102, 102));
        check_hd.setForeground(new java.awt.Color(0, 0, 0));
        check_hd.setText("HD");
        check_hd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_hdStateChanged(evt);
            }
        });

        check_coolercpu.setBackground(new java.awt.Color(102, 102, 102));
        check_coolercpu.setForeground(new java.awt.Color(0, 0, 0));
        check_coolercpu.setText("Cooler CPU");
        check_coolercpu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_coolercpu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_coolercpuStateChanged(evt);
            }
        });

        check_gabinete.setBackground(new java.awt.Color(102, 102, 102));
        check_gabinete.setForeground(new java.awt.Color(0, 0, 0));
        check_gabinete.setText("Gabinete");
        check_gabinete.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_gabineteStateChanged(evt);
            }
        });

        check_gpu.setBackground(new java.awt.Color(102, 102, 102));
        check_gpu.setForeground(new java.awt.Color(0, 0, 0));
        check_gpu.setText("Placa de vídeo");
        check_gpu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_gpuStateChanged(evt);
            }
        });

        check_fonte.setBackground(new java.awt.Color(102, 102, 102));
        check_fonte.setForeground(new java.awt.Color(0, 0, 0));
        check_fonte.setText("Fonte");
        check_fonte.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_fonteStateChanged(evt);
            }
        });

        button_prox.setForeground(new java.awt.Color(0, 0, 0));
        button_prox.setText("Próximo");
        button_prox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_proxMouseClicked(evt);
            }
        });

        text_processador.setBackground(new java.awt.Color(255, 255, 255));
        text_processador.setForeground(new java.awt.Color(0, 0, 0));
        text_processador.setText("Modelo");

        text_pmae.setBackground(new java.awt.Color(255, 255, 255));
        text_pmae.setForeground(new java.awt.Color(0, 0, 0));
        text_pmae.setText("Modelo");

        qtd_ram.setBackground(new java.awt.Color(102, 102, 102));
        qtd_ram.setForeground(new java.awt.Color(0, 0, 0));
        qtd_ram.setText("Qtd.");

        spinner_ram.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));
        spinner_ram.setToolTipText("");
        spinner_ram.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        check_ssd.setBackground(new java.awt.Color(102, 102, 102));
        check_ssd.setForeground(new java.awt.Color(0, 0, 0));
        check_ssd.setText("SSD");
        check_ssd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_ssdStateChanged(evt);
            }
        });

<<<<<<< Updated upstream
        ftext_ram.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        ftext_hd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        ftext_ssd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
=======
        ftext_ram.setBackground(new java.awt.Color(255, 255, 255));
        ftext_ram.setForeground(new java.awt.Color(0, 0, 0));
        try {
            ftext_ram.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### GB")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ftext_hd.setBackground(new java.awt.Color(255, 255, 255));
        ftext_hd.setForeground(new java.awt.Color(0, 0, 0));
        try {
            ftext_hd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### GB")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ftext_ssd.setBackground(new java.awt.Color(255, 255, 255));
        ftext_ssd.setForeground(new java.awt.Color(0, 0, 0));
        try {
            ftext_ssd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### GB")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
>>>>>>> Stashed changes

        qtd_hd.setBackground(new java.awt.Color(102, 102, 102));
        qtd_hd.setForeground(new java.awt.Color(0, 0, 0));
        qtd_hd.setText("Qtd.");

        spinner_hd.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));

        qtd_ssd.setBackground(new java.awt.Color(102, 102, 102));
        qtd_ssd.setForeground(new java.awt.Color(0, 0, 0));
        qtd_ssd.setText("Qtd.");

        spinner_ssd.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));

        text_hd.setBackground(new java.awt.Color(255, 255, 255));
        text_hd.setForeground(new java.awt.Color(0, 0, 0));
        text_hd.setText("Modelo");

        text_ssd.setBackground(new java.awt.Color(255, 255, 255));
        text_ssd.setForeground(new java.awt.Color(0, 0, 0));
        text_ssd.setText("Modelo");

        check_cooler.setBackground(new java.awt.Color(102, 102, 102));
        check_cooler.setForeground(new java.awt.Color(0, 0, 0));
        check_cooler.setText("Cooler ");
        check_cooler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_cooler.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_coolerStateChanged(evt);
            }
        });

        text_coolercpu.setBackground(new java.awt.Color(255, 255, 255));
        text_coolercpu.setForeground(new java.awt.Color(0, 0, 0));
        text_coolercpu.setText("Modelo");

        text_cooler.setBackground(new java.awt.Color(255, 255, 255));
        text_cooler.setForeground(new java.awt.Color(0, 0, 0));
        text_cooler.setText("Modelo");

        box_ram.setBackground(new java.awt.Color(255, 255, 255));
        box_ram.setForeground(new java.awt.Color(0, 0, 0));
        box_ram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIMM", "DIMM", "DDR", "DDR2", "DDR3", "DDR4", "DDR5" }));

        spinner_cooler.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        qtd_cooler.setBackground(new java.awt.Color(102, 102, 102));
        qtd_cooler.setForeground(new java.awt.Color(0, 0, 0));
        qtd_cooler.setText("Qtd.");

<<<<<<< Updated upstream
        ftext_gpu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
=======
        ftext_gpu.setBackground(new java.awt.Color(255, 255, 255));
        ftext_gpu.setForeground(new java.awt.Color(0, 0, 0));
        try {
            ftext_gpu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##### MB")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
>>>>>>> Stashed changes

        box_gpu.setBackground(new java.awt.Color(255, 255, 255));
        box_gpu.setForeground(new java.awt.Color(0, 0, 0));
        box_gpu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PCI Express x1", "AGP", "PCI", "PCI Express x16", " " }));

<<<<<<< Updated upstream
        ftext_fonte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
=======
        ftext_fonte.setBackground(new java.awt.Color(255, 255, 255));
        ftext_fonte.setForeground(new java.awt.Color(0, 0, 0));
        try {
            ftext_fonte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### W")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
>>>>>>> Stashed changes

        text_fonte.setBackground(new java.awt.Color(255, 255, 255));
        text_fonte.setForeground(new java.awt.Color(0, 0, 0));
        text_fonte.setText("Modelo");

        text_gabinete.setBackground(new java.awt.Color(255, 255, 255));
        text_gabinete.setForeground(new java.awt.Color(0, 0, 0));
        text_gabinete.setText("Modelo");

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Defeito");

        texta_defeito.setBackground(new java.awt.Color(255, 255, 255));
        texta_defeito.setColumns(20);
        texta_defeito.setForeground(new java.awt.Color(0, 0, 0));
        texta_defeito.setRows(5);
        jScrollPane1.setViewportView(texta_defeito);

        box_capram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB", "GB", "TB" }));

        box_caphd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB", "GB", "TB" }));

        box_capssd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB", "GB", "TB" }));

        box_capgpu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB", "GB", "TB" }));

        label_fonte.setText("W");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(check_coolercpu)
                                .addGap(18, 18, 18)
                                .addComponent(text_coolercpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(button_prox))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(check_gabinete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_gabinete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(check_processador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(text_processador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(check_pmae)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(text_pmae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(check_fonte)
                                        .addGap(18, 18, 18)
                                        .addComponent(text_fonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftext_fonte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_fonte))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(check_cooler)
                                        .addGap(18, 18, 18)
                                        .addComponent(text_cooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qtd_cooler)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spinner_cooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(check_gpu)
                                        .addGap(18, 18, 18)
                                        .addComponent(ftext_gpu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(box_capgpu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(box_gpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(check_ssd)
                                                .addGap(18, 18, 18)
                                                .addComponent(ftext_ssd))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(check_hd)
                                                .addGap(21, 21, 21)
                                                .addComponent(ftext_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(box_caphd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(text_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(qtd_hd)
                                                .addGap(18, 18, 18)
                                                .addComponent(spinner_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(box_capssd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(text_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(qtd_ssd)
                                                .addGap(18, 18, 18)
                                                .addComponent(spinner_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(check_ram)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ftext_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(box_capram, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(box_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(qtd_ram)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spinner_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 37, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_processador)
                    .addComponent(text_processador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_pmae)
                    .addComponent(text_pmae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_ram)
                    .addComponent(ftext_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_capram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_ram)
                    .addComponent(spinner_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_hd)
                        .addComponent(ftext_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtd_hd)
                        .addComponent(spinner_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(box_caphd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_ssd)
                    .addComponent(ftext_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtd_ssd)
                        .addComponent(spinner_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(box_capssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_coolercpu)
                    .addComponent(text_coolercpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_cooler)
                    .addComponent(text_cooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_cooler)
                    .addComponent(spinner_cooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_gpu)
                    .addComponent(ftext_gpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_gpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_capgpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_fonte)
                    .addComponent(ftext_fonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_fonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_fonte))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_gabinete)
                    .addComponent(text_gabinete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(button_prox)
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

    private void check_processadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_processadorStateChanged
        // TODO add your handling code here:
        if(check_processador.isSelected()){
            text_processador.setVisible(true);
            invalidate();
            validate();
        }else{
            text_processador.setVisible(false);
            invalidate();
            validate();
        }
    }//GEN-LAST:event_check_processadorStateChanged

    private void check_pmaeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_pmaeStateChanged
        // TODO add your handling code here:
        if(check_pmae.isSelected()){
            text_pmae.setVisible(true);
            invalidate();
            validate();
        }else{
            text_pmae.setVisible(false);
            invalidate();
            validate();
        }
    }//GEN-LAST:event_check_pmaeStateChanged

    private void check_ramStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_ramStateChanged
        // TODO add your handling code here:
        if(check_ram.isSelected()){
            ftext_ram.setVisible(true);
            box_ram.setVisible(true);
            box_capram.setVisible(true);
            qtd_ram.setVisible(true);
            spinner_ram.setVisible(true);
            invalidate();
            validate();
        }else{
            ftext_ram.setVisible(false);
            box_ram.setVisible(false);
            box_capram.setVisible(false);
            qtd_ram.setVisible(false);
            spinner_ram.setVisible(false);
            invalidate();
            validate();
        }
    }//GEN-LAST:event_check_ramStateChanged

    private void check_hdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_hdStateChanged
        // TODO add your handling code here:
        if(check_hd.isSelected()){
            ftext_hd.setVisible(true);
            box_caphd.setVisible(true);
            text_hd.setVisible(true);
            qtd_hd.setVisible(true);
            spinner_hd.setVisible(true);
            invalidate();
            validate();
        }else{
            ftext_hd.setVisible(false);
            box_caphd.setVisible(false);
            text_hd.setVisible(false);
            qtd_hd.setVisible(false);
            spinner_hd.setVisible(false);
            invalidate();
            validate();
        }
    }//GEN-LAST:event_check_hdStateChanged

    private void check_ssdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_ssdStateChanged
        // TODO add your handling code here:
        if(check_ssd.isSelected()){
            ftext_ssd.setVisible(true);
            box_capssd.setVisible(true);
            text_ssd.setVisible(true);
            qtd_ssd.setVisible(true);
            spinner_ssd.setVisible(true);
            invalidate();
            validate();
        }else{
            ftext_ssd.setVisible(false);
            box_capssd.setVisible(false);
            text_ssd.setVisible(false);
            qtd_ssd.setVisible(false);
            spinner_ssd.setVisible(false);
            invalidate();
            validate();
        }
    }//GEN-LAST:event_check_ssdStateChanged

    private void check_coolercpuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_coolercpuStateChanged
        // TODO add your handling code here:
        if(check_coolercpu.isSelected()){
            text_coolercpu.setVisible(true);
            invalidate();
            validate();
        }else{
            text_coolercpu.setVisible(false);
            invalidate();
            validate();
        }
    }//GEN-LAST:event_check_coolercpuStateChanged

    private void check_coolerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_coolerStateChanged
        // TODO add your handling code here:
        if(check_cooler.isSelected()){
            text_cooler.setVisible(true);
            qtd_cooler.setVisible(true);
            spinner_cooler.setVisible(true);
            invalidate();
            validate();
        }else{
            text_cooler.setVisible(false);
            qtd_cooler.setVisible(false);
            spinner_cooler.setVisible(false);
            invalidate();
            validate();
        }
    }//GEN-LAST:event_check_coolerStateChanged

    private void check_gpuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_gpuStateChanged
        // TODO add your handling code here:
        if(check_gpu.isSelected()){
            ftext_gpu.setVisible(true);
            box_capgpu.setVisible(true);
            box_gpu.setVisible(true);
            invalidate();
            validate();
        }else{
            ftext_gpu.setVisible(false);
            box_capgpu.setVisible(false);
            box_gpu.setVisible(false);
            invalidate();
            validate();
        }
    }//GEN-LAST:event_check_gpuStateChanged

    private void check_fonteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_fonteStateChanged
        // TODO add your handling code here:
        if(check_fonte.isSelected()){
            text_fonte.setVisible(true);
            ftext_fonte.setVisible(true);
            label_fonte.setVisible(true);
            invalidate();
            validate();
        }else{
            text_fonte.setVisible(false);
            ftext_fonte.setVisible(false);
            label_fonte.setVisible(false);
            invalidate();
            validate();
        }
    }//GEN-LAST:event_check_fonteStateChanged

    private void check_gabineteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_gabineteStateChanged
        // TODO add your handling code here:
        if(check_gabinete.isSelected()){
            text_gabinete.setVisible(true);
            invalidate();
            validate();
        }else{
            text_gabinete.setVisible(false);
            invalidate();
            validate();
        }
    }//GEN-LAST:event_check_gabineteStateChanged

    private void button_proxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_proxMouseClicked
        boolean verifica;
        verifica = verifica();
        if(verifica == true){
            JOptionPane.showMessageDialog(null, "Dados Salvos com sucesso !!!");
        }
    }//GEN-LAST:event_button_proxMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_capgpu;
    private javax.swing.JComboBox<String> box_caphd;
    private javax.swing.JComboBox<String> box_capram;
    private javax.swing.JComboBox<String> box_capssd;
    private javax.swing.JComboBox<String> box_gpu;
    private javax.swing.JComboBox<String> box_ram;
    private javax.swing.JButton button_prox;
    private javax.swing.JCheckBox check_cooler;
    private javax.swing.JCheckBox check_coolercpu;
    private javax.swing.JCheckBox check_fonte;
    private javax.swing.JCheckBox check_gabinete;
    private javax.swing.JCheckBox check_gpu;
    private javax.swing.JCheckBox check_hd;
    private javax.swing.JCheckBox check_pmae;
    private javax.swing.JCheckBox check_processador;
    private javax.swing.JCheckBox check_ram;
    private javax.swing.JCheckBox check_ssd;
    private javax.swing.JFormattedTextField ftext_fonte;
    private javax.swing.JFormattedTextField ftext_gpu;
    private javax.swing.JFormattedTextField ftext_hd;
    private javax.swing.JFormattedTextField ftext_ram;
    private javax.swing.JFormattedTextField ftext_ssd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel label_fonte;
    private javax.swing.JLabel qtd_cooler;
    private javax.swing.JLabel qtd_hd;
    private javax.swing.JLabel qtd_ram;
    private javax.swing.JLabel qtd_ssd;
    private javax.swing.JSpinner spinner_cooler;
    private javax.swing.JSpinner spinner_hd;
    private javax.swing.JSpinner spinner_ram;
    private javax.swing.JSpinner spinner_ssd;
    private javax.swing.JTextField text_cooler;
    private javax.swing.JTextField text_coolercpu;
    private javax.swing.JTextField text_fonte;
    private javax.swing.JTextField text_gabinete;
    private javax.swing.JTextField text_hd;
    private javax.swing.JTextField text_pmae;
    private javax.swing.JTextField text_processador;
    private javax.swing.JTextField text_ssd;
    private javax.swing.JTextArea texta_defeito;
    // End of variables declaration//GEN-END:variables
}
