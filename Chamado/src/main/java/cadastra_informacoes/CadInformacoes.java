package cadastra_informacoes;

public interface CadInformacoes {
    
    String[] cadInfo1();
    
    default String[] pcs(){
        String[] tudo = new String[13];
        return tudo;
    }
}
