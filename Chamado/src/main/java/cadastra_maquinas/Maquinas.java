/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastra_maquinas;

/**
 *
 * @author alunos
 */
public interface Maquinas {
    int MaquinasColetadas();
    int QtdDefeitos();
    String Defeito();
    String[][] Pecas(int pecas[]);
    String Cliente();
}
