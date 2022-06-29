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

/**
 *
 * @author alunos
 */
public class JConsultaChamado extends javax.swing.JInternalFrame {

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
    private void Lista(String patrimonio,String matricula,String data,String Status){
        String InstrucaoSQL="SELECT";
        try{
            conexao = DriverManager.getConnection(url,username,password);
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
                //List_Pendencias.add("Patrimonio: ");
            }
        }catch(Exception e){
          
        }
    }
      
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelConsulaChamado = new javax.swing.JPanel();
        Button_Alterar = new javax.swing.JButton();
        text_Consulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List_Pendencias = new javax.swing.JList<>();
        check_FIltros = new javax.swing.JCheckBox();
        box_Patrimonio = new javax.swing.JComboBox<>();
        box_Matricula = new javax.swing.JComboBox<>();
        box_Data = new javax.swing.JComboBox<>();
        box_Status = new javax.swing.JComboBox<>();
        Button_Procurar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);

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

        List_Pendencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione um chamado para editar"));
        jScrollPane1.setViewportView(List_Pendencias);

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

        box_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "Todos", "Concluido", "Pendente" }));

        Button_Procurar.setText("Procurar");
        Button_Procurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ProcurarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanelConsulaChamadoLayout = new javax.swing.GroupLayout(JPanelConsulaChamado);
        JPanelConsulaChamado.setLayout(JPanelConsulaChamadoLayout);
        JPanelConsulaChamadoLayout.setHorizontalGroup(
            JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelConsulaChamadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelConsulaChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelConsulaChamadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Button_Alterar))
                    .addComponent(jScrollPane1)
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
                        .addGap(0, 164, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Alterar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelConsulaChamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            if(text_Consulta.getText() != "Pesquisar..." && text_Consulta.getText() != ""){
                
            }
        }
    }//GEN-LAST:event_text_ConsultaKeyPressed

    private void Button_ProcurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ProcurarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_ProcurarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Alterar;
    private javax.swing.JButton Button_Procurar;
    private javax.swing.JPanel JPanelConsulaChamado;
    private javax.swing.JList<String> List_Pendencias;
    private javax.swing.JComboBox<String> box_Data;
    private javax.swing.JComboBox<String> box_Matricula;
    private javax.swing.JComboBox<String> box_Patrimonio;
    private javax.swing.JComboBox<String> box_Status;
    private javax.swing.JCheckBox check_FIltros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField text_Consulta;
    // End of variables declaration//GEN-END:variables
}
