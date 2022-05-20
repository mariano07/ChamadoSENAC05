package cadastra_informacoes;

import javax.swing.JOptionPane;

public abstract class CadInfoMaqui implements CadInformacoes {
    
   
    @Override
    public void numEquip(){
       String patrimonio="";
       
       patrimonio = JOptionPane.showInputDialog("Informe o número do patrimônio: ");
    }
    
    @Override
    public void loc(){
        String local="";
        
        local = JOptionPane.showInputDialog("Informe a localização da máquina (Ex.: Sala 302): ");
    }
    
    @Override
    public void defeito(){
        
    }
    
    @Override
    public void hardware(){
        String processador = "", ram = "", fonte = "", pmae = "", pvideo = "";
        
        processador = JOptionPane.showInputDialog("Informe o Processador: ");
        ram = JOptionPane.showInputDialog("Informe a quantidade de RAM: ");
        fonte = JOptionPane.showInputDialog("Informe a Fonte: ");
        pmae = JOptionPane.showInputDialog("Informe a Placa-Mãe: ");
        pvideo = JOptionPane.showInputDialog("Informe a Placa de Vídeo: ");


    }
}
