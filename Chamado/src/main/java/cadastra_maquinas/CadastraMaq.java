package cadastra_maquinas;

public class CadastraMaq {
    
    public StringBuilder Cadastro(){
        int qtd=0;
        
        String[][] cad_hardaware = new String [8][2];
        String[] cad_CDQPL = new String[5];
        Cadastro C = new CadastraMaquinas() {};
        StringBuilder sb1 = new StringBuilder();
        
        qtd=C.Quantidade();
        StringBuilder[] sb = new StringBuilder[qtd];
        String[] cadastros = new String[qtd];
        
        for(int q=0;q<qtd;q++){
            cad_CDQPL[0]=C.Cliente();
            cad_CDQPL[1]=C.Defeito();
            cad_CDQPL[2]=String.valueOf(C.Quantidade());
            cad_CDQPL[3]=C.Patrimonio();
            cad_CDQPL[4]=C.Laudo();
            cad_hardaware = C.Hardware();
            sb[q].append(" ");
            sb[q].append("<html><table>");
            for(int i=0;i<qtd;i++){
                sb[q].append("<tr><td>");
                sb[q].append(cad_hardaware[i][0]);
                sb[q].append("</td>");
                sb[q].append("<td>");
                sb[q].append(cad_hardaware[i][1]);
                sb[q].append("</td>");
                sb[q].append("<tr><td>");
                sb[q].append(cad_CDQPL[0]);
                sb[q].append("</td>");
                sb[q].append("<tr><td>");
                sb[q].append(cad_CDQPL[1]);
                sb[q].append("</td>");
                sb[q].append("<tr><td>");
                sb[q].append(cad_CDQPL[2]);
                sb[q].append("</td>");
                sb[q].append("<tr><td>");
                sb[q].append(cad_CDQPL[3]);
                sb[q].append("</td>");
                sb[q].append("<tr><td>");
                sb[q].append(cad_CDQPL[4]);
                sb[q].append("</td>");
            }
            sb[q].append("</tr>");
            sb[q].append("</html></table>");
        }
        sb1.append("<html><table>");
        for(int i=0;i<qtd;i++){
           sb1.append("<tr><td>");
           sb1.append(sb[i]);
           sb1.append("</td>");
        }
        sb1.append("</tr>");
        sb1.append("<html><table>");
        return sb1;
    }
}
