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
    
    private static String url ="jdbc:mysql://172.20.126.128:3306/chamadosenac";
    private static String username ="root";
    private static String password ="fecomerciors";
    private static Connection conn = null;
    private static Statement st = null;
    private static ResultSet result = null;
    
    public String Login(String usuario,String senha){
        
        String InstrucaoSQL = "SELECT Cargo FROM usuario "
                + "WHERE Usuario = '"+usuario+"' AND Senha = '"+senha+"'";
        
        try{
            conn = DriverManager.getConnection(url,username,password);
            st = conn.createStatement();
            st.executeQuery(InstrucaoSQL);
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
        
        String InstrucaoSQL = "SELECT Nome FROM usuario "
                + "WHERE Usuario = '"+usuario+"' AND Senha = '"+senha+"'";
        
        try{
            conn = DriverManager.getConnection(url,username,password);
            st = conn.createStatement();
            st.executeQuery(InstrucaoSQL);
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
