public class Classe {
    int codigocidade;
    String nomecidade;
    int qntacidentes;


    Classe(){
        this(0,"",0);
    }
    
    Classe(int cod, String nome, int qnt){
        codigocidade = cod;
        nomecidade = nome;
        qntacidentes = qnt;
    
    }
    
}
