package controle;

import modelo.*;

public class Cadastro{

    private Projeto[] arrayProjeto = new Projeto[15];
    private int numProjetos=0;

    //cadastrando projetos e verificando se há alguma posição nula para ser preenchida
    public void cadastroProjeto(Projeto pro){
        //chave para verificar se há posição nula
        int qtd=0;
        //Fazer condição Se projeto ja existir printar que já existe.***********************
        if(getNumProjetos()==0){setProjetos(pro, 0);}
        else{
            for(int i=0; i<getNumProjetos(); i++){
                if(arrayProjeto[i]==null){
                    setProjetos(pro, i);
                    //se houver posição nula a chave é 1
                    qtd=1;
                    break;
                }
                else{
                    setProjetos(pro, getNumProjetos());
                }
            }
        }
        //caso a chave seja 0, deve incrementar o numero de projetos pois nao havia posição nula no vetor
        if(qtd==0){setNumProjetos(getNumProjetos()+1);}
        
    }
    public void excluirProjeto(Projeto pro){
        for(int j=0; j<getNumProjetos();j++){
            if(arrayProjeto[j] != null && pro.getNome().equals(arrayProjeto[j].getNome())){
                System.out.println("\n apagando "+pro.getNome()+"...\n");
                arrayProjeto[j]=null;

            }
        }
    }

    //cadastro de tarefas dentro de um projeto
   /* public void cadastroTarefas(Projeto proj,Tarefas taref){
        int qtd;
        qtd = proj.getNumTarefas();
        proj.setTarefas(taref, qtd);
        proj.setNumTarefas(qtd+1);
    }*/

    public int getNumProjetos(){
        return numProjetos;
    }
    public void setNumProjetos(int numProjetos){
        this.numProjetos = numProjetos;
    }

    public Projeto[] getArrayProjetos(){
        return this.arrayProjeto;
    }
    public void setArrayProjetos(Projeto[] p){
        this.arrayProjeto = p;
    }

    public Projeto getProjetos(int i){
        return arrayProjeto[i];
    }
    public void setProjetos(Projeto projetos, int i){
        this.arrayProjeto[i] = projetos;
    }

    public String consultarProjetosCadastrados() {
		String saida = "***** Lista de projetos cadastrados ***** \n" ;
		for(int i = 0; i < getNumProjetos(); i++) {
			if(getProjetos(i)!=null){
                saida = saida + "\n" +i+"-"+ getProjetos(i);
            }
		}
		return saida;
	}
    public String consultarTarefasProjeto(Projeto pro){
        String saida = "";
        for (int i=0; i<getNumProjetos(); i++){
            if(arrayProjeto[i] != null && pro.getNome().equals(arrayProjeto[i].getNome())){
                saida  = saida + pro.consultarTarefasCadastradas();
            }
        }  
        if(saida == "") {saida = "Projeto nao cadastrado";}
        
        return saida;
    }


}
