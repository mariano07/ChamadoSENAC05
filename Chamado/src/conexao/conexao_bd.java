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
    private static String url ="jdbc:mysql://localhost:3306/escola";
    private static String username ="root";
    private static String password ="root";
    
    public String Username(){
        try{
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO", "ERRO:C013", JOptionPane.ERROR_MESSAGE);
        }
    }
}
