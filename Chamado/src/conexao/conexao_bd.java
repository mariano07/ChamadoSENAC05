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
    
    private static String url ="jdbc:mysql://localhost:3306/chamadosenac";
    private static String username ="root";
    private static String password ="root";
    private static Connection conn = null;
    private static Statement st = null;
    private static ResultSet result = null;
    
    public String Username(String usuario){
        String InstrucaoSQL = 
        try{
            conn = DriverManager.getConnection(url,username,password);
            st = conn.createStatement();
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO", "ERRO:C013", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
