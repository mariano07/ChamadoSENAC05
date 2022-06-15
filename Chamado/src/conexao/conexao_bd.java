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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
             JOptionPane.showMessageDialog(null, "Erro C025","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void desconectar(){
        try {
            st.close();
            conexao.close();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro C033","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private String getDate(){
        DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return data.format(LocalDateTime.now());
    }
    private String getTime(){
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
        return hora.format(LocalDateTime.now());
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
            cargo = "C050";
        }
        desconectar();
        return cargo;
        
    }
    public String getUsuario(String usuario,String senha){
        
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
           matricula = "C071";
        }
        desconectar();
        return matricula;
    }
    public String getNome(String usuario,String senha){
        
        String InstrucaoSQL = "SELECT Nome FROM Usuario "
                + "WHERE Usuario = '"+usuario+"' AND Senha = '"+senha+"'";
        String nome = "";
        conectar();
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
              nome = result.getString("Nome");  
            }
        }
        catch (Exception e){
            e.printStackTrace();
           nome = "C091";
        }
        desconectar();
        return nome;
    }
    public void Instituicao(String nome,String endereco,String telefone,String responsavel,String cnpj,String cpf){
        String InstrucaoSQL="INSERT INTO Instituições (NomeDaInstituicao,Localizacao,Telefone,Responsavel,CNPJ,CPF) "
                + "VALUES ('"+nome+"','"+endereco+"','"+telefone+"','"+responsavel+"','"+cnpj+"','"+cpf+"')";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO:C111", "ERRO", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "ERRO:C124", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void CadastroMaquinasEssencial(String cpu,String pmae,String ram,String hd,String ssd,String ccpu,String cooler,String gpu,String fonte,String gabinete,String matricula,String patrimonio,String sala){
        String InstrucaoSQL="";
    }
    
}
