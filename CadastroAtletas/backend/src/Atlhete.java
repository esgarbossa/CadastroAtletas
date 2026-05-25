public class Atlhete {
    String nome, posicao;
    int idade, nCamisa;
    public Atlhete(String nome, int idade, String posicao, int nCamisa){
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.nCamisa = nCamisa;
    }
    public void exibir(){
        System.out.println("Nome: "+nome+" ||Idade: "+idade+" ||Posicao: "+posicao+" ||Numeracao: "+nCamisa);
    }
}

