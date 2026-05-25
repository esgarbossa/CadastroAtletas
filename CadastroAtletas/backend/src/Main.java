import java.util.*;

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int i = 0, opcoes;
    ArrayList<Team>times = new ArrayList<>();

    do{
        System.out.println("[1] Cadastro de atletas");
        System.out.println("[2] Cadastro de times");
        System.out.println("[3] Listagem de elencos");
        System.out.println("[0] Sair");
        opcoes = sc.nextInt();
        switch (opcoes){
            case 1:
                System.out.println("Times: ");
                if (times.isEmpty()){
                    System.out.println("Cadastre um time antes!");
                    break;
                }
                for (i = 0; i < times.size(); i++){
                    System.out.println(i+"-"+times.get(i).nomeTime);
                }
                System.out.println("Selecione o time do atleta:");
                int indiceTime = sc.nextInt();
                sc.nextLine();
                if(indiceTime < 0 || indiceTime >= times.size()){
                    System.out.println("Time invalido!");
                    break;
                }

                System.out.println("Insira o nome completo do atleta:");
                String nomeAtleta = sc.nextLine();

                System.out.println("Insira a idade do atleta:");
                int idade = sc.nextInt();
                sc.nextLine();

                System.out.println("Insira a posicao do atleta:");
                String posicao = sc.nextLine().toUpperCase();

                System.out.println("Insira o numero da camisa do atleta:");
                int nCamisa = sc.nextInt();
                sc.nextLine();

                Atlhete atlhete = new Atlhete(nomeAtleta, idade, posicao, nCamisa);

                times.get(indiceTime).addAtlhete(atlhete);

                System.out.println("Cadastro concluido com sucesso!");
                break;
            case 2:
                System.out.println("Insira o nome do time:");
                sc.nextLine();
                String nomeTime = sc.nextLine();

                System.out.println("Insira a sigla do time(4 letas max):");
                String siglaTime = sc.nextLine().toUpperCase();
                Team team = new Team(nomeTime, siglaTime);
                times.add(team);

                System.out.println("Cadastro concluido com sucesso!");
                break;
            case 3:
                if (times.isEmpty()){
                    System.out.println("Nenhum time cadastrado!");
                }else{
                    for (Team t : times){
                        t.exibirTime();
                    }
                }
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opcao invalida!");
        }

    }while (opcoes != 0);
    sc.close();
}