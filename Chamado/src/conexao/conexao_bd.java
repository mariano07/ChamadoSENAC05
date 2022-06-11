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
    private static String password ="root";
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
            return "C013";
        }
    }
    public void SelectChamados(String cargo){
        
        String InstrucaoSQL;
        
        if(cargo.equals("ADM")){
            try{
                
            }
            catch (Exception e){
                
            }
        }
        else{
            try{
                
            }
            catch (Exception e){
                
            }
        }
    }
}
