package cadastra_maquinas;
import Chamado.Main;

public interface Maquinas {
    int MaquinasColetadas();
    int QtdDefeitos();
    String Defeito();
    String[][] Pecas(int pecas[]);
    String Cliente();
}
