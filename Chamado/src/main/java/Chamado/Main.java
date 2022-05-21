package Chamado;

import cadastra_informacoes.CadInfoMaqui;
import cadastra_informacoes.CadInformacoes;
import cadastra_informacoes.Cad_Info;
import cadastra_maquinas.Cad_Metodos;
import cadastra_maquinas.CadastroMaquinas;
import cadastra_maquinas.Maquinas;

public class Main{

    public static void main(String[] args) {
        CadastroMaquinas cm = new CadastroMaquinas();
        Cad_Info ci = new Cad_Info();
        
        ci.Cadastro();
        cm.Cadastro();
    }
}

