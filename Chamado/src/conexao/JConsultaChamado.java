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
        box_Matricula.setVisible(false);
        box_Patrimonio.setVisible(false);
        box_Data.setVisible(false);
        box_Status.setVisible(false);
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
    public void Filtros(){
        if(getCargo().equals("ADM")){
            String InstrucaoPatrimonio="SELECT DISTINCT Patrimonio FROM chamado";
            String InstrucaoData="SELECT DISTINCT Data FROM chamado ORDER BY Data DESC";
            String InstrucaoMatricula="SELECT DISTINCT Matricula FROM chamado ORDER BY Matricula ASC";
            conectar();
            try{
                st = conexao.createStatement();
                result = st.executeQuery(InstrucaoPatrimonio);
                while(result.next()){
                    box_Patrimonio.addItem(result.getString("Patrimonio"));
                }
                st.close();
                st = conexao.createStatement();
                result = st.executeQuery(InstrucaoData);
                while(result.next()){
                    box_Data.addItem(result.getString("Data"));
                }
                st.close();
                st = conexao.createStatement();
                result = st.executeQuery(InstrucaoMatricula);
                while(result.next()){
                    box_Matricula.addItem(result.getString("Matricula"));
                }
                st.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            
        }
    }
    private void Buscar(){
        DefaultTableModel model = (DefaultTableModel)table_lista.getModel();
        String[] dados = new String[9];
        String InstrucaoSQL="SELECT chamado.Patrimonio,chamado.Matricula,chamado.idCliente,chamado.idInstituicao,"
                + "problema.Problema,problema.StatusDoProblema,problema.Solucao,chamado.Data,chamado.Hora "
                + "FROM chamado JOIN problema ON chamado.idTicket = problema.idTicket";
        model.setNumRows(0);
        table_lista.setModel(model);
        if(InstrucaoSQL.contains("WHERE")){
            if(check_FIltros.isSelected() && box_Patrimonio.getSelectedItem().toString()!= "Patrimonio" && !InstrucaoSQL.contains("Patrmonio")){
                InstrucaoSQL+=" AND Patrimonio = '"+box_Patrimonio.getSelectedItem()+"'";
            }
            if(check_FIltros.isSelected() && box_Data.getSelectedItem().toString()!= "Data" && !InstrucaoSQL.contains("Data")){
                InstrucaoSQL+=" AND Data = '"+box_Data.getSelectedItem()+"'";
            }
            if(check_FIltros.isSelected() && box_Status.getSelectedItem().toString()!= "Status" && !InstrucaoSQL.contains("Status")){
                InstrucaoSQL+=" AND StatusDoProblema = '"+box_Status.getSelectedItem()+"'";
            }
            if(check_FIltros.isSelected() && box_Matricula.getSelectedItem().toString()!= "Matricula" && !InstrucaoSQL.contains("Matricula")){
                InstrucaoSQL+=" AND Matricula = '"+box_Matricula.getSelectedItem()+"'";
            }
        }
        if(!InstrucaoSQL.contains("WHERE")){
            if(check_FIltros.isSelected() && box_Patrimonio.getSelectedItem().toString()!= "Patrimonio"){
                InstrucaoSQL+=" WHERE Patrimonio = '"+box_Patrimonio.getSelectedItem().toString()+"'";
            }
            if(check_FIltros.isSelected() && box_Data.getSelectedItem().toString()!= "Data"){
                InstrucaoSQL+=" WHERE Data = '"+box_Data.getSelectedItem()+"'";
            }
            if(check_FIltros.isSelected() && box_Status.getSelectedItem().toString()!= "Status"){
                InstrucaoSQL+=" WHERE StatusDoProblema = '"+box_Status.getSelectedItem()+"'";
            }
            if(check_FIltros.isSelected() && box_Matricula.getSelectedItem().toString()!= "Matricula"){
                InstrucaoSQL+=" WHERE Matricula = '"+box_Matricula.getSelectedItem()+"'";
            }
        }
        InstrucaoSQL+=" ORDER BY chamado.Data DESC, chamado.Hora DESC";
        conectar();
        JOptionPane.showMessageDialog(null, InstrucaoSQL);
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
                dados[0]=result.getString("Matricula");
                dados[1]=result.getString("Patrimonio");
                dados[2]=result.getString("idCliente");
                dados[3]=result.getString("idInstituicao");
                dados[4]=result.getString("Problema");
                dados[5]=result.getString("StatusDoProblema");
                dados[6]=result.getString("Solucao");
                dados[7]=result.getString("Data");
                dados[8]=result.getString("Hora");
                model.addRow(dados);
            }
            table_lista.setModel(model);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private String[] BuscaChamado(int id){
        String[] dados = new String[14];
        String InstrucaoSQL = "SELECT `Patrimonio`, `Sala`, `Placa mae`, `Processador`, "
                + "`Memorias Ram`, `Placa de video`, `Fonte`, `Ssd`, `Hd`, `Cooler`, `CoolerCpu`, `Gabinete`, "
                + "FROM `chamado` WHERE idTicket = '"+id+"'";
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
        check_FIltros = new javax.swing.JCheckBox();
        box_Patrimonio = new javax.swing.JComboBox<>();
        box_Matricula = new javax.swing.JComboBox<>();
        box_Data = new javax.swing.JComboBox<>();
        box_Status = new javax.swing.JComboBox<>();
        Button_Procurar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_lista = new javax.swing.JTable();

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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_ConsultaKeyPressed(evt);
            }
        });

        check_FIltros.setText("Filtros");
        check_FIltros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_FIltrosStateChanged(evt);
            }
        });

        box_Patrimonio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patrimonio" }));
        box_Patrimonio.setToolTipText("");
        box_Patrimonio.setName(""); // NOI18N

        box_Matricula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matricula" }));

        box_Data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Data" }));

        box_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "CONCLUIDO", "PENDENTE" }));

        Button_Procurar.setText("Procurar");
        Button_Procurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ProcurarMouseClicked(evt);
            }
        });

        table_lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Patrimonio", "Cliente", "Instituição", "Problema", "Status", "Solução", "Data", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_lista);

        javax.swing.GroupLayout JPanelConsulaChamadoLayout = new javax.swing.GroupLayout(JPanelConsulaChamado);
        JPanelConsulaChamado.setLayout(JPanelConsulaChamadoLayout);
        JPanelConsulaChamadoLayout.setHorizontalGroup(
            JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelConsulaChamadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1432, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelConsulaChamadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Button_Alterar))
                    .addGroup(JPanelConsulaChamadoLayout.createSequentialGroup()
                        .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelConsulaChamadoLayout.createSequentialGroup()
                                .addComponent(text_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_Procurar)
                                .addGap(18, 18, 18)
                                .addComponent(check_FIltros))
                            .addGroup(JPanelConsulaChamadoLayout.createSequentialGroup()
                                .addComponent(box_Patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanelConsulaChamadoLayout.setVerticalGroup(
            JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelConsulaChamadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Procurar)
                    .addComponent(check_FIltros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_Patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
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

    private void check_FIltrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_FIltrosStateChanged
        if(check_FIltros.isSelected() && getCargo().equals("ADM")){
            box_Patrimonio.setVisible(true);
            box_Data.setVisible(true);
            box_Status.setVisible(true);
            box_Matricula.setVisible(true);
            validate();
        }else if(check_FIltros.isSelected() && getCargo().equals("TEC")){
            box_Patrimonio.setVisible(true);
            box_Data.setVisible(true);
            box_Status.setVisible(true);
            validate();
        }else{
            box_Patrimonio.setVisible(false);
            box_Data.setVisible(false);
            box_Status.setVisible(false);
            box_Matricula.setVisible(false);
            validate();
        }
    }//GEN-LAST:event_check_FIltrosStateChanged

    private void Button_AlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AlterarMouseClicked
        String[] dados = new String[15];
        int id = 0;
        //id = ?
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

    private void text_ConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_ConsultaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Buscar();
        }
    }//GEN-LAST:event_text_ConsultaKeyPressed

    private void Button_ProcurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ProcurarMouseClicked
        Buscar();
    }//GEN-LAST:event_Button_ProcurarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Alterar;
    private javax.swing.JButton Button_Procurar;
    private javax.swing.JPanel JPanelConsulaChamado;
    private javax.swing.JComboBox<String> box_Data;
    private javax.swing.JComboBox<String> box_Matricula;
    private javax.swing.JComboBox<String> box_Patrimonio;
    private javax.swing.JComboBox<String> box_Status;
    private javax.swing.JCheckBox check_FIltros;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_lista;
    private javax.swing.JTextField text_Consulta;
    // End of variables declaration//GEN-END:variables
}
