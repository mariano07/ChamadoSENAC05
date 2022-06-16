/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ajuda;

import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class JMenu_Ajuda extends javax.swing.JInternalFrame {

    /**
     * Creates new form Menu_Ajuda
     */
    public JMenu_Ajuda() {
        initComponents();
        }
    
    public void setTextAjuda(){
        
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<h1>");
        sb.append("Menu de Ajuda");
        sb.append("</h1>");
        sb.append("<a>");
        sb.append("Bem vindo ao menu de ajuda do Chamado do Senac RS - Tramandaí.");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("Aqui você vai encontrar instruções de uso de todas as funções do programa e");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("os códigos de erros possíveis e seus significados.");
        sb.append("</a>");
        sb.append("<h2>");
        sb.append("Funções  do Programa");
        sb.append("</h2>");
        sb.append("<a>");
        sb.append("<b>");
        sb.append("1 - Menus");
        sb.append("</b>");
        sb.append("<br>");
        sb.append("</a>" );
        sb.append("<a>");
        sb.append("Nos menus é onde ficam todas as funções principais do programa na ordem temos Usuário, Cadastro de Máquinas, Procurar e Ténicos.");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("Cada menu tem sua função especifica ou itens dentro dele com funções referentes ao nome do menu.");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("<b>");
        sb.append("• Menu do Usuário");
        sb.append("</b>");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("Nesse menu existem duas opções");
        sb.append(" <b>");
        sb.append("Menu Ajuda");
        sb.append("</b>");
        sb.append(" e ");
        sb.append("<b>");
        sb.append("Deslogar");
        sb.append("</b>. ");
        sb.append("O ");
        sb.append("<b>");
        sb.append("Menu Ajuda");
        sb.append("</b>");
        sb.append(" é onde você acessa esse menu que está vendo agora ");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("e o ");
        sb.append("<b>");
        sb.append("Deslogar");
        sb.append("</b>");
        sb.append(" é para fazer o Logoff do programa e entrar usando ou Usuário e Senha.");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("<b>");
        sb.append("• Cadastro de Máquinas");
        sb.append("</b>");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("Nesse menu é onde o Usuário pode fazer o cadastro de uma máquina informando todos os dados necessários para um melhor controle de quem fez a manutenção, em qual máquina foi feita a manutenção e quando foi realizada. Esses são alguns exemplos de informações que serão inseridas juntas de diversas outras informações importanes.");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("<b>");
        sb.append("• Procurar");
        sb.append("</b>");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("Nesse menu é onde o Professor vai poder procurar as máquinas registradas, usuários e chamados, podendo escolher entre filtros para facilitar na sua pesquisa. Já os Técnicos poderão apenas pesquisar sobre seus próprios registros para manter um melhor controle de datas e tarefas que devem ser realizadas.");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("<b>");
        sb.append("• Técnicos");
        sb.append("</b>");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("Nesse menu é onde o Professor poderá registrar os alunos como técnicos assim podendo ter controle sobre cada manutenção realizada, nele também é possivel excluir um cadastro ou editar para caso algum dado tenha sido inserido de forma errada");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<h3>");
        sb.append("Códigos de ERRO");
        sb.append("</h3>");
        sb.append("<a>");
        sb.append("<b>");
        sb.append("• C023");
        sb.append("</b>");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("C023 significa que houve um erro de conexão ao Banco de Dados");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("<b>");
        sb.append("• C031");
        sb.append("</b>");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("C031 significa que houve um erro na hora de desconectar do Banco de Dados ");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("<b>• C050");
        sb.append("</b>");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("C050 significa que houve um erro no login, usuário ou senha errados ou inválidos ");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("<b>• C071");
        sb.append("</b>");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("C071 significa que houve um erro na aquisição da matrícula registrada no Banco de Dados ");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("<b>");
        sb.append("• C091");
        sb.append("</b>");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("C091 significa que houve um erro no registro dos dados da instituição");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("<b>");
        sb.append("• C104");
        sb.append("</b>");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("<a>");
        sb.append("C104 significa que houve um erro no registro dos dados do cliente");
        sb.append("<br>");
        sb.append("</a>");
        sb.append("</html>");
        JOptionPane.showMessageDialog(null, sb.toString());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Menu de Ajuda");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/help.png"))); // NOI18N

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jButton1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        setTextAjuda();
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
