/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexao_bd{
    
    static String url ="jdbc:mysql://172.20.126.128:3306/ChamadoSENAC";
    static String username ="chamado";
    static String password ="root";
    Connection conexao = null;
    Connection con = conexao;
    Statement st = null;
    ResultSet result = null;
    
    private void conectar(){
         try{
            conexao = DriverManager.getConnection(url,username,password);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Erro C023","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void desconectar(){
        try {
            st.close();
            conexao.close();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro C031","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String Login(String usuario,String senha){
        
        String InstrucaoSQL = "SELECT Cargo FROM Usuario "
                + "WHERE Usuario = '"+usuario+"' AND Senha = '"+senha+"'";
        String cargo = "";
        conectar();
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
              cargo = result.getString("Cargo");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            cargo = "C040";
        }
        desconectar();
        return cargo;
        
    }
    public String Usuario(String usuario,String senha){
        
        String InstrucaoSQL = "SELECT Matricula FROM Usuario "
                + "WHERE Usuario = '"+usuario+"' AND Senha = '"+senha+"'";
        String matricula = "";
        conectar();
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
              matricula = result.getString("Matricula");  
            }
        }
        catch (Exception e){
            e.printStackTrace();
           matricula = "C061";
        }
        desconectar();
        return matricula;
    }
    public void Instituicao(String nome,String endereco,String telefone,String responsavel,String cnpj,String cpf){
        String InstrucaoSQL="INSERT INTO Instituições (NomeDaInstituicao,Localizacao,Telefone,Responsavel,CNPJ,CPF) "
                + "VALUES ('"+nome+"','"+endereco+"','"+telefone+"','"+responsavel+"','"+cnpj+"','"+cpf+"')";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO:C081", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void Cliente(String nome,String cpf,String telefone,String email,String endereco){
        String InstrucaoSQL="INSERT INTO Clientes (Nome,CPF,Telefone,Email,Endereco)"
                + " VALUES ('"+nome+"','"+cpf+"','"+telefone+"','"+email+"','"+endereco+"')";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO:C094", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    
}
