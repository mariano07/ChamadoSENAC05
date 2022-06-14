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
    static Connection conn = null;
    static Statement st = null;
    static ResultSet result = null;
    
    public String Login(String usuario,String senha){
        
        String InstrucaoSQL = "SELECT Cargo FROM Usuario "
                + "WHERE Usuario = '"+usuario+"' AND Senha = '"+senha+"'";
        
        
        JOptionPane.showMessageDialog(null, InstrucaoSQL);
        
        try{
            
            JOptionPane.showMessageDialog(null, "ENTRO");
            conn = DriverManager.getConnection(url,username,password);
            st = conn.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            String cargo = result.getString("Cargo");
            st.close();
            conn.close();
            return cargo;
        }
        catch (Exception e){
            e.printStackTrace();
            return "C022";
        }
    }
    public String Usuario(String usuario,String senha){
        
        String InstrucaoSQL = "SELECT Usuario.Nome FROM Usuario "
                + "WHERE Usuario.Usuario = '"+usuario+"' AND Usuario.Senha = '"+senha+"'";
        
        try{
            conn = DriverManager.getConnection(url,username,password);
            st = conn.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            String nome = result.getString("Nome");
            st.close();
            conn.close();
            return nome;
        }
        catch (Exception e){
            e.printStackTrace();
            return "C041";
        }
    }
    private void CadastraMaquinas(String cpu,String pmae,String ram,String hd,String ssd,String ccpu,String cooler,String gpu,String fonte,String gabinete,String nome){
        String SintrucaoSQL1="";
        String SintrucaoSQL2="";
        String SintrucaoSQL3="";
    }
    
}
