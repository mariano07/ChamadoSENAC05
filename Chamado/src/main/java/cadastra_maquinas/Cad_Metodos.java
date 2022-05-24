package cadastra_maquinas;
import Chamado.Main;

import javax.swing.JOptionPane;

public abstract class Cad_Metodos implements Maquinas{
    //variables 
    public int MaquinasColetadas(){
       int patrimonio=0;
       patrimonio = Integer.parseInt(JOptionPane.showInputDialog("Numero do patrimonio:\n"));
       return patrimonio; 
    }
    //variabels
    public int QtdDefeitos(){
        int n=0,op=0;
        boolean d=false;
        
        op = Integer.parseInt(JOptionPane.showInputDialog("A maqui apresentou defeitos? 1-sim 2-nao\n"));
        //if to confirmation the machine
        if(op==1){
            d=true;
        }
        if(d==true){
            n=1;
        }
        return n;
    }
    public String Defeito(){
        //variables
        String defeito;
        defeito = JOptionPane.showInputDialog("Informe o defeito:\n");
        return defeito;
    }
    public String[][] Pecas(int pecas[]){
        //variables
        String [][] pecas1 = new String[8][2];
        pecas1[0][0]="Processador: ";
        pecas1[1][0]="Placa-Mae: ";
        pecas1[2][0]="GPU: ";
        pecas1[3][0]="Memoria RAM: ";
        pecas1[4][0]="HD/SSD: ";
        pecas1[5][0]="Cooler: ";
        pecas1[6][0]="Gabinete: ";
        pecas1[7][0]="Fonte: ";
        
        //array to get a hardware
        for (int i=0;i<8;i++){
           if(pecas[i]==1){
               pecas1[i][1]="Recebido";
           }
           else{
               pecas1[i][1]="Nao recebido";
           }
        }
        return pecas1;
    }
    //variables
    public String Cliente(){
        String cliente;
        cliente = JOptionPane.showInputDialog("Cliente:\n");
        return cliente;
    }
}
