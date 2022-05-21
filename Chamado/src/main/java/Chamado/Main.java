package Chamado;

import cadastra_informacoes.Cad_Info;
import cadastra_maquinas.CadastroMaquinas;

public class Main{

    public static void main(String[] args) {
        CadastroMaquinas cm = new CadastroMaquinas();
        Cad_Info ci = new Cad_Info();
        
        ci.Cadastro();
        cm.Cadastro();
    }
}

