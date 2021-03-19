import java.util.*;

import modelo.Projeto;
import modelo.Recompensa;
import modelo.Sorteio;
import modelo.Tarefas;
import controle.Cadastro;
import controle.Cronometro;

public class App {

    static Tarefas taref1;
    static Tarefas taref2;
    static Tarefas taref21;
    static Tarefas taref22;

    static Projeto[] proj = new Projeto[12];

    static Cadastro cad;

    static Recompensa rec;

    static Sorteio sort;

    static Cronometro c;
    public static void main(String[] args) throws Exception {

        GregorianCalendar d = new GregorianCalendar();
        Date agora = d.getTime();

        //instanciando projetos
        proj[0] = new Projeto(agora, agora,"projeto de oo");
        proj[1] = new Projeto(agora, agora,"Construir casa");
        proj[2] = new Projeto(agora, agora,"projeto 3");
        proj[3] = new Projeto(agora, agora,"projeto de orientação a objetos");

        //instanciando tarefas no projeto 1
        taref1 = new Tarefas("Tarefa 1",agora, agora, 10, "Fazer pagina html do projeto", "urgente",proj[0]);
        taref2 = new Tarefas("Tarefa 2",agora, agora, 25, "Definir diagrama de classes", "Moderada",proj[0]);
        
        //instanciando tarefas no projeto 2
        taref21 = new Tarefas("Tarefa 21",agora, agora, 10, "Fazer parede sul", "urgente",proj[0]);
        taref22 = new Tarefas("Tarefa 22",agora, agora, 50, "Derrubar celeiro", "Moderada",proj[0]);

        //System.out.println(proj1.consultarTarefasCadastradas().toString());
        taref1.cadastrar();
        taref2.cadastrar();
        taref21.cadastrar();
        taref22.cadastrar();
        //System.out.println(proj1.consultarTarefasCadastradas().toString());

        taref1.excluir();
        //System.out.println(proj1.consultarTarefasCadastradas().toString());

        taref1.cadastrar();
        //System.out.println(proj1.consultarTarefasCadastradas().toString());
        
        cad = new Cadastro();
        
        cad.cadastroProjeto(proj[0]);
        cad.cadastroProjeto(proj[1]);
        cad.cadastroProjeto(proj[2]);
        //System.out.println(cad.consultarTarefasProjeto(proj1).toString());

        //Excluindo projeto
        //cad.excluirProjeto(proj1);
        //listando tarefas cadastradas no projeto excluido
        //System.out.println(cad.consultarTarefasProjeto(proj1).toString());
        
        //cad.cadastroProjeto(proj1);
        //System.out.println(cad.consultarTarefasProjeto(proj1).toString());


        //fazendo cadastro de recompensas
        /*rec = new Recompensa();

        rec.cadastarRecompensa("ASSISTIR SERIE/FILME", 0);
        rec.cadastarRecompensa("REDES SOCIAIS", 1);
        rec.cadastarRecompensa("LER LIVRO", 2);
        rec.cadastarRecompensa("JOGAR", 3);
        rec.cadastarRecompensa("BARZINHO <3", 4);

        rec.setRecompensas("COZINHAR", 2);

        System.out.println(rec.consultarRecompensasCadastradas().toString());
       
        sort = new Sorteio();*/

        //Fazendo teste da contagem de tempo do projeto

        //System.out.println(cad.consultarTarefasProjeto(proj1).toString());
        c = new Cronometro();
        //c.cronometro(4,taref1);




        



    }

}
