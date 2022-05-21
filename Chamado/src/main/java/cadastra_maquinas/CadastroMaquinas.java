/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastra_maquinas;

import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class CadastroMaquinas {
    public void Cadastro(){
        String[][] pecas = new String[8][2];
        String[] pecas1 = new String[8];
        pecas1[0] ="Processador";
        pecas1[1] ="Placa-Mae";
        pecas1[2] ="Memoria RAM";
        pecas1[3] ="HD/SSD";
        pecas1[4] ="";
        pecas1[5] ="Cooler";
        pecas1[6] ="Gabinete";
        pecas1[7] ="Fonte";
        String cliente,defeit0;
        int defeito=0,patrimonio=0;
        int[] pecas2 = new int[8];
        Maquinas M = new Cad_Metodos() {
        };

        cliente = M.Cliente();
        patrimonio = M.MaquinasColetadas();
        for(int i=0;i<8;i++){
            int op = Integer.parseInt(JOptionPane.showInputDialog("Foi recebido "+pecas1[i]+"? 1-sim 2-nao"));
            if(op==1){
                pecas2[i]=1;
            }
            else{
                pecas2[i]=0;
            }
        }
        pecas = M.Pecas(pecas2);
        defeito += M.QtdDefeitos();
        defeit0 = M.Defeito();
    }
}
