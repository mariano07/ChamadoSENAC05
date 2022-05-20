package cadastra_maquinas;

import javax.swing.JOptionPane;

abstract class CadastraMaquinas implements Cadastro {
    
    public String Patrimonio(){
        String patrimonio;
        patrimonio = JOptionPane.showInputDialog("Numero de patrimonio:\n");
        return "Número de patrimonio: "+patrimonio;
    }
    public int Quantidade(){
        int qtd=0;
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de maquinas"));
        return qtd;
    }
    public String Defeito(){
        String defeito;
        defeito = JOptionPane.showInputDialog("Defeito:\n");
        return "Defeito: "+defeito;
    }
    public String[][] Hardware(){
        int i = 0, c = 0;
        String[][] hardaware = new String [8][2];
        hardaware[0][0] = "Processador";
        hardaware[1][0] = "Placa Mãe";
        hardaware[2][0] = "Placa de Vídeo";
        hardaware[3][0] = "HDD || SSD";
        hardaware[4][0] = "Cooler";
        hardaware[5][0] = "Gabinete";
        hardaware[6][0] = "Fonte";
        hardaware[7][0] = "Memória";
        for(i =0 ; i<8 ; i++){
           hardaware[i][1] = JOptionPane.showInputDialog(hardaware[i][0] + ": \n");
        }
        return hardaware;
    }
    public String Laudo(){
        String laudo;
        laudo = JOptionPane.showInputDialog("Laudo: \n");
        return "Laudo: "+laudo;
    }
    public String Cliente(){
        String cliente;
        cliente = JOptionPane.showInputDialog("Informe o cliente: \n");
        return "Cliente: "+cliente;
    }
}
