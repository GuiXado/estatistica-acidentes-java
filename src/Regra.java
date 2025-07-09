import java.io.*;
import javax.swing.*;
public class Regra {
    int i;
    String b;
    String fileName = "Acidente.txt";
          //retorno          //tipo e nome da variavel que estou recebendo
    public Classe[] FCadastro(Classe[] classe)  throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));
                                  
        for (i = 0; i < 2; i++) classe[i] = new Classe();
        
        for (i = 0; i < 2; i++){
            classe[i].codigocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo:"));
            writer.write(classe[i].codigocidade);
            writer.newLine();
            
            classe[i].nomecidade = JOptionPane.showInputDialog("DIgite o nome da cidade:");
            writer.write(classe[i].nomecidade);
            writer.newLine();
            
            classe[i].qntacidentes =Integer.parseInt(JOptionPane.showInputDialog("Quantidade de acidentes:"));
            writer.write(classe[i].qntacidentes);
            writer.newLine();
            
            //writer.write("**");
            //writer.newLine();
        }
        writer.close(); // Fecha o txt
        return classe;
    }
    
    public void Pquantidade(Classe[] classe){
        for (i = 0; i < 2; i++){
            if( classe[i].qntacidentes > 100 && classe[i].qntacidentes < 500 )
                System.out.println(classe[i].nomecidade + " teve, " + classe[i].qntacidentes + " acidentes");
                JOptionPane.showMessageDialog(null, classe[i].nomecidade + " teve, " + classe[i].qntacidentes + " acidentes");
        }
    }
    int menor, maior;
    public void Consulta(Classe[] classe){
        for (i = 0; i <2; i++){
            if (i == 0){
                menor = classe[i].qntacidentes;
                maior = classe[i].qntacidentes;
            }else{
                if (menor > classe[i].qntacidentes) menor = classe[i].qntacidentes;
                if (maior < classe[i].qntacidentes) maior = classe[i].qntacidentes;
            }
        }
        JOptionPane.showMessageDialog(null, "o menor Ã©, " + menor + "\no maior Ã©: " + maior);
    }
    //int soma;
    double media;
    public void Acidente(Classe[] classe){
        for (i = 0; i < classe.length; i++){
            media += classe[i].qntacidentes;
        }
        media /= classe.length;
        JOptionPane.showMessageDialog(null, "A média de Acidentes no ano é: " + media);
        for (i = 0; i < classe.length; i++){
            if(classe[i].qntacidentes > media){
                System.out.println("\nCódigo da cidade: "+ classe[i].codigocidade + "\nNome da cidade: " + classe[i].nomecidade + "\nQuantidade de acidentes: " + classe[i].qntacidentes + "\n");
            }
        }    
    }
    
      public void Leitura(Classe[] classe) throws IOException{
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        
        for(i = 0; i < classe.length; i++){
            classe[i] = new Classe();
        }
        
        for(i = 0; i < classe.length; i++){
            classe[i].codigocidade = Integer.parseInt(read.readLine());
            classe[i].nomecidade = read.readLine();
            classe[i].qntacidentes = Integer.parseInt(read.readLine());
        }

        read.close(); //Fecha a leitura
    }
}
