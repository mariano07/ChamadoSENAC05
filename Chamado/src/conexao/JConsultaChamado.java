/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package conexao;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import maquinas.JEditar;

/**
 *
 * @author alunos
 */
public class JConsultaChamado extends javax.swing.JInternalFrame {
    
    private static JEditar je = new JEditar();
    private String cargo="";
    private String matricula="";
    private final static String chave="@#ch4m@d0$3n4cr3$tr1t0#@";
    private final static String url ="jdbc:mysql://172.20.126.128:3306/ChamadoSENAC";
    private final static String username ="chamado";
    private final static String password ="root";
    Connection conexao = null;
    Connection con = conexao;
    Statement st = null;
    ResultSet result = null;
    
    public JConsultaChamado() {
        initComponents();
        Hidden();
    }
    private void conectar(){
         try{
            conexao = DriverManager.getConnection(url,username,password);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C027","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void desconectar(){
        try {
            st.close();
            conexao.close();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C035","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void Hidden(){
        Rbutton_DataHora.setSelected(true);
        if(getCargo().equals("TEC")){
            Rbutton_Matricula.setVisible(false);
        }
        else{
            Rbutton_Matricula.setVisible(true);
        }
        invalidate();
        validate();
    }
    public void setCargoMatricula(String cargo, String matricula){
        this.cargo = cargo;
        this.matricula = matricula;
    }
    private String getCargo(){
        return this.cargo;
    }
    private String getMatricula(){
        return this.matricula;
    }
    public void Buscar(){
        DefaultTableModel model = (DefaultTableModel)table_lista.getModel();
        String[] dados = new String[10];
        String InstrucaoSQL;
        if(getMatricula().equals("TEC")){
            InstrucaoSQL ="SELECT chamado.idTicket,chamado.Patrimonio,chamado.Matricula,chamado.idCliente,chamado.idInstituicao,"
                + "problema.Problema,problema.StatusDoProblema,problema.Solucao,chamado.Data,chamado.Hora "
                + "FROM chamado JOIN problema ON chamado.idTicket = problema.idTicket AND chamado.Matricula = "+getMatricula(); 
        }
        else{
            InstrucaoSQL="SELECT chamado.idTicket,chamado.Patrimonio,chamado.Matricula,chamado.idCliente,chamado.idInstituicao,"
                + "problema.Problema,problema.StatusDoProblema,problema.Solucao,chamado.Data,chamado.Hora "
                + "FROM chamado JOIN problema ON chamado.idTicket = problema.idTicket";
        }
        model.setNumRows(0);
        table_lista.setModel(model);
        if(!text_Consulta.getText().equals("Pesquisar") && !text_Consulta.getText().equals("") && getMatricula().equals("TEC")){
            InstrucaoSQL+=" WHERE chamado.idTicket LIKE '"+text_Consulta.getText()+"%' OR"
                    + " chamado.Patrimonio LIKE '"+text_Consulta.getText()+"%' OR"
                    + " chamado.idCliente LIKE '"+text_Consulta.getText()+"%' OR"
                    + " chamado.idInstituicao LIKE '"+text_Consulta.getText()+"%' OR"
                    + " problema.Problema LIKE '"+text_Consulta.getText()+"%' OR"
                    + " problema.StatusDoProblema LIKE '"+text_Consulta.getText()+"%' OR"
                    + " problema.Solucao LIKE '"+text_Consulta.getText()+"%' OR"
                    + " chamado.Data LIKE '"+text_Consulta.getText()+"%' OR"
                    + " chamado.Hora LIKE '"+text_Consulta.getText()+"%'";
        }
        else if(!text_Consulta.getText().equals("Pesquisar") && !text_Consulta.getText().equals("") && getMatricula().equals("ADM")){
            InstrucaoSQL+=" WHERE chamado.idTicket LIKE '"+text_Consulta.getText()+"%' OR"
                    + " chamado.Patrimonio LIKE '"+text_Consulta.getText()+"%' OR"
                    + " chamado.Matricula LIKE '"+text_Consulta.getText()+"%'"
                    + " chamado.idCliente LIKE '"+text_Consulta.getText()+"%' OR"
                    + " chamado.idInstituicao LIKE '"+text_Consulta.getText()+"%' OR"
                    + " problema.Problema LIKE '"+text_Consulta.getText()+"%' OR"
                    + " problema.StatusDoProblema LIKE '"+text_Consulta.getText()+"%' OR"
                    + " problema.Solucao LIKE '"+text_Consulta.getText()+"%' OR"
                    + " chamado.Data LIKE '"+text_Consulta.getText()+"%' OR"
                    + " chamado.Hora LIKE '"+text_Consulta.getText()+"%'";
        }
        if(Rbutton_Cliente.isSelected()){
            if(box_ordem.getSelectedItem().equals("Menor -> Maior")){
                InstrucaoSQL+=" ORDER BY chamado.idCliente ASC";
            }else{
                InstrucaoSQL+=" ORDER BY chamado.idCliente DESC";
            }
        }
        else if(Rbutton_DataHora.isSelected()){
            if(box_ordem.getSelectedItem().equals("Menor -> Maior")){
                InstrucaoSQL+=" ORDER BY chamado.Data ASC, chamado.Hora ASC";
            }else{
                InstrucaoSQL+=" ORDER BY chamado.Data DESC, chamado.Hora DESC";
            }
        }
        else if(Rbutton_Instituicao.isSelected()){
            if(box_ordem.getSelectedItem().equals("Menor -> Maior")){
                InstrucaoSQL+=" ORDER BY chamado.idInstituicao ASC";
            }else{
                InstrucaoSQL+=" ORDER BY chamado.idInstituicao DESC";
            }
        }
        else if(Rbutton_Matricula.isSelected()){
            if(box_ordem.getSelectedItem().equals("Menor -> Maior")){
                InstrucaoSQL+=" ORDER BY chamado.Matricula ASC";
            }else{
                InstrucaoSQL+=" ORDER BY chamado.Matricula DESC";
            }
        }
        else if(Rbutton_idTicket.isSelected()){
            if(box_ordem.getSelectedItem().equals("Menor -> Maior")){
                InstrucaoSQL+=" ORDER BY chamado.idTicket ASC";
            }else{
                InstrucaoSQL+=" ORDER BY chamado.idTicket DESC";
            }
        }
        else{
            InstrucaoSQL+=" ORDER BY chamado.Data ASC, chamado.Hora ASC";
        }
        conectar();
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
                dados[0]=result.getString("idTicket");
                dados[1]=result.getString("Matricula");
                dados[2]=result.getString("Patrimonio");
                dados[3]=result.getString("idCliente");
                dados[4]=result.getString("idInstituicao");
                dados[5]=result.getString("Problema");
                dados[6]=result.getString("StatusDoProblema");
                dados[7]=result.getString("Solucao");
                dados[8]=result.getString("Data");
                dados[9]=result.getString("Hora");
                model.addRow(dados);
            }
            table_lista.setModel(model);
        }catch(Exception e){
            e.printStackTrace();
        }
        desconectar();
    }
    private String[] BuscaChamado(int id){
        String[] dados = new String[14];
        String InstrucaoSQL = "SELECT `Patrimonio`, `Sala`, `Placa mae`, `Processador`, "
                + "`Memorias Ram`, `Placa de video`, `Fonte`, `Ssd`, `Hd`, `Cooler`, `CoolerCpu`, `Gabinete`, "
                + "FROM `chamado` WHERE idTicket = "+id;
        conectar();
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
                dados[0]=result.getString("`Patrimonio`");
                dados[1]=result.getString("`Sala`");
                dados[2]=result.getString("`Placa mae`");
                dados[3]=result.getString("`Processador`");
                dados[4]=result.getString("`Memorias Ram`");
                dados[5]=result.getString("`Placa de video`");
                dados[6]=result.getString("`Fonte`");
                dados[7]=result.getString("`Ssd`");
                dados[8]=result.getString("`Hd`");
                dados[9]=result.getString("`Cooler`");
                dados[10]=result.getString("`CoolerCpu`");
                dados[11]=result.getString("`Gabinete`");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        desconectar();
        
        String InstrucaoSQL2 = "SELECT `Problema`, `Solucao` FROM `problema` WHERE idTicket = "+id;
        conectar();
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL2);
            while(result.next()){
                dados[12]=result.getString("`Problema`");
                dados[13]=result.getString("`Solucao`");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        desconectar();
        return dados;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelConsulaChamado = new javax.swing.JPanel();
        Button_Alterar = new javax.swing.JButton();
        text_Consulta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_lista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Rbutton_idTicket = new javax.swing.JRadioButton();
        Rbutton_Matricula = new javax.swing.JRadioButton();
        Rbutton_Cliente = new javax.swing.JRadioButton();
        Rbutton_Instituicao = new javax.swing.JRadioButton();
        Rbutton_DataHora = new javax.swing.JRadioButton();
        box_ordem = new javax.swing.JComboBox<>();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Pesquisa");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/magnifier.png"))); // NOI18N

        JPanelConsulaChamado.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar chamados"));

        Button_Alterar.setText("Alterar");
        Button_Alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_AlterarMouseClicked(evt);
            }
        });

        text_Consulta.setText("Pesquisar...");
        text_Consulta.setPreferredSize(new java.awt.Dimension(236, 25));
        text_Consulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_ConsultaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_ConsultaFocusLost(evt);
            }
        });
        text_Consulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_ConsultaKeyReleased(evt);
            }
        });

        table_lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idTicket", "Matricula", "Patrimonio", "Cliente", "Instituição", "Problema", "Status", "Solução", "Data", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_lista);

        jLabel1.setText("Ordenar por");

        Rbutton_idTicket.setText("idTicket");
        Rbutton_idTicket.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Rbutton_idTicketStateChanged(evt);
            }
        });

        Rbutton_Matricula.setText("Matricula");
        Rbutton_Matricula.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Rbutton_MatriculaStateChanged(evt);
            }
        });

        Rbutton_Cliente.setText("Ciente");
        Rbutton_Cliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Rbutton_ClienteStateChanged(evt);
            }
        });

        Rbutton_Instituicao.setText("Instituição");
        Rbutton_Instituicao.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Rbutton_InstituicaoStateChanged(evt);
            }
        });

        Rbutton_DataHora.setText("Data e Hora");
        Rbutton_DataHora.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Rbutton_DataHoraStateChanged(evt);
            }
        });

        box_ordem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maior -> Menor", "Menor -> Marior" }));

        javax.swing.GroupLayout JPanelConsulaChamadoLayout = new javax.swing.GroupLayout(JPanelConsulaChamado);
        JPanelConsulaChamado.setLayout(JPanelConsulaChamadoLayout);
        JPanelConsulaChamadoLayout.setHorizontalGroup(
            JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelConsulaChamadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1437, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelConsulaChamadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Button_Alterar))
                    .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(text_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JPanelConsulaChamadoLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Rbutton_Matricula)
                                .addGroup(JPanelConsulaChamadoLayout.createSequentialGroup()
                                    .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Rbutton_idTicket)
                                        .addComponent(Rbutton_Cliente))
                                    .addGap(34, 34, 34)
                                    .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Rbutton_DataHora)
                                        .addGroup(JPanelConsulaChamadoLayout.createSequentialGroup()
                                            .addComponent(Rbutton_Instituicao)
                                            .addGap(18, 18, 18)
                                            .addComponent(box_ordem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        JPanelConsulaChamadoLayout.setVerticalGroup(
            JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelConsulaChamadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Rbutton_Instituicao)
                    .addComponent(Rbutton_idTicket)
                    .addComponent(box_ordem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rbutton_Cliente)
                    .addComponent(Rbutton_DataHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rbutton_Matricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(Button_Alterar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelConsulaChamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelConsulaChamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_AlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AlterarMouseClicked
        String[] dados = new String[15];
        int id = 0,linha = table_lista.getSelectedRow();
        id = Integer.parseInt(table_lista.getValueAt(linha, 0).toString());
        JOptionPane.showMessageDialog(null, id);
        dados = BuscaChamado(id);
        getParent().add(je);
        je.popular(id,dados);
        je.setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_AlterarMouseClicked

    private void text_ConsultaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ConsultaFocusGained
        if(text_Consulta.getText().equals("Pesquisar...")){
            text_Consulta.setText("");
        }
    }//GEN-LAST:event_text_ConsultaFocusGained

    private void text_ConsultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ConsultaFocusLost
        if(text_Consulta.getText().equals("")){
            text_Consulta.setText("Pesquisar...");
        }
    }//GEN-LAST:event_text_ConsultaFocusLost

    private void text_ConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_ConsultaKeyReleased
        if(evt.getKeyCode()!=KeyEvent.VK_ENTER){
            Buscar();
        }
    }//GEN-LAST:event_text_ConsultaKeyReleased

    private void Rbutton_idTicketStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Rbutton_idTicketStateChanged
        if(Rbutton_idTicket.isSelected()){
            Rbutton_Cliente.setSelected(false);
            Rbutton_DataHora.setSelected(false);
            Rbutton_Instituicao.setSelected(false);
            Rbutton_Matricula.setSelected(false);
        }
    }//GEN-LAST:event_Rbutton_idTicketStateChanged

    private void Rbutton_ClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Rbutton_ClienteStateChanged
        if(Rbutton_Cliente.isSelected()){
            Rbutton_idTicket.setSelected(false);
            Rbutton_DataHora.setSelected(false);
            Rbutton_Instituicao.setSelected(false);
            Rbutton_Matricula.setSelected(false);
        }
    }//GEN-LAST:event_Rbutton_ClienteStateChanged

    private void Rbutton_MatriculaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Rbutton_MatriculaStateChanged
        if(Rbutton_Matricula.isSelected()){
            Rbutton_Cliente.setSelected(false);
            Rbutton_DataHora.setSelected(false);
            Rbutton_Instituicao.setSelected(false);
            Rbutton_idTicket.setSelected(false);
        }
    }//GEN-LAST:event_Rbutton_MatriculaStateChanged

    private void Rbutton_InstituicaoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Rbutton_InstituicaoStateChanged
        if(Rbutton_Instituicao.isSelected()){
            Rbutton_Cliente.setSelected(false);
            Rbutton_DataHora.setSelected(false);
            Rbutton_idTicket.setSelected(false);
            Rbutton_Matricula.setSelected(false);
        }
    }//GEN-LAST:event_Rbutton_InstituicaoStateChanged

    private void Rbutton_DataHoraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Rbutton_DataHoraStateChanged
        if(Rbutton_DataHora.isSelected()){
            Rbutton_Cliente.setSelected(false);
            Rbutton_idTicket.setSelected(false);
            Rbutton_Instituicao.setSelected(false);
            Rbutton_Matricula.setSelected(false);
        }
    }//GEN-LAST:event_Rbutton_DataHoraStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Alterar;
    private javax.swing.JPanel JPanelConsulaChamado;
    private javax.swing.JRadioButton Rbutton_Cliente;
    private javax.swing.JRadioButton Rbutton_DataHora;
    private javax.swing.JRadioButton Rbutton_Instituicao;
    private javax.swing.JRadioButton Rbutton_Matricula;
    private javax.swing.JRadioButton Rbutton_idTicket;
    private javax.swing.JComboBox<String> box_ordem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_lista;
    private javax.swing.JTextField text_Consulta;
    // End of variables declaration//GEN-END:variables
}
