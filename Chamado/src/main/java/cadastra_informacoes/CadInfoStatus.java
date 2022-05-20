package cadastra_informacoes;

import javax.swing.JOptionPane;

public abstract class CadInfoStatus implements CadInformacoes {
    
    @Override
    public void cadInfor2(){
        double orc;
        String aprov,stat;
        
        orc = Double.parseDouble(JOptionPane.showInputDialog("Informe o orçamento"));
        aprov = JOptionPane.showInputDialog("Informe se o orçamento foi aprovado ou recusado");
        stat = JOptionPane.showInputDialog("Informe o status do computador (ex: manutenção a fazer, finalizado, etc");
    }
}
