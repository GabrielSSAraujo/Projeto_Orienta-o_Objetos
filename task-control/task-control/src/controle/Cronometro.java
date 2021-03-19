package controle;

import java.util.Timer;
import java.util.TimerTask;

import modelo.Tarefas;

import java.awt.EventQueue;

public class Cronometro {
    private Timer tm=new Timer(); ;
    private int contador = 0;
    private double min;
    

    public void cronometro(int temp,Tarefas t){

        System.out.println("teste do cronometro "+temp+"s");
        EventQueue.invokeLater(new Runnable(){ 
            @Override
            public void run(){
                initCrono(temp,t);
            }             
        });
    } 

    //inicia contador(por enquanto finaliza a contagem com um inteiro enviado do app)
    public void initCrono(int temp,Tarefas t){
        getTm().scheduleAtFixedRate(new TimerTask(){
        @Override
        public void run(){
            setContador(getContador()+1);
            System.out.println(getContador());
            if(getContador()==temp){
                t.setTempReal(getContador()+t.getTempReal());
                System.out.println("this is the real time: "+t.getTempReal());
                finishCrono();
            }
        }

        }, 1000,1000);
        
    }
    //finaliza contagem e zera contaor
    public void finishCrono(){
        getTm().cancel();
        setMin(getContador());//lembrar de dividir por 60 pra ver em minutos
        setContador(0);
    }

    public double getMin(){
        return min;
    }
    public void setMin(double min){
        this.min = min + getMin();
    }

    public Timer getTm(){
        return tm;
    }
    public void setTm(Timer tm){
        this.tm = tm;
    }

    public int getContador(){
        return contador;
    }
    public void setContador(int contador)
    {
        this.contador=contador;
    }
}