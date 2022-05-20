package cadastra_informacoes;

import javax.swing.JOptionPane;

public abstract class CadInfoMaqui implements CadInformacoes {
   
    @Override
    public String[] cadInfo1(){
        String[] tudo = new String[13];
         
        tudo[0] =  "Nº Patrimônio: " + JOptionPane.showInputDialog("Informe o número do patrimônio");
        tudo[1] = "Nº Sala: " + JOptionPane.showInputDialog("Informe a localização da máquina (Ex.: Sala 302)");
        tudo[2] = "Processador: " + JOptionPane.showInputDialog("Informe o Processador");
        tudo[3] = "Memória RAM: " + JOptionPane.showInputDialog("Informe a quantidade de RAM");
        tudo[4] = "Fonte: " + JOptionPane.showInputDialog("Informe a Fonte");
        tudo[5] = "Placa Mãe: " + JOptionPane.showInputDialog("Informe a Placa-Mãe");
        tudo[6] = "Placa de Vídeo: " + JOptionPane.showInputDialog("Informe a Placa de Vídeo");
        tudo[7] = "HD/SSD: " + JOptionPane.showInputDialog("Informe se o Computador possui HD e/ou SSD e o espaço de armazenamento");
        tudo[8] = "S.O: " + JOptionPane.showInputDialog("Informe o Sistema Operacional");
        tudo[9] = "Técnico: " + JOptionPane.showInputDialog("Informe o Técnico responsável pela máquina");
        
        tudo[10] = "Orçamento: " + JOptionPane.showInputDialog("Informe o orçamento passado pelo cliente ou passado pelo técnico");
        tudo[11] = "Status Orçamento: " + JOptionPane.showInputDialog("Informe se o orçamento foi aprovado ou recusado pelo cliente");
        tudo[12] = "Status Máquina: " + JOptionPane.showInputDialog("Informe o status do computador (ex: manutenção a fazer, finalizado, etc");
        
        return tudo;
        
    }
}
