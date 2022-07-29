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
    private final static String url ="jdbc:mysql://172.20.126.217:3306/ChamadoSENAC";
    private final static String username ="chamado";
    private final static String password ="root";
    Connection conexao = null;
    Connection con = conexao;
    Statement st1 = null;
    Statement st2 = null;
    ResultSet result1 = null;
    ResultSet result2 = null;
    
    private void conectar(){
         try{
            conexao = DriverManager.getConnection(url,username,password);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C029","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void desconectar(){
        try {
            st1.close();
            conexao.close();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C037","ERRO", JOptionPane.ERROR_MESSAGE);
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
            st1 = conexao.createStatement();
            result1 = st1.executeQuery(InstrucaoSQL);
            while(result1.next()){
              cargo = result1.getString("Cargo");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            cargo = "C054";
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
            st1 = conexao.createStatement();
            result1 = st1.executeQuery(InstrucaoSQL);
            while(result1.next()){
              matricula = result1.getString("Matricula");  
            }
        }
        catch (Exception e){
            e.printStackTrace();
           matricula = "C075";
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
            st1 = conexao.createStatement();
            result1 = st1.executeQuery(InstrucaoSQL);
            while(result1.next()){
              Usuario = result1.getString("AES_DECRYPT(Usuario,'"+chave+"')");  
            }
        }
        catch (Exception e){
            e.printStackTrace();
           Usuario = "C095";
        }
        desconectar();
        return Usuario;
    }
    public void Instituicao(String nome,String endereco,String telefone,String responsavel,String cnpj,String cpf){
        String InstrucaoSQL="INSERT INTO `instituicoes` (`idInstituicoes`, `Nome`, `Localizacao`, `Telefone`, `Responsavel`, `CNPJ`, `CPF`) "
                + "VALUES (NULL, '"+nome+"', '"+endereco+"', '"+telefone+"', '"+responsavel+"', '"+cnpj+"', '"+cpf+"');";
        
        conectar();
        try{
            st1 = conexao.createStatement();
            st1.executeUpdate(InstrucaoSQL);
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C115", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void Cliente(String nome,String cpf,String telefone,String email,String endereco){
        String InstrucaoSQL="INSERT INTO `clientes` (`idClientes`, `Nome`, `CPF`, `Telefone`, `Email`, `Endereco`) "
                + "VALUES (NULL, '"+nome+"', '"+cpf+"', '"+telefone+"', '"+email+"', '"+endereco+"');";
        
        conectar();
        try{
            st1 = conexao.createStatement();
            st1.executeUpdate(InstrucaoSQL);
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C129", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void CadastroMaquina(String cpu,String pmae,String ram,String hd,String ssd,String ccpu,String cooler,String gpu,String fonte,String gabinete,String matricula,String patrimonio,String sala){
        String InstrucaoSQL="INSERT INTO `chamado` (`Patrimonio`, `Sala`, `Placa mae`, `Processador`, `Memorias Ram`, `Placa de video`, `Fonte`, `Ssd`, `Hd`, `Cooler`, `CoolerCpu`, `Gabinete`, `Matricula`, `Data`, `Hora`) "
                + "VALUES ('"+patrimonio+"', '"+sala+"', '"+pmae+"', '"+cpu+"', '"+ram+"', '"+gpu+"', '"+fonte+"', '"+ssd+"', '"+hd+"', '"+cooler+"', '"+ccpu+"', '"+gabinete+"', '"+matricula+"', '"+getDate()+"', '"+getTime()+"');";
        
        conectar();
        try{
            st1 = conexao.createStatement();
            st1.executeUpdate(InstrucaoSQL);
            JOptionPane.showMessageDialog(null, "Informações Salvas Com Sucesso!");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C143", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void Defeito(String defeito){
        String idTicket="";
        String InstrucaoSQL1="SELECT idTicket FROM chamado";
        String InstrucaoSQL2="";
        
        conectar();
        try{
            st1 = conexao.createStatement();
            result1= st1.executeQuery(InstrucaoSQL1);
            while(result1.next()){
                idTicket = result1.getString("idTicket");
            }
            InstrucaoSQL2 = "INSERT INTO problema (idTicket,Problema,StatusDoProblema) "
                + "VALUES ('"+idTicket+"','"+defeito+"','PENDENTE')";
            st2 = conexao.createStatement();
            st2.executeUpdate(InstrucaoSQL2);
            JOptionPane.showMessageDialog(null, "Informações Salvas Com Sucesso!");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C158", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void DefeitoSolucao(String defeito,String solucao){
        String idTicket="";
        String InstrucaoSQL1="SELECT idTicket FROM chamado";
        String InstrucaoSQL2="";
        
        conectar();
        try{
            st1 = conexao.createStatement();
            result1= st1.executeQuery(InstrucaoSQL1);
            while(result1.next()){
                idTicket = result1.getString("idTicket");
            }
            InstrucaoSQL2="INSERT INTO problema (idTicket,Problema,StatusDoProblema,Solucao) "
                + "VALUES ('"+idTicket+"','"+defeito+"','CONCLUIDO','"+solucao+"')";
            st1 = conexao.createStatement();
            st1.executeUpdate(InstrucaoSQL2);
            JOptionPane.showMessageDialog(null, "Informações Salvas Com Sucesso!");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C181", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void Solucao(String solucao,String ticket){
        String InstrucaoSQL="UPDATE problema SET StatusDoProblema = 'CONCLUIDO' AND SET Solucao = '"+solucao+"' "
                + "WHERE idTicket = '"+ticket+"'";
        
        conectar();
        try{
            st1 = conexao.createStatement();
            st1.executeUpdate(InstrucaoSQL);
            JOptionPane.showMessageDialog(null, "Informações Salvas Com Sucesso!");
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C204", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void AddTec(String nome, String matricula, String usuario, String senha){
        String InstrucaoSQL="INSERT INTO usuario (Nome,Matricula,Usuario,Senha,Cargo) "
                + "VALUES ('"+nome+"','"+matricula+"',AES_ENCRYPT('"+usuario+"','"+chave+"'),AES_ENCRYPT('"+senha+"','"+chave+"'),'TEC')";
        
        conectar();
        try{
            st1 = conexao.createStatement();
            st1.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C219", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void AddAdm(String nome, String matricula, String usuario, String senha){
        String InstrucaoSQL="INSERT INTO usuario (Nome,Matricula,Usuario,Senha,Cargo) "
                + "VALUES ('"+nome+"','"+matricula+"',AES_ENCRYPT('"+usuario+"','"+chave+"'),AES_ENCRYPT('"+senha+"','"+chave+"'),'ADM')";
        
        conectar();
        try{
            st1 = conexao.createStatement();
            st1.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C233", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public boolean InstituicaoCPF(String cpf){
        String InstrucaoSQL="SELECT CPF FROM instituicoes";
        boolean verifica = false;
        conectar();
        try{
            st1 = conexao.createStatement();
            result1 = st1.executeQuery(InstrucaoSQL);
            while(result1.next()){
                String CPF = result1.getString("CPF");
                if(CPF.equals(cpf)){
                    verifica=true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C247", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return verifica;
    }
    public boolean InstituicaoCNPJ(String cnpj){
        String InstrucaoSQL="SELECT CNPJ FROM instituicoes";
        boolean verifica = false;
        conectar();
        try{
            st1 = conexao.createStatement();
            result1 = st1.executeQuery(InstrucaoSQL);
            while(result1.next()){
                String CNPJ = result1.getString("CNPJ");
                if(CNPJ.equals(cnpj)){
                    verifica=true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C267", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return verifica;
    }
    public boolean ClienteCPF(String cpf){
        String InstrucaoSQL="SELECT CPF FROM clientes";
        boolean verifica = false;
        conectar();
        try{
            st1 = conexao.createStatement();
            result1 = st1.executeQuery(InstrucaoSQL);
            while(result1.next()){
                String CPF = result1.getString("CPF");
                if(CPF.equals(cpf)){
                    verifica=true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C287", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return verifica;
    }
    public String[] getAluno(String matricula){
        String[] aluno = new String[2];
        String InstrucaoSQL="SELECT Nome,AES_DECRYPT(Usuario,'"+chave+"') FROM usuario WHERE Matricula = '"+matricula+"'";

        conectar();
        try{
            st1 = conexao.createStatement();
            result1 = st1.executeQuery(InstrucaoSQL);
            while(result1.next()){
                aluno[0]=result1.getString("Nome");
                aluno[1]=result1.getString("AES_DECRYPT(Usuario,'"+chave+"')");
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C307", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return aluno;
    }
    public void DeletaAluno(String matricula){
        String InstrucaoSQL="DELETE FROM `usuario` WHERE `Matricula`= '"+matricula+"'";
        conectar();
        try{
            st1 = conexao.createStatement();
            st1.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C326", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
   public boolean EditaUsuario(String matricula,String Usuario,String Senha){
        boolean tf=false;
        String InstrucaoSQL="UPDATE `usuario` SET `Usuario` = AES_ENCRYPT('"+Usuario+"','"+chave+"'), `Senha` = AES_ENCRYPT('"+Senha+"','"+chave+"') "
                + "WHERE `Matricula` = '"+matricula+"'";

        conectar();
        try{
            st1 = conexao.createStatement();
            st1.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C338", "ERRO", JOptionPane.ERROR_MESSAGE);
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
            st1 = conexao.createStatement();
            st1.executeUpdate(InstrucaoSQL);
            JOptionPane.showMessageDialog(null, "Bug reportado com sucesso!\nObrigado pela contribuição :D");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C355", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
   }
   public void Feedback(String usuario,String matricula,String feedback){
       String InstrucaoSQL="INSERT INTO `feedback` (`idFeedback`,`Usuario`, `Matricula`, `Feedback`) "
               + "VALUES (NULL,'"+usuario+"','"+matricula+"','"+feedback+"')";
        conectar();
        try{
            st1 = conexao.createStatement();
            st1.executeUpdate(InstrucaoSQL);
            JOptionPane.showMessageDialog(null, "Obrigado pelo feedback!");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C369", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
   }
   public int[] Estatisticas (String matricula){
       int[] dados = new int[7];
       String InstrucaoSql="SELECT `TaxaDeAbandono` ,`NivelDeSatisfacao` ,`TempoDeAtendimento` , `TempoDeEspera` ,`TaxaDeAmplificacao`"
               + " ,`NivelDeServico` ,`Pendencias`"
               + "FROM estatistica WHERE Matricula = '"+matricula+"'";
       conectar();
       try{
           st1 = conexao.createStatement();
           result1 = st1.executeQuery(InstrucaoSql);
           while(result1.next()){
            dados[0] = result1.getInt("TaxaDeAbandono");
            dados[1] = result1.getInt("NivelDeSatisfacao");
            dados[2] = result1.getInt("TempoDeAtendimento");
            dados[3] = result1.getInt("TempoDeEspera");
            dados[4] = result1.getInt("TaxaDeAmplificacao");
            dados[5] = result1.getInt("NivelDeServico");
            dados[6] = result1.getInt("Pendencias");
           }
               
       }catch(Exception e){
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "ERRO:C383", "ERRO", JOptionPane.ERROR_MESSAGE);
       }
       desconectar();
       return dados;
   }
   public int QuantidadeEstatisticas(){
       int size =0;
       conectar();
       try{
         String InstrucaoSql = "SELECT COUNT(*) FROM `estatistica`";
         st1 = conexao.createStatement();
         result1 = st1.executeQuery(InstrucaoSql);
         while(result1.next()){
            size = result1.getInt(1);
         }
            
       }catch(Exception e){
            e.printStackTrace();
           JOptionPane.showInternalMessageDialog(null,"ERRO:C409", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
       desconectar();
       return size;
   }
    public int [] EstatisticasGeral(int size){
       int[] dados = new int[7];
       String InstrucaoSql= "SELECT SUM(TaxaDeAbandono/3) AS Taxa, "
               + "SUM(NivelDeSatisfacao/"+size+") AS NivelSatisfa, SUM(TempoDeAtendimento/"+size+") AS TemporAtendi, "
               + "SUM(TempoDeEspera/"+size+") AS TempoEspera, SUM(TaxaDeAmplificacao/"+size+") AS TaxaAmpli, "
               + "SUM(NivelDeServico/"+size+") AS NivelServ, SUM(Pendencias) AS Penden "
               + "FROM estatistica; "; 
       conectar();
       try{
           st1 = conexao.createStatement();
           result1 = st1.executeQuery(InstrucaoSql);
           while(result1.next()){
               dados[0] = result1.getInt("Taxa");
               dados[1] = result1.getInt("NivelSatisfa");
               dados[2] = result1.getInt("TemporAtendi");
               dados[3] = result1.getInt("TempoEspera");
               dados[4] = result1.getInt("TaxaAmpli");
               dados[5] = result1.getInt("NivelServ");
               dados[6] = result1.getInt("Penden"); 
           }
       }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showInternalMessageDialog(null,"ERRO:C427", "ERRO", JOptionPane.ERROR_MESSAGE);
       }
       desconectar();
      return dados;
   }
    public String[] MatriculaEstatisticas(int size){
       String[] matriculas = new String[size];
       int i=0;
       conectar();
       try{
         String InstrucaoSql = "SELECT Matricula FROM estatistica";
         st1 = conexao.createStatement();
         result1 = st1.executeQuery(InstrucaoSql);
         while(result1.next()){
          matriculas[i] = result1.getString("Matricula");
          i++;
        }
        }catch(Exception e){
            e.printStackTrace();
           JOptionPane.showInternalMessageDialog(null,"ERRO:C454", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
       desconectar();
       return matriculas;
    }
    public void BuscaJCE(String nome, String patrimonio){
         int id = 0;
         String InstrucaoSQL = "SELECT idClientes FROM clientes WHERE nome = '"+nome+"'";
         conectar();
        try{
         st1 = conexao.createStatement();
         result1 = st1.executeQuery(InstrucaoSQL);
         while(result1.next()){
          id = result1.getInt("idClientes");
        }
        }catch(Exception e){
            e.printStackTrace();
           JOptionPane.showInternalMessageDialog(null,"ERRO:C473", "ERRO", JOptionPane.ERROR_MESSAGE);
        }        
        desconectar();
        AddExistentePF(id, patrimonio);
    }
    public void AddExistentePF(int id, String patrimonio){
        String InstrucaoSQL = "UPDATE chamado SET idCliente = "+id+" WHERE Patrimonio = '"+patrimonio+"'";
        conectar();
        try{
         st1 = conexao.createStatement();
         st1.executeUpdate(InstrucaoSQL);
        JOptionPane.showMessageDialog(null, "Chamado registrado com sucesso!");         
        }catch(Exception e){
            e.printStackTrace();
           JOptionPane.showMessageDialog(null,"ERRO:C490", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    public void BuscaJIE(String nome, String patrimonio){
         int id = 0;
         String InstrucaoSQL = "SELECT idInstituicoes FROM instituicoes WHERE nome = '"+nome+"'";
         conectar();
        try{
         st1 = conexao.createStatement();
         result1 = st1.executeQuery(InstrucaoSQL);
         while(result1.next()){
          id = result1.getInt("idInstituicoes");
        }
        }catch(Exception e){
            e.printStackTrace();
           JOptionPane.showInternalMessageDialog(null,"ERRO:C503", "ERRO", JOptionPane.ERROR_MESSAGE);
        }        
        desconectar();
        AddExistentePJ(id, patrimonio);
    }
    public void AddExistentePJ(int id, String patrimonio){
        String InstrucaoSQL = "UPDATE chamado SET idInstituicao = "+id+" WHERE Patrimonio = '"+patrimonio+"'";
        conectar();
        try{
         st1 = conexao.createStatement();
         st1.executeUpdate(InstrucaoSQL);
         JOptionPane.showMessageDialog(null, "Chamado registrado com sucesso!");
        }catch(Exception e){
            e.printStackTrace();
           JOptionPane.showMessageDialog(null,"ERRO:C520", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
   public void Orcamento(String valor,String status){
        String InstrucaoSQL = "INSERT INTO orcamento (Orcamento,StatusDoOrcamento)"
        +"VALUES ('"+valor+"','"+status+"')";
        conectar();      
        try{
           st1 = conexao.createStatement();
           st1.executeUpdate(InstrucaoSQL);
        }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"ERRO:C533" , "ERRO" , JOptionPane.ERROR_MESSAGE);
        }
         desconectar();
    }
   public void AtualizaChamado(int id,String patrimonio,String sala,String pmae,String processador,String ram,String gpu,String fonte,String ssd,String hd,String cool,String ccpu,String gabinete){
       String InstrucaoSQL = "UPDATE `chamado` SET `Patrimonio`='"+patrimonio+"',`Sala`='"+sala+"',`Placa mae`='"+pmae+"',`Processador`='"+processador+"',"
               + "`Memorias Ram`='"+ram+"',`Placa de video`='"+gpu+"',`Fonte`='"+fonte+"',`Ssd`='"+ssd+"',`Hd`='"+hd+"',`Cooler`='"+cool+"',"
               + "`CoolerCpu`='"+ccpu+"',`Gabinete`='"+gabinete+"',`Data`='"+getDate()+"',`Hora`='"+getTime()+"' WHERE idTicket = "+id;
       conectar();
       try{
           st1 = conexao.createStatement();
           st1.executeUpdate(InstrucaoSQL);
       }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"ERRO:C546" , "ERRO" , JOptionPane.ERROR_MESSAGE);
       }
       desconectar();
   }
   public void AtualizaDef(int id,String defeito){
       String InstrucaoSQL = "UPDATE `problema` SET `Problema`='"+defeito+"' WHERE idTicket = "+id;
       conectar();
       try{
           st1 = conexao.createStatement();
           st1.executeUpdate(InstrucaoSQL);
       }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"ERRO:C560" , "ERRO" , JOptionPane.ERROR_MESSAGE);
       }
       desconectar();
   }
   public void AtualizaDefSolu(int id,String defeito,String solucao){
       String InstrucaoSQL = "UPDATE `problema` SET `Problema`='"+defeito+"',`StatusDoProblema`='CONCLUIDO',`Solucao`='"+solucao+"'"
               + "WHERE idTicket = "+id;
       conectar();
       try{
           st1 = conexao.createStatement();
           st1.executeUpdate(InstrucaoSQL);
       }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"ERRO:C572" , "ERRO" , JOptionPane.ERROR_MESSAGE);
       }
       desconectar();
   }
   public int idCliente(String nome,String cpf){
        String InstrucaoSQL="SELECT idClientes FROM `clientes` "
                + "WHERE `Nome` ='"+nome+"' AND `CPF` ='"+cpf+"'";
        int id =0;
        conectar();
        try{
            st1 = conexao.createStatement();
            result1 = st1.executeQuery(InstrucaoSQL);
            while(result1.next()){
                id = result1.getInt("idClientes");
            }
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C585", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return id;
    }
   public int idInstituicao(String nome,String cnpj){
        String InstrucaoSQL="SELECT idInstituicoes FROM `instituicoes` "
                + "WHERE `Nome` ='"+nome+"' AND `CNPJ` ='"+cnpj+"'";
        int id =0;
        conectar();
        try{
            st1 = conexao.createStatement();
            result1 = st1.executeQuery(InstrucaoSQL);
            while(result1.next()){
                id = result1.getInt("idInstituicoes");
            }
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO:C603", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return id;
    }
}