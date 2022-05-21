package cadastra_informacoes;
import Chamado.Main;

public interface CadInformacoes {
    
    String[] cadInfo1();
    
    default String[] pcs(){
        String[] tudo = new String[15];
        return tudo;
    }
}
