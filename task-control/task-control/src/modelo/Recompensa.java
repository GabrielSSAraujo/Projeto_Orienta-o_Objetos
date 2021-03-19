package modelo;

public class Recompensa {
    private int tempoRecompensa;
    private String[] nomeRecompensas = new String[5];

    public Recompensa(){
        setTempoRecompensa(10);
        
    }

    public void cadastarRecompensa(String rec, int i){
        setRecompensas(rec, i);
    }

    public int getTempoRecompensa(){
        return tempoRecompensa;
    }
    public void setTempoRecompensa(int tempoRecompensa){
        this.tempoRecompensa = tempoRecompensa;
    }
    public String[] getNomeRecompensa(){
        return this.nomeRecompensas;
    }
    public void setNomeRecompensas(String[] s){
        this.nomeRecompensas = s;
    }
    public String getRecompensas(int i){
        return nomeRecompensas[i];
    }
    public void setRecompensas(String recomp, int i){
        this.nomeRecompensas[i]= recomp;
    }

    public String consultarRecompensasCadastradas() {
		String saida = "***** Lista de recompensas cadastradas*****\n" ;
		for(int i = 0; i <5; i++) {
            saida = saida + "\n" +getTempoRecompensa()+" min-"+ getRecompensas(i);
		}
		return saida;
	}
    
}
