/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package conexao;

import chamado.JMain;
import clientes.JClientePerg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class JInstituicaoExistente extends javax.swing.JInternalFrame {
    
    conexao_bd cbd = new conexao_bd();
    static String url ="jdbc:mysql://172.20.126.217:3306/ChamadoSENAC";
    static String username ="chamado";
    static String password ="root";
    Connection conexao = null;
    Connection con = conexao;
    Statement st = null;
    ResultSet result = null;
    DefaultListModel model;
    int Enter = 0;
    private String patrimonio="";

    public JInstituicaoExistente() {
            initComponents();
            conectar();
            MostraPesquisa();
            list_pesquisa.setVisible(true);
            model = new DefaultListModel();
            list_pesquisa.setModel(model);  
    }  
     private void conectar(){
         try{
            conexao = DriverManager.getConnection(url,username,password);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro JIE43","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void desconectar(){
        try {
            st.close();
            conexao.close();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro JIE51","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void  Busca () {    
           try {
            String InstrucaoSQL= "SELECT * FROM instituicoes where Nome like '" + text_nomepesquisa.getText() + "%'";
            executaSQL(InstrucaoSQL);
            model.removeAllElements();
            int i = 0;

            while (result.next() && i<4) {
                model.addElement(result.getString("nome"));
                i++;
                }
            if (i >= 4) {
                list_pesquisa.setVisible(true);
            }
             
            ResultadoPesquisa();
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null,"ERRO:JIE60", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
   }   
   private void executaSQL(String sql) {
        try {
            st = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            result = st.executeQuery(sql);  
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showInternalMessageDialog(null,"ERRO:JIE80", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void ResultadoPesquisa() {
          try {
            result.first();
            text_cnpjresult.setText(result.getString("CNPJ"));
            text_nomeresult.setText(result.getString("Nome"));          
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showInternalMessageDialog(null,"ERRO:JIE89", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
   private void MostraPesquisa() {
        int Linha = list_pesquisa.getSelectedIndex();
        if (Linha >= 0) {
            String InstrucaoSQL="SELECT nome FROM instituicoes where nome= "+Linha+" ";
            executaSQL(InstrucaoSQL);
            ResultadoPesquisa();
        }
    }
   public void patrimonio(String patrimonio){
        this.patrimonio = patrimonio;
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
        text_nomeresult = new javax.swing.JTextField();
        label_nomeresult = new javax.swing.JLabel();
        text_cnpjresult = new javax.swing.JTextField();
        label_cnpjresult = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        text_nomepesquisa = new javax.swing.JTextField();
        list_pesquisa = new javax.swing.JList<>();
        button_add = new javax.swing.JButton();
        button_voltar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Insituição Existente");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/building.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        text_nomeresult.setEditable(false);
        text_nomeresult.setBackground(new java.awt.Color(255, 255, 255));
        text_nomeresult.setForeground(new java.awt.Color(51, 51, 51));

        label_nomeresult.setBackground(new java.awt.Color(51, 51, 51));
        label_nomeresult.setForeground(new java.awt.Color(255, 255, 255));
        label_nomeresult.setText("Nome:");

        text_cnpjresult.setEditable(false);
        text_cnpjresult.setBackground(new java.awt.Color(255, 255, 255));
        text_cnpjresult.setForeground(new java.awt.Color(0, 0, 0));

        label_cnpjresult.setBackground(new java.awt.Color(51, 51, 51));
        label_cnpjresult.setForeground(new java.awt.Color(255, 255, 255));
        label_cnpjresult.setText("CNPJ");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLayeredPane1.setForeground(new java.awt.Color(51, 51, 51));

        text_nomepesquisa.setBackground(new java.awt.Color(255, 255, 255));
        text_nomepesquisa.setForeground(new java.awt.Color(51, 51, 51));
        text_nomepesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        text_nomepesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nomepesquisaActionPerformed(evt);
            }
        });
        text_nomepesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_nomepesquisaKeyReleased(evt);
            }
        });

        list_pesquisa.setBackground(new java.awt.Color(255, 255, 255));
        list_pesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        list_pesquisa.setForeground(new java.awt.Color(0, 0, 0));
        list_pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                list_pesquisaMousePressed(evt);
            }
        });

        jLayeredPane1.setLayer(text_nomepesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(list_pesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text_nomepesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(list_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_nomepesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(list_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        button_add.setBackground(new java.awt.Color(255, 255, 255));
        button_add.setForeground(new java.awt.Color(0, 0, 0));
        button_add.setText("Adicionar");
        button_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addMouseClicked(evt);
            }
        });

        button_voltar.setBackground(new java.awt.Color(255, 255, 255));
        button_voltar.setForeground(new java.awt.Color(0, 0, 0));
        button_voltar.setText("Voltar");
        button_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_voltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(button_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_add))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label_cnpjresult, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(text_cnpjresult, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label_nomeresult, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(text_nomeresult, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nomeresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nomeresult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_cnpjresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cnpjresult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_add)
                    .addComponent(button_voltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_nomepesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nomepesquisaActionPerformed
        list_pesquisa.setVisible(false);
        Enter = 1;
    }//GEN-LAST:event_text_nomepesquisaActionPerformed

    private void text_nomepesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_nomepesquisaKeyReleased
        if(Enter == 0){
            Busca();
        }else{
            Enter = 0;
        }
    }//GEN-LAST:event_text_nomepesquisaKeyReleased

    private void list_pesquisaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_pesquisaMousePressed
        MostraPesquisa();
        list_pesquisa.setVisible(false);
    }//GEN-LAST:event_list_pesquisaMousePressed

    private void button_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addMouseClicked
        String nome="";
        nome = text_nomeresult.getText();
        cbd.BuscaJIE(nome,this.patrimonio);
        dispose();
    }//GEN-LAST:event_button_addMouseClicked

    private void button_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_voltarMouseClicked
        JClientePerg JCP = new JClientePerg();
        getParent().add(JCP);
        JCP.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_voltar;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_cnpjresult;
    private javax.swing.JLabel label_nomeresult;
    private javax.swing.JList<String> list_pesquisa;
    private javax.swing.JTextField text_cnpjresult;
    private javax.swing.JTextField text_nomepesquisa;
    private javax.swing.JTextField text_nomeresult;
    // End of variables declaration//GEN-END:variables
}
