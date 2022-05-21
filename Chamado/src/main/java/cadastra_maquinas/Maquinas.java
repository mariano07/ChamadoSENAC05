package cadastra_maquinas;

public interface Maquinas {
    int MaquinasColetadas();
    int QtdDefeitos();
    String Defeito();
    String[][] Pecas(int pecas[]);
    String Cliente();
}
