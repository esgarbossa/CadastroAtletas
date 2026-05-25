import java.util.ArrayList;

public class Team {
    String nomeTime;
    String sigla;
    ArrayList<Atlhete>atletas = new ArrayList<>();
    public Team(String nomeTime, String sigla){
        this.nomeTime = nomeTime;
        this.sigla = sigla;
    }
    public void addAtlhete(Atlhete atlhete){
        atletas.add(atlhete);
    }
    public void exibirTime(){
        System.out.println("Time: "+nomeTime+"||"+sigla);
        if (atletas.isEmpty()){
            System.out.println("Nenhum atleta cadastrado no time");
        }else{
            System.out.println("Atletas:");
            for(Atlhete atlhete : atletas){
                atlhete.exibir();
            }
        }
    }
}
