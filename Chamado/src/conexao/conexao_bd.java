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
    
    private final static String chave="@#ch4m@d0$3n4cr3$tr1t0#@";
    private final static String url ="jdbc:mysql://172.20.126.128:3306/ChamadoSENAC";
    private final static String username ="chamado";
    private final static String password ="root";
    Connection conexao = null;
    Connection con = conexao;
    Statement st = null;
    ResultSet result = null;
    
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
    private String getDate(){
        DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return data.format(LocalDateTime.now());
    }
    private String getTime(){
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
        return hora.format(LocalDateTime.now());
    }
    public String Login(String usuario,String senha){
        
        String InstrucaoSQL = "SELECT Cargo FROM usuario "
                + "WHERE Usuario = AES_ENCRYPT('"+usuario+"','"+chave+"') AND Senha = AES_ENCRYPT('"+senha+"','"+chave+"')";
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
            cargo = "C052";
        }
        desconectar();
        return cargo;
        
    }
    public String getMatricula(String usuario,String senha){
        
        String InstrucaoSQL = "SELECT Matricula FROM usuario "
                + "WHERE Usuario = AES_ENCRYPT('"+usuario+"','"+chave+"') AND Senha = AES_ENCRYPT('"+senha+"','"+chave+"')";
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
           matricula = "C073";
        }
        desconectar();
        return matricula;
    }
    public String getUsuario(String usuario,String senha){
        
        String InstrucaoSQL = "SELECT AES_DECRYPT(Usuario,'"+chave+"') FROM usuario "
                + "WHERE Usuario = AES_ENCRYPT('"+usuario+"','"+chave+"') AND Senha = AES_ENCRYPT('"+senha+"','"+chave+"')";
        String Usuario = "";
        conectar();
        try{
            st = conexao.createStatement();
            result = st.executeQuery(InstrucaoSQL);
            while(result.next()){
              Usuario = result.getString("AES_DECRYPT(Usuario,'"+chave+"')");  
            }
        }
        catch (Exception e){
            e.printStackTrace();
           Usuario = "C093";
        }
        desconectar();
        return Usuario;
    }
    public void Instituicao(String nome,String endereco,String telefone,String responsavel,String cnpj,String cpf){
        String InstrucaoSQL="INSERT INTO `instituicoes` (`idInstituições`, `NomeDaInstituicao`, `Localizacao`, `Telefone`, `Responsavel`, `CNPJ`, `CPF`) "
                + "VALUES (NULL, '"+nome+"', '"+endereco+"', '"+telefone+"', '"+responsavel+"', '"+cnpj+"', '"+cpf+"');";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C117", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void Cliente(String nome,String cpf,String telefone,String email,String endereco){
        String InstrucaoSQL="INSERT INTO `clientes` (`idClientes`, `Nome`, `CPF`, `Telefone`, `Email`, `Endereco`) "
                + "VALUES (NULL, '"+nome+"', '"+cpf+"', '"+telefone+"', '"+email+"', '"+endereco+"');";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C127", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void CadastroMaquina(String cpu,String pmae,String ram,String hd,String ssd,String ccpu,String cooler,String gpu,String fonte,String gabinete,String matricula,String patrimonio,String sala){
        String InstrucaoSQL="INSERT INTO `chamado` (`Ticket`, `Patrimonio`, `Sala`, `Placa mae`, `Processador`, `Memorias Ram`, `Placa de video`, `Fonte`, `Ssd`, `Hd`, `Cooler`, `CoolerCpu`, `Gabinete`, `Matricula`, `Data`, `Hora`) "
                + "VALUES (NULL, '"+patrimonio+"', '"+sala+"', '"+pmae+"', '"+cpu+"', '"+ram+"', '"+gpu+"', '"+fonte+"', '"+ssd+"', '"+hd+"', '"+cooler+"', '"+ccpu+"', '"+gabinete+"', '"+matricula+"', '"+getDate()+"', '"+getTime()+"');";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C141", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void Defeito(String defeito){
        String InstrucaoSQL="INSERT INTO problema (Problema,StatusDoProblema) "
                + "VALUES ('"+defeito+"','PENDENTE')";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C155", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void DefeitoSolucao(String defeito,String solucao){
        String InstrucaoSQL="INSERT INTO problema (Problema,StatusDoProblema,Solucao) "
                + "VALUES ('"+defeito+"','CONCLUIDO','"+solucao+"')";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C169", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void Solucao(String solucao,String ticket){
        String InstrucaoSQL="UPDATE problema SET StatusDoProblema = 'CONCLUIDO' AND SET Solucao = '"+solucao+"' "
                + "WHERE idTicket = '"+ticket+"'";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C183", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void AddTec(String nome, String matricula, String usuario, String senha){
        String InstrucaoSQL="INSERT INTO usuario (Nome,Matricula,Usuario,Senha,Cargo) "
                + "VALUES ('"+nome+"','"+matricula+"',AES_ENCRYPT('"+usuario+"','"+chave+"'),AES_ENCRYPT('"+senha+"','"+chave+"'),'TEC')";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C197", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void AddAdm(String nome, String matricula, String usuario, String senha){
        String InstrucaoSQL="INSERT INTO usuario (Nome,Matricula,Usuario,Senha,Cargo) "
                + "VALUES ('"+nome+"','"+matricula+"',AES_ENCRYPT('"+usuario+"','"+chave+"'),AES_ENCRYPT('"+senha+"','"+chave+"'),'ADM')";
        
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C211", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public boolean InstituicaoCPF(String cpf){
        String InstrucaoSQL="SELECT CPF FROM instituicoes";
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
            JOptionPane.showMessageDialog(null, "ERRO:C225", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return verifica;
    }
    public boolean InstituicaoCNPJ(String cnpj){
        String InstrucaoSQL="SELECT CNPJ FROM instituicoes";
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
            JOptionPane.showMessageDialog(null, "ERRO:C245", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return verifica;
    }
    public boolean ClienteCPF(String cpf){
        String InstrucaoSQL="SELECT CPF FROM clientes";
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
            JOptionPane.showMessageDialog(null, "ERRO:C265", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return verifica;
    }
    public String[] getAluno(String matricula){
        String[] aluno = new String[2];
        String InstrucaoSQL="SELECT Nome,AES_DECRYPT(Usuario,'"+chave+"') FROM usuario WHERE Matricula = "+matricula;

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
            JOptionPane.showMessageDialog(null, "ERRO:C285", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return aluno;
    }
    public void DeletaAluno(String matricula){
        String InstrucaoSQL="DELETE FROM `usuario` WHERE `Matricula`= "+matricula;
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C304", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
   public boolean EditaUsuario(String matricula,String Usuario,String Senha){
        boolean tf=false;
        String InstrucaoSQL="UPDATE `usuario` SET `Usuario` = AES_ENCRYPT('"+Usuario+"','"+chave+"'), `Senha` = AES_ENCRYPT('"+Senha+"','"+chave+"') "
                + "WHERE `Matricula` = '"+matricula+"'";

        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C316", "ERRO", JOptionPane.ERROR_MESSAGE);
            tf=true;
        }
        desconectar();
        return tf;
    }
   public void ReportaBug(String usuario,String matricula,String processoBug,String bug){
       String InstrucaoSQL="INSERT INTO `report_bugs` (`idBug`, `Usuario`, `Matricula`, `Processo`, `Bug`) "
               + "VALUES (NULL,'"+usuario+"','"+matricula+"','"+processoBug+"','"+bug+"')";
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
            JOptionPane.showMessageDialog(null, "Bug reportado com sucesso!\nObrigado pela contribuição :D");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C333", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
   }
   public void Feedback(String usuario,String matricula,String feedback){
       String InstrucaoSQL="INSERT INTO `feedback` (`idFeedback`,`Usuario`, `Matricula`, `Feedback`) "
               + "VALUES (NULL,'"+usuario+"','"+matricula+"','"+feedback+"')";
        conectar();
        try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
            JOptionPane.showMessageDialog(null, "Obrigado pelo feedback!");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C347", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
   }
   public int[] Estatisticas (String matricula){
       int[] dados = new int [8];
       String InstrucaoSql="SELECT `TaxaDeAbandono` ,`NivelDeSatisfacao` ,`TempoDeAtendimento` , `TempoDeEspera` ,`TaxaDeAmplificacao`"
               + " ,`TempoResolucao` ,`NivelDeServiço` ,`Pendencias`"
               + "FROM estatistica WHERE Matricula = '"+matricula+"'";
       conectar();
       try{
           st = conexao.createStatement();
           result = st.executeQuery(InstrucaoSql);
           while(result.next()){
            dados[3] = result.getInt("TaxaDeAbandono");
            dados[2] = result.getInt("TaxaDeAtendimento");
            dados[1] = result.getInt("TempoDeEspera");
            dados[1] = result.getInt("NivelDeSatisfacao");
            dados[2] = result.getInt("TaxaDeAmplicafacao");
            dados[3] = result.getInt("TempoDeResolucao");
            dados[4] = result.getInt("NivelDeServiço");
            dados[5] = result.getInt("Pendencias");
            dados[6] = result.getInt("Matricula");
            dados[7] = result.getInt("9");
           }
               
       }catch(Exception e){
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "ERRO:C361", "ERRO", JOptionPane.ERROR_MESSAGE);
       }    
          JOptionPane.showMessageDialog(null,dados[3]);
          //JOptionPane.showMessageDialog(null,dados[2]);
          //JOptionPane.showMessageDialog(null,dados[1]);
          return dados;
   }
  /* public int [] EstatisticasGeral(String matricula){
       int size = 0;
       int [] dadosGerais = new int [size];
       
       String InstrucaoSql= "SELECT `TaxaDeAbandono` ,`NivelDeSatisfacao` ,`TempoDeAtendimento` , `TempoDeEspera` ,`TaxaDeAmplificacao`"
               + " ,`TempoResolucao` ,`NivelDeServiço` ,`Pendencias`"
               + "FROM estatistica WHERE Matricula = '"+matricula+"'";
       conectar();
       try{
           st = conexao.createStatement();
           result = st.executeQuery(InstrucaoSql);
           while(result.next()){
               
               
           }
       }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showInternalMessageDialog(null,"ERRO:C388", "ERRO", JOptionPane.ERROR_MESSAGE);
       }
       
   }*/
}
