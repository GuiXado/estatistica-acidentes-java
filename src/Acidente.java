import java.io.*;
import javax.swing.*;
public class Acidente {
    public static void main(String[] args) throws IOException{
        //String fileName = "Acidente.txt";
        
        Classe[] classe = new Classe[2];
        Regra r = new Regra();
        //for (int i = 0 ; i < 10 ; i++) classe[i] = new Classe();
        
        int n;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite:  \n"
            + "1 - Cadastro Estatística \n"
            + "2 - Consulta por quantidade de acidentes \n"
            + "3 - Consulta por estatísticas de acidentes \n"
            + "4 - Acidentes acima da média das 10 cidades \n"
            + "9 - Finaliza "));

            switch(n){
                case 1:
                    classe = r.FCadastro(classe); 
                    break;
                case 2:
                    r.Pquantidade(classe);
                    break;
                case 3:
                    r.Consulta(classe);
                    break;
                case 4: 
                    r.Acidente(classe);
                    break;
                case 5:
                    r.Leitura(classe);
                    break;
                case 9: break;
                default: JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }while(n != 9);
    }
}
