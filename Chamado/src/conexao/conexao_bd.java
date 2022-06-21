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
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro C025","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void desconectar(){
        try {
            st.close();
            conexao.close();
        }catch(Exception e){
            e.printStackTrace();
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
        String InstrucaoSQL="INSERT INTO `Instituições` (`idInstituições`, `NomeDaInstituicao`, `Localizacao`, `Telefone`, `Responsavel`, `CNPJ`, `CPF`) "
                + "VALUES (NULL, '"+nome+"', '"+endereco+"', '"+telefone+"', '"+responsavel+"', '"+cnpj+"', '"+cpf+"');";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C111", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void Cliente(String nome,String cpf,String telefone,String email,String endereco){
        String InstrucaoSQL="INSERT INTO `Clientes` (`idClientes`, `Nome`, `CPF`, `Telefone`, `Email`, `Endereco`) "
                + "VALUES (NULL, '"+nome+"', '"+cpf+"', '"+telefone+"', '"+email+"', '"+endereco+"');";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C125", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void CadastroMaquina(String cpu,String pmae,String ram,String hd,String ssd,String ccpu,String cooler,String gpu,String fonte,String gabinete,String matricula,String patrimonio,String sala){
        String InstrucaoSQL="INSERT INTO `Chamado` (`Ticket`, `Patrimonio`, `Sala`, `Placa mae`, `Processador`, `Memorias Ram`, `Placa de video`, `Fonte`, `Ssd`, `Hd`, `Cooler`, `CoolerCpu`, `Gabinete`, `Matricula`, `Data`, `Hora`) "
                + "VALUES (NULL, '"+patrimonio+"', '"+sala+"', '"+pmae+"', '"+cpu+"', '"+ram+"', '"+gpu+"', '"+fonte+"', '"+ssd+"', '"+hd+"', '"+cooler+"', '"+ccpu+"', '"+gabinete+"', '"+matricula+"', '"+getDate()+"', '"+getTime()+"');";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C139", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void Defeito(String defeito){
        String InstrucaoSQL="INSERT INTO Problema (Problema,StatusDoProblema) "
                + "VALUES ('"+defeito+"','PENDENTE')";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C153", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void DefeitoSolucao(String defeito,String solucao){
        String InstrucaoSQL="INSERT INTO Problema (Problema,StatusDoProblema,Solucao) "
                + "VALUES ('"+defeito+"','CONCLUIDO','"+solucao+"')";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C167", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void Solucao(String solucao,String ticket){
        String InstrucaoSQL="UPDATE Problema SET StatusDoProblema = 'CONCLUIDO' AND SET Solucao = '"+solucao+"' "
                + "WHERE idTicket = '"+ticket+"'";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C181", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void AddTec(String nome, String matricula, String usuario, String senha){
        String InstrucaoSQL="INSERT INTO Usuario (Nome,Matricula,Usuario,Senha,Cargo) "
                + "VALUES ('"+nome+"','"+matricula+"','"+usuario+"','"+senha+"','TEC')";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C195", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void AddAdm(String nome, String matricula, String usuario, String senha){
        String InstrucaoSQL="INSERT INTO Usuario (Nome,Matricula,Usuario,Senha,Cargo) "
                + "VALUES ('"+nome+"','"+matricula+"','"+usuario+"','"+senha+"','ADM')";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C209", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public boolean InstituicaoCPF(String cpf){
        String InstrucaoSQL="SELECT CPF FROM Instituições";
        boolean verifica = false;
        conectar();
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
                String CPF = result.getString("CPF");
                if(CPF.equals(cpf)){
                    verifica=true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C223", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return verifica;
    }
    public boolean InstituicaoCNPJ(String cnpj){
        String InstrucaoSQL="SELECT CNPJ FROM Instituições";
        boolean verifica = false;
        conectar();
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
                String CNPJ = result.getString("CNPJ");
                if(CNPJ.equals(cnpj)){
                    verifica=true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C243", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return verifica;
    }
    public boolean ClienteCPF(String cpf){
        String InstrucaoSQL="SELECT CPF FROM Clientes";
        boolean verifica = false;
        conectar();
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
                String CPF = result.getString("CPF");
                if(CPF.equals(cpf)){
                    verifica=true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C263", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return verifica;
    }
    public String[] getAluno(String matricula){
        String[] aluno = new String[2];
        String InstrucaoSQL="SELECT Nome,Usuario FROM Usuario WHERE Matricula = "+matricula;
        conectar();
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
                aluno[0]=result.getString("Nome");
                aluno[1]=result.getString("Usuario");
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C283", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return aluno;
    }
    public void DeletaAluno(String matricula){
        String InstrucaoSQL="DROP * FROM Usuario WHERE Matricula = "+matricula;
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C301", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
}
