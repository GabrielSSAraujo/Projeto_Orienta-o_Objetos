package modelo;

public class Pomodoro {
    private int tempoTrabalho;
    private int tempoDescanso;

    public Pomodoro(){

    }

    public int getTempoTrabalho(){
        return tempoTrabalho;
    }
    public void setTempoTrabalho(int tempoTrabalho){
        this.tempoTrabalho = tempoTrabalho;
    }

    public int getTempoDescanso(){
        return tempoDescanso;
    }
    public void setTempoDescanso(int tempoDescanso){
        this.tempoDescanso = tempoDescanso;
    }
}
