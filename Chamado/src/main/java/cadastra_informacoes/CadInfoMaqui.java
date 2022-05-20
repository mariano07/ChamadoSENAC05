package cadastra_informacoes;

import javax.swing.JOptionPane;

public abstract class CadInfoMaqui implements CadInformacoes {
   
    @Override
    public void cadInfor1(){
         String processador = " ", ram = " ", fonte = " ", pmae = " ", pvideo = " ", local = " ", patrimonio = " ", sistema = "", hd = "", tec = "";

        patrimonio = JOptionPane.showInputDialog("Informe o número do patrimônio");
        local = JOptionPane.showInputDialog("Informe a localização da máquina (Ex.: Sala 302)");
        processador = JOptionPane.showInputDialog("Informe o Processador");
        ram = JOptionPane.showInputDialog("Informe a quantidade de RAM");
        fonte = JOptionPane.showInputDialog("Informe a Fonte");
        pmae = JOptionPane.showInputDialog("Informe a Placa-Mãe");
        pvideo = JOptionPane.showInputDialog("Informe a Placa de Vídeo");
        hd = JOptionPane.showInputDialog("Informe se o Computador possui HD e/ou SSD e o espaço de armazenamento");
        sistema = JOptionPane.showInputDialog("Informe o Sistema Operacional");
        tec = JOptionPane.showInputDialog("Informe o Técnico responsável pela máquina");
    }
    
        @Override
    public void cadInfor2(){
        double orc;
        String aprov,stat;
        
        orc = Double.parseDouble(JOptionPane.showInputDialog("Informe o orçamento"));
        aprov = JOptionPane.showInputDialog("Informe se o orçamento foi aprovado ou recusado");
        orc = Double.parseDouble(JOptionPane.showInputDialog("Informe o orçamento passado pelo cliente ou passado pelo técnico"));
        aprov = JOptionPane.showInputDialog("Informe se o orçamento foi aprovado ou recusado pelo cliente");
        stat = JOptionPane.showInputDialog("Informe o status do computador (ex: manutenção a fazer, finalizado, etc");
   }
}
