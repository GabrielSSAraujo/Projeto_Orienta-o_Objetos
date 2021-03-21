import java.util.*;

import modelo.Projeto;
import modelo.Recompensa;
import modelo.Sorteio;
import modelo.Tarefas;
import controle.Cadastro;
import controle.Cronometro;

public class App {

    static Tarefas taref1;
    static Projeto[] proj = new Projeto[2];
    static Cadastro cad;
    static Recompensa rec;
    static Sorteio sort;
    static Cronometro c;
    public static void main(String[] args) throws Exception {
        
        int menu;
        int tmpTarefa;
        int i =0;

        GregorianCalendar d = new GregorianCalendar();
        Date agora = d.getTime();

        String nomeProj;
        String nomeTarefa;
        String descricaoTarefa;
        String prioridadeTarefa;

        cad = new Cadastro();   
        Scanner ler = new Scanner(System.in);
        Scanner ler1 = new Scanner(System.in);
        
        while(i==0){
            System.out.println("Escolha o que deseja fazer no seu app de orçanização:\n 0. Sair do programa\n\n 1. Cadastrar um novo projeto\n"+
            "   2. Ler projetos existentes\n   3- Excluir um projeto\n   4- Editar projeto\n\n 5- Cadatrar tarefas\n     6- Ler tarefas\n     "+
            "7- Editar tarefa\n     8- Excluir tarefa\n     9- Iniciar tempo tarefa\n     10- Parar tempo tarefa\n\n"+
            " 11- Ler recompensas\n 12- Editar recompensas\n");

            menu = ler.nextInt();
            switch (menu){
                case 0:
                    i=1;
                break;
                case 1: 
                    System.out.println("Digite o nome do projeto que deseja cadastrar: \n");
                    nomeProj = ler1.nextLine();
                    proj[0] = new Projeto(agora,agora, nomeProj);
                    cad.cadastroProjeto(proj[0]);
                break;

                case 2:
                    System.out.println(cad.consultarProjetosCadastrados().toString());
                break;
                
                case 3:
                    System.out.println("Qual o nome do projeto que deseja excluir?\n");
                    nomeProj = ler1.nextLine();
                    cad.excluirProjeto(nomeProj);
                break;
                case 4:
                    System.out.println("Qual o nome do projeto que deseja editar?\n");
                    nomeProj = ler1.nextLine();
                    cad.editarProjeto(nomeProj);
                    //implementar edição de datas
                break;
                case 5:
                    System.out.println("Qual o projeto que deseja cadastrar essa tarefa?\n");
                    nomeProj = ler1.nextLine();
                    System.out.println("Qual o nome da tarefa que deseja cadastrar?\n");
                    nomeTarefa = ler1.nextLine();
                    System.out.println("Qual a descrição?\n");
                    descricaoTarefa = ler1.nextLine();
                    System.out.println("Qual o prioridade (URGENTE, IMPORTANTE, NAO URGENTE, NAO IMPORTANTE))?\n");
                    prioridadeTarefa = ler1.nextLine();
                    System.out.println("Qual o tempo estimado?\n");
                    tmpTarefa = ler.nextInt();

                    taref1 = new Tarefas(nomeTarefa, agora, agora, tmpTarefa, descricaoTarefa, prioridadeTarefa, proj[1]);
                    //ultimo argumento é uma chave para escolher: 0 a tarefa é cadastrada no projeto e 1 as tarefas do projeto são listadas
                    cad.buscarProjeto(nomeProj,taref1,0);

                break;
                case 6:
                    System.out.println("De qual projeto que deseja listar as tarefas?\n");
                    nomeProj = ler1.nextLine();

                    cad.buscarProjeto(nomeProj, null,1);
                break;
                case 7:
                    System.out.println("De qual projeto que deseja excluir a tarefa?\n");
                    nomeProj = ler1.nextLine();
                    cad.buscarProjeto(nomeProj, null,1);
                    System.out.println("Qual tarefa que deseja excluir?\n");
                    nomeTarefa = ler1.nextLine();
                    
                break;
                case 8:
                break;
                case 9:
                break;
            }
        }    


                /*rec = new Recompensa();5


        rec.cadastarRecompensa("ASSISTIR SERIE/FILME", 0);
        rec.cadastarRecompensa("REDES SOCIAIS", 1);
        rec.cadastarRecompensa("LER LIVRO", 2);
        rec.cadastarRecompensa("JOGAR", 3);
        rec.cadastarRecompensa("BARZINHO <3", 4);

        rec.setRecompensas("COZINHAR", 2);

        System.out.println(rec.consultarRecompensasCadastradas().toString());
       
        sort = new Sorteio();*/




        



    }

}
