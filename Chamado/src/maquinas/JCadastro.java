/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package maquinas;

import chamado.JMain;
import conexao.conexao_bd;
import javax.swing.JOptionPane;
import defeito.jCadastroDef;
import javax.swing.JDesktopPane;

/**
 *
 * @author alunos
 */
public class JCadastro extends javax.swing.JInternalFrame {
    private String negar ="0123456789";
    private static jCadastroDef jcd = new jCadastroDef();
    private static conexao_bd cbd = new conexao_bd();
    private static JMain jm = new JMain();
    private String matricula, nome;
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
    
    public void matricula(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    } 
    
    public void reseta(){
        text_processador.setText("Modelo");
        text_pmae.setText("Modelo");
        text_ram.setText("0");
        ftext_hd.setText("0");
        text_hd.setText("Modelo");
        ftext_ssd.setText("0");
        text_ssd.setText("Modelo");
        text_coolercpu.setText("Modelo");
        text_cooler.setText("Modelo");
        ftext_gpu.setText("0");
        text_fonte.setText("Modelo");
        ftext_fonte.setText("0");
        text_gabinete.setText("Modelo");
        text_patrimonio.setText("0");
        text_sala.setText("Sala");
        texta_defeito.setText("");
        
    }
    private void hidden(){
        //Esconde campos processador
        text_processador.setVisible(false);
        //Esconde texto placa mãe
        text_pmae.setVisible(false);
        //Esconde campos ram 
        text_ram.setVisible(false);
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
        int ram = Integer.parseInt(text_ram.getText());
        int hd = Integer.parseInt(ftext_hd.getText());
        int ssd = Integer.parseInt(ftext_ssd.getText());
        int gpu = Integer.parseInt(ftext_gpu.getText());
        int fonte = Integer.parseInt(ftext_fonte.getText());
        
        if(!check_processador.isSelected() && !check_pmae.isSelected() && !check_ram.isSelected() && !check_hd.isSelected() && !check_ssd.isSelected() && !check_coolercpu.isSelected() && !check_cooler.isSelected() && !check_gpu.isSelected() && !check_fonte.isSelected() && !check_gabinete.isSelected()){
            JOptionPane.showMessageDialog(null, "Nenhum componente informado!");
        }
        else if(check_processador.isSelected() && text_processador.getText().equals("") || check_processador.isSelected() && text_processador.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Processador: Dados inválidos!");
        }
        else if(check_pmae.isSelected() && text_pmae.getText().equals("") || check_pmae.isSelected() && text_pmae.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Placa mãe: Dados inválidos!");
        }
        else if(check_ram.isSelected() && ram <= 0) {
            JOptionPane.showMessageDialog(null, "Memória: Dados inválidos!");
        }
        else if(check_hd.isSelected() && hd <= 0){
            JOptionPane.showMessageDialog(null, "HD: Dados inválidos!");
        }
        else if(check_ssd.isSelected() && ssd <= 0){
            JOptionPane.showMessageDialog(null, "SSD: Dados inválidos!");
        }
        else if(check_coolercpu.isSelected() && text_coolercpu.getText().equals("") || check_coolercpu.isSelected() && text_coolercpu.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Cooler CPU: Dados inválidos!");
        }
        else if(check_cooler.isSelected() && text_cooler.getText().equals("") || check_cooler.isSelected() && text_cooler.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Cooler: Dados inválidos!");
        }
        else if(check_gpu.isSelected() && gpu <= 0){
            JOptionPane.showMessageDialog(null, "Placa de vídeo: Dados inválidos!");
        }
        else if(check_fonte.isSelected() && text_fonte.getText().equals("") || check_fonte.isSelected() && text_fonte.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Fonte: Dados inválidos!");
        }
        else if(check_fonte.isSelected() && fonte <= 0){
            JOptionPane.showMessageDialog(null, "Fonte: Dados inválidos!");
        }
        else if(check_gabinete.isSelected() && text_gabinete.getText().equals("") || check_gabinete.isSelected() && text_gabinete.getText().equals("Modelo")){
            JOptionPane.showMessageDialog(null, "Gabinete: Dados inválidos!");
        }
        else if(texta_defeito.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nenhum defeito informado!");
        }
        else {
             verifica = true;
        }
        return verifica;
    }
    
    private void verifica2(){
        boolean verifica;
        verifica = verifica();
        String processador, pmae, ram, hd, ssd, ccpu, cool, pvideo, fonte, gabinete, patrimonio, sala, matricula, defeito;
        processador = text_processador.getText();
        pmae = text_pmae.getText();
        ram = text_ram.getText() + box_capram.getSelectedItem() +" "+ box_ram.getSelectedItem() +" Qtd "+spinner_ram.getValue()+"x";
        hd = ftext_hd.getText() + box_caphd.getSelectedItem() +" "+ text_hd.getText() +" Qtd "+spinner_hd.getValue()+"x";
        ssd = ftext_ssd.getText() + box_capssd.getSelectedItem() +" "+ text_ssd.getText() +" Qtd "+spinner_ssd.getValue()+"x";
        ccpu = text_coolercpu.getText();
        cool = text_cooler.getText() +" Qtd "+ spinner_cooler.getValue();
        pvideo = ftext_gpu.getText() + box_capgpu.getSelectedItem() +" "+ box_gpu.getSelectedItem();
        fonte = text_fonte.getText() +" "+ftext_fonte.getText() + "W";
        gabinete = text_gabinete.getText();
        matricula = this.matricula;
        patrimonio = text_patrimonio.getText();
        sala = text_sala.getText();
        
        if(!check_processador.isSelected()){
            processador = "NULL";
        }
        else if(!check_pmae.isSelected()){
           pmae = "NULL";
        }
        else if(!check_ram.isSelected()) {
           ram = "NULL";
        }
        else if(!check_hd.isSelected()){
           hd = "NULL";
        }
        else if(!check_ssd.isSelected()){
           ssd = "NULL"; 
        }
        else if(!check_coolercpu.isSelected()){
           ccpu = "NULL";
        }
        else if(!check_cooler.isSelected()){
           cool = "NULL"; 
        }
        else if(!check_gpu.isSelected()){
           pvideo = "NULL";
        }
        else if(!check_fonte.isSelected()){
           fonte = "NULL";
        }
        else if(!check_gabinete.isSelected()){
           gabinete = "NULL";
        }
      
        if(verifica == true){
            JOptionPane.showMessageDialog(null, "Dados Salvos com sucesso!");
            cbd.CadastroMaquina(processador, pmae, ram, hd, ssd, ccpu, cool, pvideo, fonte, gabinete, matricula, patrimonio, sala);
            
            JDesktopPane desktop = getDesktopPane();
            desktop.add(jcd);
            jcd.defeitoInfo(texta_defeito.getText());
            jcd.setVisible(true);
            this.dispose();
            reseta();
        } 
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
        text_ram = new javax.swing.JFormattedTextField();
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
        text_patrimonio = new javax.swing.JTextField();
        text_sala = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de máquinas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/computer_add.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Componentes presentes na máquina:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));

        check_processador.setBackground(new java.awt.Color(51, 51, 51));
        check_processador.setForeground(new java.awt.Color(255, 255, 255));
        check_processador.setText("Processador");
        check_processador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_processadorStateChanged(evt);
            }
        });

        check_pmae.setBackground(new java.awt.Color(51, 51, 51));
        check_pmae.setForeground(new java.awt.Color(255, 255, 255));
        check_pmae.setText("Placa-mãe");
        check_pmae.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_pmaeStateChanged(evt);
            }
        });

        check_ram.setBackground(new java.awt.Color(51, 51, 51));
        check_ram.setForeground(new java.awt.Color(255, 255, 255));
        check_ram.setText("Memória");
        check_ram.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_ramStateChanged(evt);
            }
        });

        check_hd.setBackground(new java.awt.Color(51, 51, 51));
        check_hd.setForeground(new java.awt.Color(255, 255, 255));
        check_hd.setText("HD");
        check_hd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_hdStateChanged(evt);
            }
        });

        check_coolercpu.setBackground(new java.awt.Color(51, 51, 51));
        check_coolercpu.setForeground(new java.awt.Color(255, 255, 255));
        check_coolercpu.setText("Cooler CPU");
        check_coolercpu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_coolercpu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_coolercpuStateChanged(evt);
            }
        });

        check_gabinete.setBackground(new java.awt.Color(51, 51, 51));
        check_gabinete.setForeground(new java.awt.Color(255, 255, 255));
        check_gabinete.setText("Gabinete");
        check_gabinete.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_gabineteStateChanged(evt);
            }
        });

        check_gpu.setBackground(new java.awt.Color(51, 51, 51));
        check_gpu.setForeground(new java.awt.Color(255, 255, 255));
        check_gpu.setText("Placa de vídeo");
        check_gpu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_gpuStateChanged(evt);
            }
        });

        check_fonte.setBackground(new java.awt.Color(51, 51, 51));
        check_fonte.setForeground(new java.awt.Color(255, 255, 255));
        check_fonte.setText("Fonte");
        check_fonte.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_fonteStateChanged(evt);
            }
        });

        button_prox.setBackground(new java.awt.Color(255, 255, 255));
        button_prox.setForeground(new java.awt.Color(51, 51, 51));
        button_prox.setText("Próximo");
        button_prox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_proxMouseClicked(evt);
            }
        });

        text_processador.setBackground(new java.awt.Color(255, 255, 255));
        text_processador.setForeground(new java.awt.Color(0, 0, 0));
        text_processador.setText("Modelo");
        text_processador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_processadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_processadorFocusLost(evt);
            }
        });

        text_pmae.setBackground(new java.awt.Color(255, 255, 255));
        text_pmae.setForeground(new java.awt.Color(0, 0, 0));
        text_pmae.setText("Modelo");
        text_pmae.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_pmaeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_pmaeFocusLost(evt);
            }
        });

        qtd_ram.setBackground(new java.awt.Color(51, 51, 51));
        qtd_ram.setForeground(new java.awt.Color(255, 255, 255));
        qtd_ram.setText("Qtd.");

        spinner_ram.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));
        spinner_ram.setToolTipText("");
        spinner_ram.setBorder(null);

        check_ssd.setBackground(new java.awt.Color(51, 51, 51));
        check_ssd.setForeground(new java.awt.Color(255, 255, 255));
        check_ssd.setText("SSD");
        check_ssd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_ssdStateChanged(evt);
            }
        });

        text_ram.setBackground(new java.awt.Color(255, 255, 255));
        text_ram.setForeground(new java.awt.Color(51, 51, 51));
        text_ram.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        text_ram.setText("0");
        text_ram.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_ramFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_ramFocusLost(evt);
            }
        });
        text_ram.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_ramKeyTyped(evt);
            }
        });

        ftext_hd.setBackground(new java.awt.Color(255, 255, 255));
        ftext_hd.setForeground(new java.awt.Color(51, 51, 51));
        ftext_hd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftext_hd.setText("0");
        ftext_hd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftext_hdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftext_hdFocusLost(evt);
            }
        });
        ftext_hd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftext_hdKeyTyped(evt);
            }
        });

        ftext_ssd.setBackground(new java.awt.Color(255, 255, 255));
        ftext_ssd.setForeground(new java.awt.Color(51, 51, 51));
        ftext_ssd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftext_ssd.setText("0");
        ftext_ssd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftext_ssdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftext_ssdFocusLost(evt);
            }
        });
        ftext_ssd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftext_ssdKeyTyped(evt);
            }
        });

        qtd_hd.setBackground(new java.awt.Color(51, 51, 51));
        qtd_hd.setForeground(new java.awt.Color(255, 255, 255));
        qtd_hd.setText("Qtd.");

        spinner_hd.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));
        spinner_hd.setBorder(null);

        qtd_ssd.setBackground(new java.awt.Color(51, 51, 51));
        qtd_ssd.setForeground(new java.awt.Color(255, 255, 255));
        qtd_ssd.setText("Qtd.");

        spinner_ssd.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));
        spinner_ssd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        text_hd.setBackground(new java.awt.Color(255, 255, 255));
        text_hd.setForeground(new java.awt.Color(0, 0, 0));
        text_hd.setText("Modelo");
        text_hd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_hdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_hdFocusLost(evt);
            }
        });

        text_ssd.setBackground(new java.awt.Color(255, 255, 255));
        text_ssd.setForeground(new java.awt.Color(0, 0, 0));
        text_ssd.setText("Modelo");
        text_ssd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_ssdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_ssdFocusLost(evt);
            }
        });

        check_cooler.setBackground(new java.awt.Color(51, 51, 51));
        check_cooler.setForeground(new java.awt.Color(255, 255, 255));
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
        text_coolercpu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_coolercpuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_coolercpuFocusLost(evt);
            }
        });

        text_cooler.setBackground(new java.awt.Color(255, 255, 255));
        text_cooler.setForeground(new java.awt.Color(51, 51, 51));
        text_cooler.setText("Modelo");
        text_cooler.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_coolerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_coolerFocusLost(evt);
            }
        });

        box_ram.setBackground(new java.awt.Color(255, 255, 255));
        box_ram.setForeground(new java.awt.Color(0, 0, 0));
        box_ram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIMM", "DIMM", "DDR", "DDR2", "DDR3", "DDR4", "DDR5" }));

        spinner_cooler.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        qtd_cooler.setBackground(new java.awt.Color(51, 51, 51));
        qtd_cooler.setForeground(new java.awt.Color(255, 255, 255));
        qtd_cooler.setText("Qtd.");

        ftext_gpu.setBackground(new java.awt.Color(255, 255, 255));
        ftext_gpu.setForeground(new java.awt.Color(0, 0, 0));
        ftext_gpu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftext_gpu.setText("0");
        ftext_gpu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftext_gpuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftext_gpuFocusLost(evt);
            }
        });
        ftext_gpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftext_gpuKeyTyped(evt);
            }
        });

        box_gpu.setBackground(new java.awt.Color(255, 255, 255));
        box_gpu.setForeground(new java.awt.Color(0, 0, 0));
        box_gpu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PCI Express x1", "AGP", "PCI", "PCI Express x16", " " }));

        ftext_fonte.setBackground(new java.awt.Color(255, 255, 255));
        ftext_fonte.setForeground(new java.awt.Color(0, 0, 0));
        ftext_fonte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftext_fonte.setText("0");
        ftext_fonte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftext_fonteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftext_fonteFocusLost(evt);
            }
        });
        ftext_fonte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftext_fonteKeyTyped(evt);
            }
        });

        text_fonte.setBackground(new java.awt.Color(255, 255, 255));
        text_fonte.setForeground(new java.awt.Color(51, 51, 51));
        text_fonte.setText("Modelo");
        text_fonte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_fonteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_fonteFocusLost(evt);
            }
        });

        text_gabinete.setBackground(new java.awt.Color(255, 255, 255));
        text_gabinete.setForeground(new java.awt.Color(51, 51, 51));
        text_gabinete.setText("Modelo");
        text_gabinete.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_gabineteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_gabineteFocusLost(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Defeito");

        texta_defeito.setBackground(new java.awt.Color(255, 255, 255));
        texta_defeito.setColumns(20);
        texta_defeito.setForeground(new java.awt.Color(0, 0, 0));
        texta_defeito.setRows(5);
        jScrollPane1.setViewportView(texta_defeito);

        box_capram.setBackground(new java.awt.Color(255, 255, 255));
        box_capram.setForeground(new java.awt.Color(0, 0, 0));
        box_capram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB", "GB", "TB" }));

        box_caphd.setBackground(new java.awt.Color(255, 255, 255));
        box_caphd.setForeground(new java.awt.Color(0, 0, 0));
        box_caphd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB", "GB", "TB" }));

        box_capssd.setBackground(new java.awt.Color(255, 255, 255));
        box_capssd.setForeground(new java.awt.Color(0, 0, 0));
        box_capssd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB", "GB", "TB" }));

        box_capgpu.setBackground(new java.awt.Color(255, 255, 255));
        box_capgpu.setForeground(new java.awt.Color(0, 0, 0));
        box_capgpu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB", "GB", "TB" }));

        label_fonte.setBackground(new java.awt.Color(51, 51, 51));
        label_fonte.setForeground(new java.awt.Color(255, 255, 255));
        label_fonte.setText("W");

        text_patrimonio.setBackground(new java.awt.Color(255, 255, 255));
        text_patrimonio.setForeground(new java.awt.Color(0, 0, 0));
        text_patrimonio.setText("0");
        text_patrimonio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_patrimonioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_patrimonioFocusLost(evt);
            }
        });

        text_sala.setBackground(new java.awt.Color(255, 255, 255));
        text_sala.setForeground(new java.awt.Color(0, 0, 0));
        text_sala.setText("Sala");
        text_sala.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_salaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_salaFocusLost(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patrimônio");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sala");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_patrimonio)
                            .addComponent(text_sala))
                        .addGap(219, 219, 219))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(check_gabinete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_gabinete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(check_processador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_processador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(check_pmae)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_pmae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(check_ram)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_ram, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(box_capram, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(box_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(qtd_ram)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinner_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(check_fonte)
                                .addGap(18, 18, 18)
                                .addComponent(text_fonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftext_fonte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_fonte))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(check_hd)
                                .addGap(21, 21, 21)
                                .addComponent(ftext_hd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(box_caphd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(qtd_hd)
                                .addGap(18, 18, 18)
                                .addComponent(spinner_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(check_ssd)
                                .addGap(18, 18, 18)
                                .addComponent(ftext_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(box_capssd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(qtd_ssd)
                                .addGap(18, 18, 18)
                                .addComponent(spinner_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(check_gpu)
                                .addGap(18, 18, 18)
                                .addComponent(ftext_gpu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(box_capgpu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(box_gpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(check_coolercpu)
                                .addGap(18, 18, 18)
                                .addComponent(text_coolercpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(check_cooler)
                                .addGap(18, 18, 18)
                                .addComponent(text_cooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtd_cooler)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinner_cooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_prox))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_processador)
                        .addComponent(text_processador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(check_pmae)
                        .addComponent(text_pmae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_ram)
                        .addComponent(text_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(box_capram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(box_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtd_ram)
                        .addComponent(spinner_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtd_hd)
                        .addComponent(spinner_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_hd)
                        .addComponent(ftext_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(box_caphd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtd_ssd)
                        .addComponent(spinner_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(check_ssd)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ftext_ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(box_capssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_coolercpu)
                    .addComponent(text_coolercpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(button_prox))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
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
            text_ram.setVisible(true);
            box_ram.setVisible(true);
            box_capram.setVisible(true);
            qtd_ram.setVisible(true);
            spinner_ram.setVisible(true);
            invalidate();
            validate();
        }else{
            text_ram.setVisible(false);
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

    private void text_ramKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_ramKeyTyped
    if(!negar.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_text_ramKeyTyped

    private void ftext_hdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftext_hdKeyTyped
        if(!negar.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_ftext_hdKeyTyped

    private void ftext_ssdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftext_ssdKeyTyped
        if(!negar.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_ftext_ssdKeyTyped

    private void ftext_gpuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftext_gpuKeyTyped
        if(!negar.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_ftext_gpuKeyTyped

    private void ftext_fonteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftext_fonteKeyTyped
        if(!negar.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_ftext_fonteKeyTyped

    private void text_processadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_processadorFocusGained
        if(text_processador.getText().equals("Modelo")){
            text_processador.setText("");
        }
    }//GEN-LAST:event_text_processadorFocusGained

    private void text_processadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_processadorFocusLost
        if(text_processador.getText().equals("")){
            text_processador.setText("Modelo");
        }
    }//GEN-LAST:event_text_processadorFocusLost

    private void text_pmaeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_pmaeFocusGained
        if(text_pmae.getText().equals("Modelo")){
            text_pmae.setText("");
        }
    }//GEN-LAST:event_text_pmaeFocusGained

    private void text_pmaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_pmaeFocusLost
        if(text_pmae.getText().equals("")){
            text_pmae.setText("Modelo");
        }
    }//GEN-LAST:event_text_pmaeFocusLost

    private void text_ramFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ramFocusGained
        if(text_ram.getText().equals("0")){
            text_ram.setText("");
        }
    }//GEN-LAST:event_text_ramFocusGained

    private void text_ramFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ramFocusLost
        if(text_ram.getText().equals("")){
            text_ram.setText("0");
        }
    }//GEN-LAST:event_text_ramFocusLost

    private void ftext_hdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftext_hdFocusGained
        if(ftext_hd.getText().equals("0")){
            ftext_hd.setText("");
        }
    }//GEN-LAST:event_ftext_hdFocusGained

    private void ftext_hdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftext_hdFocusLost
        if(ftext_hd.getText().equals("")){
            ftext_hd.setText("0");
        }
    }//GEN-LAST:event_ftext_hdFocusLost

    private void text_hdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_hdFocusGained
        if(text_hd.getText().equals("Modelo")){
            text_hd.setText("");
        }
    }//GEN-LAST:event_text_hdFocusGained

    private void text_hdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_hdFocusLost
        if(text_hd.getText().equals("")){
            text_hd.setText("Modelo");
        }
    }//GEN-LAST:event_text_hdFocusLost

    private void ftext_ssdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftext_ssdFocusGained
        if(ftext_ssd.getText().equals("0")){
            ftext_ssd.setText("");
        }
    }//GEN-LAST:event_ftext_ssdFocusGained

    private void ftext_ssdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftext_ssdFocusLost
        if(ftext_ssd.getText().equals("")){
            ftext_ssd.setText("0");
        }
    }//GEN-LAST:event_ftext_ssdFocusLost

    private void text_ssdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ssdFocusGained
        if(text_ssd.getText().equals("Modelo")){
            text_ssd.setText("");
        }
    }//GEN-LAST:event_text_ssdFocusGained

    private void text_ssdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ssdFocusLost
        if(text_ssd.getText().equals("")){
            text_ssd.setText("Modelo");
        }
    }//GEN-LAST:event_text_ssdFocusLost

    private void text_coolercpuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_coolercpuFocusGained
        if(text_coolercpu.getText().equals("Modelo")){
            text_coolercpu.setText("");
        }
    }//GEN-LAST:event_text_coolercpuFocusGained

    private void text_coolercpuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_coolercpuFocusLost
        if(text_coolercpu.getText().equals("")){
            text_coolercpu.setText("Modelo");
        }
    }//GEN-LAST:event_text_coolercpuFocusLost

    private void text_coolerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_coolerFocusGained
        if(text_cooler.getText().equals("Modelo")){
            text_cooler.setText("");
        }
    }//GEN-LAST:event_text_coolerFocusGained

    private void text_coolerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_coolerFocusLost
        if(text_cooler.getText().equals("")){
            text_cooler.setText("Modelo");
        }
    }//GEN-LAST:event_text_coolerFocusLost

    private void ftext_gpuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftext_gpuFocusGained
        if(ftext_gpu.getText().equals("0")){
            ftext_gpu.setText("");
        }
    }//GEN-LAST:event_ftext_gpuFocusGained

    private void ftext_gpuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftext_gpuFocusLost
        if(ftext_gpu.getText().equals("")){
            ftext_gpu.setText("0");
        }
    }//GEN-LAST:event_ftext_gpuFocusLost

    private void text_fonteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_fonteFocusGained
        if(text_fonte.getText().equals("Modelo")){
            text_fonte.setText("");
        }
    }//GEN-LAST:event_text_fonteFocusGained

    private void text_fonteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_fonteFocusLost
        if(text_fonte.getText().equals("")){
            text_fonte.setText("Modelo");
        }
    }//GEN-LAST:event_text_fonteFocusLost

    private void ftext_fonteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftext_fonteFocusGained
        if(ftext_fonte.getText().equals("0")){
            ftext_fonte.setText("");
        }
    }//GEN-LAST:event_ftext_fonteFocusGained

    private void ftext_fonteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftext_fonteFocusLost
        if(ftext_fonte.getText().equals("")){
            ftext_fonte.setText("0");
        }
    }//GEN-LAST:event_ftext_fonteFocusLost

    private void text_gabineteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_gabineteFocusGained
        if(text_gabinete.getText().equals("Modelo")){
            text_gabinete.setText("");
        }
    }//GEN-LAST:event_text_gabineteFocusGained

    private void text_gabineteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_gabineteFocusLost
         if(text_gabinete.getText().equals("")){
            text_gabinete.setText("Modelo");
        }
    }//GEN-LAST:event_text_gabineteFocusLost

    private void button_proxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_proxMouseClicked
        verifica2();      
    }//GEN-LAST:event_button_proxMouseClicked

    private void text_patrimonioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_patrimonioFocusGained
        if(text_patrimonio.getText().equals("0")){
            text_patrimonio.setText("");
        }
    }//GEN-LAST:event_text_patrimonioFocusGained

    private void text_patrimonioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_patrimonioFocusLost
        if(text_patrimonio.getText().equals("")){
            text_patrimonio.setText("0");
        }
    }//GEN-LAST:event_text_patrimonioFocusLost

    private void text_salaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_salaFocusGained
        if(text_sala.getText().equals("Sala")){
            text_sala.setText("");
        }
    }//GEN-LAST:event_text_salaFocusGained

    private void text_salaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_salaFocusLost
        if(text_sala.getText().equals("")){
            text_sala.setText("Sala");
        }
    }//GEN-LAST:event_text_salaFocusLost


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
    private javax.swing.JFormattedTextField ftext_ssd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
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
    private javax.swing.JTextField text_patrimonio;
    private javax.swing.JTextField text_pmae;
    private javax.swing.JTextField text_processador;
    private javax.swing.JFormattedTextField text_ram;
    private javax.swing.JTextField text_sala;
    private javax.swing.JTextField text_ssd;
    private javax.swing.JTextArea texta_defeito;
    // End of variables declaration//GEN-END:variables
}