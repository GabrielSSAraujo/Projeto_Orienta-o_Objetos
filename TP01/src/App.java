import java.util.Scanner; //leitura de dados

class MetodoManipulaTemp{
    public void addTemperature(double[] data, int qteDias){ 
        double tempDia;
        Scanner ler = new Scanner(System.in);

        for(int i=1; i<=qteDias; i++){
            System.out.println("Insira a temperatura do dia "+i+":");
            tempDia = ler.nextDouble();
            data[i-1] =tempDia;
        }
    }

    public double calcMediaTemp(double[] dadoMes, int qteDias){
        double media= 0;
        for( int i = 1; i <= qteDias; i++){
            media += dadoMes[i-1];
        }
        return media/qteDias;
    }

    public double[] calcMinMaxTemp(double[] dadoMes, int qteDias, int controlMaxMin){
    
        double minMaxTemp;
        int indice = 0;

        minMaxTemp = dadoMes[0];
        
        if(controlMaxMin==1){
            //Salvando menor valor
            for( int i = 1; i < qteDias; i++){
                if(minMaxTemp > dadoMes[i]){
                    minMaxTemp= dadoMes[i];
                }
            }
        }else{
            //Salvando maior valor
            for( int i = 1; i < qteDias; i++){
                if(minMaxTemp < dadoMes[i]){
                    minMaxTemp= dadoMes[i];
                }
            }
        }

        //Encontrando quantas vezes o maior/menor valor se repete
        for(int i = 0; i < qteDias; i++){
            if(minMaxTemp==dadoMes[i]){
                indice += 1;
            }
        }
        
        double[] ans = new double[indice+2];
        int j=0;

        for(int i=0;i<qteDias;i++){
            if(minMaxTemp==dadoMes[i]){
                ans[j+2] = i+1;
                j++;
            }
        }

        ans[0] = minMaxTemp;
        ans[1] = indice;
        return ans;
    }

    public void relatorioTemp(double[] dadoMes, int qteDias, int mes, int ano){

        double[] ans;
        int controlMaxMin;

        //temperatura de cada dia
        for(int i=1; i<=qteDias;i++){
            System.out.println("Temperaruta no dia "+i+"/"+mes+"/"+ano+": "+dadoMes[i-1]);
        }
        //media da temp do mes
        System.out.println("\n\nA media de temperatura de "+mes+"/"+ano+" foi de:" +calcMediaTemp(dadoMes, qteDias)+"\n\n");
        // max e min temperatura
        ans = calcMinMaxTemp(dadoMes, qteDias, 1);
        for(int i=2; i< ans[1]+2; i++){
            System.out.println("A temperatura minima foi de: "+ans[0]+"C no dia: " + (int)ans[i]+"/"+mes+"/"+ano);
        }
        System.out.println("\n\n");
        ans = calcMinMaxTemp(dadoMes, qteDias, 2);
        for(int i=2; i< ans[1]+2; i++){
            System.out.println("A temperatura maxima foi de: "+ans[0]+"C no dia: " + (int)ans[i]+"/"+mes+"/"+ano);
        }
    }

    //recebendo resultados e mostrando para o usuario
    public void getData(double[] dadoMes, int qteDias, int menu, int mes, int ano){
        if(menu == 1){addTemperature(dadoMes, qteDias);}
        else if(menu == 2){System.out.println(calcMediaTemp(dadoMes, qteDias));}
        else if(menu == 3 || menu==4){
            double[] ans;
            if(menu==3){
                    ans = calcMinMaxTemp(dadoMes, qteDias,1);
            }else{
                    ans = calcMinMaxTemp(dadoMes, qteDias,2);
            }
            for(int i=2; i< ans[1]+2; i++){
                System.out.println("A temperatura maxima foi de: "+ans[0]+"C no dia: " + (int)ans[i]+"/"+mes+"/"+ano);
            }
        }else if(menu==5){
            relatorioTemp(dadoMes, qteDias, mes, ano);

        }else{System.out.println("Opção errada nao consta no menu, digite um numero entre 1-5!");}
    }
}


public class App {
    public static void main(String[] args) throws Exception {

        double[] jan2011 = new double[31];
        double[] fev2011 = new double[28];
        double[] mar2011 = new double[31];
        double[] abr2011 = new double[30];
        double[] mai2011 = new double[31];
        double[] jun2011 = new double[30];
        double[] jul2011 = new double[31];
        double[] ago2011 = new double[31];
        double[] set2011 = new double[30];
        double[] out2011 = new double[31];
        double[] nov2011 = new double[30];
        double[] dez2011 = new double[31];

        double[] jan2012 = new double[31];
        double[] fev2012 = new double[29];
        double[] mar2012 = new double[31];
        double[] abr2012 = new double[30];
        double[] mai2012 = new double[31];
        double[] jun2012 = new double[30];
        double[] jul2012 = new double[31];
        double[] ago2012 = new double[31];
        double[] set2012 = new double[30];
        double[] out2012 = new double[31];
        double[] nov2012 = new double[30];
        double[] dez2012 = new double[31];

        double[] jan2013 = new double[31];
        double[] fev2013 = new double[28];
        double[] mar2013 = new double[31];
        double[] abr2013 = new double[30];
        double[] mai2013 = new double[31];
        double[] jun2013 = new double[30];
        double[] jul2013 = new double[31];
        double[] ago2013 = new double[31];
        double[] set2013 = new double[30];
        double[] out2013 = new double[31];
        double[] nov2013 = new double[30];
        double[] dez2013 = new double[31];

        double[] jan2014 = new double[31];
        double[] fev2014 = new double[28];
        double[] mar2014 = new double[31];
        double[] abr2014 = new double[30];
        double[] mai2014 = new double[31];
        double[] jun2014 = new double[30];
        double[] jul2014 = new double[31];
        double[] ago2014 = new double[31];
        double[] set2014 = new double[30];
        double[] out2014 = new double[31];
        double[] nov2014 = new double[30];
        double[] dez2014 = new double[31];

        double[] jan2015 = new double[31];
        double[] fev2015 = new double[28];
        double[] mar2015 = new double[31];
        double[] abr2015 = new double[30];
        double[] mai2015 = new double[31];
        double[] jun2015 = new double[30];
        double[] jul2015 = new double[31];
        double[] ago2015 = new double[31];
        double[] set2015 = new double[30];
        double[] out2015 = new double[31];
        double[] nov2015 = new double[30];
        double[] dez2015 = new double[31];

        double[] jan2016 = new double[31];
        double[] fev2016 = new double[29];
        double[] mar2016 = new double[31];
        double[] abr2016 = new double[30];
        double[] mai2016 = new double[31];
        double[] jun2016 = new double[30];
        double[] jul2016 = new double[31];
        double[] ago2016 = new double[31];
        double[] set2016 = new double[30];
        double[] out2016 = new double[31];
        double[] nov2016 = new double[30];
        double[] dez2016 = new double[31];

        double[] jan2017 = new double[31];
        double[] fev2017 = new double[28];
        double[] mar2017 = new double[31];
        double[] abr2017 = new double[30];
        double[] mai2017 = new double[31];
        double[] jun2017 = new double[30];
        double[] jul2017 = new double[31];
        double[] ago2017 = new double[31];
        double[] set2017 = new double[30];
        double[] out2017 = new double[31];
        double[] nov2017 = new double[30];
        double[] dez2017 = new double[31];

        double[] jan2018 = new double[31];
        double[] fev2018 = new double[26];
        double[] mar2018 = new double[31];
        double[] abr2018 = new double[30];
        double[] mai2018 = new double[31];
        double[] jun2018 = new double[30];
        double[] jul2018 = new double[31];
        double[] ago2018 = new double[31];
        double[] set2018 = new double[30];
        double[] out2018 = new double[31];
        double[] nov2018 = new double[30];
        double[] dez2018 = new double[31];

        double[] jan2019 = new double[31];
        double[] fev2019 = new double[28];
        double[] mar2019 = new double[31];
        double[] abr2019 = new double[30];
        double[] mai2019 = new double[31];
        double[] jun2019 = new double[30];
        double[] jul2019 = new double[31];
        double[] ago2019 = new double[31];
        double[] set2019 = new double[30];
        double[] out2019 = new double[31];
        double[] nov2019 = new double[30];
        double[] dez2019 = new double[31];

        double[] jan2020 = {22,23,22,21,18,25,26,20,26,30,22,22,18,22,21,20,25,26,20,26,30,22,23,22,21,18,25,26,20,26,30};
        double[] fev2020 = new double[29];
        double[] mar2020 = new double[31];
        double[] abr2020 = new double[30];
        double[] mai2020 = new double[31];
        double[] jun2020 = new double[30];
        double[] jul2020 = new double[31];
        double[] ago2020 = new double[31];
        double[] set2020 = new double[30];
        double[] out2020 = new double[31];
        double[] nov2020 = new double[30];
        double[] dez2020 = new double[31];
     
        int mes;
        int ano;
        int menu = 10;

        Scanner ler = new Scanner(System.in);

        while(menu != 0){
            System.out.println("Digite: \n 0 - Sair \n 1 - Inserir temperatura \n 2 - Calcular média \n 3 - Calcular temperatura minima \n 4 - Calcular temperatura maxima \n 5 - Obter Relatório");
            menu = ler.nextInt();

            System.out.print("Digite o mes:\n");
            mes = ler.nextInt();

            System.out.print("Digite o ano:\n");
            ano = ler.nextInt();

            MetodoManipulaTemp temp = new MetodoManipulaTemp(); 
            

                if(mes >= 1 && mes <= 12 && ano < 2021 && ano > 2010){

                    if(ano == 2020){
                        
                        switch(mes){
                            case 1:
                                temp.getData(jan2020,31,menu,mes,ano);
                                break;
                            case 2:
                                temp.getData(fev2020,29,menu,mes,ano);
                                break;
                            case 3:
                                temp.getData(mar2020,31,menu,mes,ano);
                                break;
                            case 4:
                                temp.getData(abr2020,30,menu,mes,ano);
                                break;
                            case 5:
                                temp.getData(mai2020,31,menu,mes,ano);
                                break;
                            case 6:
                                temp.getData(jun2020,30,menu,mes,ano);
                                break;
                            case 7:
                                temp.getData(jul2020,31,menu,mes,ano);
                                break;
                            case 8:
                                temp.getData(ago2020,31,menu,mes,ano);
                                break;
                            case 9:
                                temp.getData(set2020,30,menu,mes,ano);
                                break;
                            case 10:
                                temp.getData(out2020,31,menu,mes,ano);
                                break;
                            case 11:
                                temp.getData(nov2020,30,menu,mes,ano);
                                break;
                            case 12:
                                temp.getData(dez2020,31,menu,mes,ano);
                                break;
                        }
                    }
                    
                    if(ano == 2019){
                        
                        switch(mes){
                            case 1:
                                temp.getData(jan2019,31,menu,mes,ano);
                                break;
                            case 2:
                                temp.getData(fev2019,28,menu,mes,ano);
                                break;
                            case 3:
                                temp.getData(mar2019,31,menu,mes,ano);
                                break;
                            case 4:
                                temp.getData(abr2019,30,menu,mes,ano);
                                break;
                            case 5:
                                temp.getData(mai2019,31,menu,mes,ano);
                                break;
                            case 6:
                                temp.getData(jun2019,30,menu,mes,ano);
                                break;
                            case 7:
                                temp.getData(jul2019,31,menu,mes,ano);
                                break;
                            case 8:
                                temp.getData(ago2019,31,menu,mes,ano);
                                break;
                            case 9:
                                temp.getData(set2019,30,menu,mes,ano);
                                break;
                            case 10:
                                temp.getData(out2019,31,menu,mes,ano);
                                break;
                            case 11:
                                temp.getData(nov2019,30,menu,mes,ano);
                                break;
                            case 12:
                                temp.getData(dez2019,31,menu,mes,ano);
                                break;
                        }
                    }

                    if(ano == 2018){
                        
                        switch(mes){
                            case 1:
                                temp.getData(jan2018,31,menu,mes,ano);
                                break;
                            case 2:
                                temp.getData(fev2018,28,menu,mes,ano);
                                break;
                            case 3:
                                temp.getData(mar2018,31,menu,mes,ano);
                                break;
                            case 4:
                                temp.getData(abr2018,30,menu,mes,ano);
                                break;
                            case 5:
                                temp.getData(mai2018,31,menu,mes,ano);
                                break;
                            case 6:
                                temp.getData(jun2018,30,menu,mes,ano);
                                break;
                            case 7:
                                temp.getData(jul2018,31,menu,mes,ano);
                                break;
                            case 8:
                                temp.getData(ago2018,31,menu,mes,ano);
                                break;
                            case 9:
                                temp.getData(set2018,30,menu,mes,ano);
                                break;
                            case 10:
                                temp.getData(out2018,31,menu,mes,ano);
                                break;
                            case 11:
                                temp.getData(nov2018,30,menu,mes,ano);
                                break;
                            case 12:
                                temp.getData(dez2018,31,menu,mes,ano);
                                break;
                        }
                    }

                    if(ano == 2017){
                        
                        switch(mes){
                            case 1:
                                temp.getData(jan2017,31,menu,mes,ano);
                                break;
                            case 2:
                                temp.getData(fev2017,28,menu,mes,ano);
                                break;
                            case 3:
                                temp.getData(mar2017,31,menu,mes,ano);
                                break;
                            case 4:
                                temp.getData(abr2017,30,menu,mes,ano);
                                break;
                            case 5:
                                temp.getData(mai2017,31,menu,mes,ano);
                                break;
                            case 6:
                                temp.getData(jun2017,30,menu,mes,ano);
                                break;
                            case 7:
                                temp.getData(jul2017,31,menu,mes,ano);
                                break;
                            case 8:
                                temp.getData(ago2017,31,menu,mes,ano);
                                break;
                            case 9:
                                temp.getData(set2017,30,menu,mes,ano);
                                break;
                            case 10:
                                temp.getData(out2017,31,menu,mes,ano);
                                break;
                            case 11:
                                temp.getData(nov2017,30,menu,mes,ano);
                                break;
                            case 12:
                                temp.getData(dez2017,31,menu,mes,ano);
                                break;
                        }
                    }

                    if(ano == 2016){
                        
                        switch(mes){
                            case 1:
                                temp.getData(jan2016,31,menu,mes,ano);
                                break;
                            case 2:
                                temp.getData(fev2016,29,menu,mes,ano);
                                break;
                            case 3:
                                temp.getData(mar2016,31,menu,mes,ano);
                                break;
                            case 4:
                                temp.getData(abr2016,30,menu,mes,ano);
                                break;
                            case 5:
                                temp.getData(mai2016,31,menu,mes,ano);
                                break;
                            case 6:
                                temp.getData(jun2016,30,menu,mes,ano);
                                break;
                            case 7:
                                temp.getData(jul2016,31,menu,mes,ano);
                                break;
                            case 8:
                                temp.getData(ago2016,31,menu,mes,ano);
                                break;
                            case 9:
                                temp.getData(set2016,30,menu,mes,ano);
                                break;
                            case 10:
                                temp.getData(out2016,31,menu,mes,ano);
                                break;
                            case 11:
                                temp.getData(nov2016,30,menu,mes,ano);
                                break;
                            case 12:
                                temp.getData(dez2016,31,menu,mes,ano);
                                break;
                        }
                    }

                    if(ano == 2015){
                        
                        switch(mes){
                            case 1:
                                temp.getData(jan2015,31,menu,mes,ano);
                                break;
                            case 2:
                                temp.getData(fev2015,28,menu,mes,ano);
                                break;
                            case 3:
                                temp.getData(mar2015,31,menu,mes,ano);
                                break;
                            case 4:
                                temp.getData(abr2015,30,menu,mes,ano);
                                break;
                            case 5:
                                temp.getData(mai2015,31,menu,mes,ano);
                                break;
                            case 6:
                                temp.getData(jun2015,30,menu,mes,ano);
                                break;
                            case 7:
                                temp.getData(jul2015,31,menu,mes,ano);
                                break;
                            case 8:
                                temp.getData(ago2015,31,menu,mes,ano);
                                break;
                            case 9:
                                temp.getData(set2015,30,menu,mes,ano);
                                break;
                            case 10:
                                temp.getData(out2015,31,menu,mes,ano);
                                break;
                            case 11:
                                temp.getData(nov2015,30,menu,mes,ano);
                                break;
                            case 12:
                                temp.getData(dez2015,31,menu,mes,ano);
                                break;
                        }
                    }

                    if(ano == 2014){
                        
                        switch(mes){
                            case 1:
                                temp.getData(jan2014,31,menu,mes,ano);
                                break;
                            case 2:
                                temp.getData(fev2014,28,menu,mes,ano);
                                break;
                            case 3:
                                temp.getData(mar2014,31,menu,mes,ano);
                                break;
                            case 4:
                                temp.getData(abr2014,30,menu,mes,ano);
                                break;
                            case 5:
                                temp.getData(mai2014,31,menu,mes,ano);
                                break;
                            case 6:
                                temp.getData(jun2014,30,menu,mes,ano);
                                break;
                            case 7:
                                temp.getData(jul2014,31,menu,mes,ano);
                                break;
                            case 8:
                                temp.getData(ago2014,31,menu,mes,ano);
                                break;
                            case 9:
                                temp.getData(set2014,30,menu,mes,ano);
                                break;
                            case 10:
                                temp.getData(out2014,31,menu,mes,ano);
                                break;
                            case 11:
                                temp.getData(nov2014,30,menu,mes,ano);
                                break;
                            case 12:
                                temp.getData(dez2014,31,menu,mes,ano);
                                break;
                        }
                    }

                    if(ano == 2013){
                        
                        switch(mes){
                            case 1:
                                temp.getData(jan2013,31,menu,mes,ano);
                                break;
                            case 2:
                                temp.getData(fev2013,28,menu,mes,ano);
                                break;
                            case 3:
                                temp.getData(mar2013,31,menu,mes,ano);
                                break;
                            case 4:
                                temp.getData(abr2013,30,menu,mes,ano);
                                break;
                            case 5:
                                temp.getData(mai2013,31,menu,mes,ano);
                                break;
                            case 6:
                                temp.getData(jun2013,30,menu,mes,ano);
                                break;
                            case 7:
                                temp.getData(jul2013,31,menu,mes,ano);
                                break;
                            case 8:
                                temp.getData(ago2013,31,menu,mes,ano);
                                break;
                            case 9:
                                temp.getData(set2013,30,menu,mes,ano);
                                break;
                            case 10:
                                temp.getData(out2013,31,menu,mes,ano);
                                break;
                            case 11:
                                temp.getData(nov2013,30,menu,mes,ano);
                                break;
                            case 12:
                                temp.getData(dez2013,31,menu,mes,ano);
                                break;
                        }
                    }

                    if(ano == 2012){
                        
                        switch(mes){
                            case 1:
                                temp.getData(jan2012,31,menu,mes,ano);
                                break;
                            case 2:
                                temp.getData(fev2012,29,menu,mes,ano);
                                break;
                            case 3:
                                temp.getData(mar2012,31,menu,mes,ano);
                                break;
                            case 4:
                                temp.getData(abr2012,30,menu,mes,ano);
                                break;
                            case 5:
                                temp.getData(mai2012,31,menu,mes,ano);
                                break;
                            case 6:
                                temp.getData(jun2012,30,menu,mes,ano);
                                break;
                            case 7:
                                temp.getData(jul2012,31,menu,mes,ano);
                                break;
                            case 8:
                                temp.getData(ago2012,31,menu,mes,ano);
                                break;
                            case 9:
                                temp.getData(set2012,30,menu,mes,ano);
                                break;
                            case 10:
                                temp.getData(out2012,31,menu,mes,ano);
                                break;
                            case 11:
                                temp.getData(nov2012,30,menu,mes,ano);
                                break;
                            case 12:
                                temp.getData(dez2012,31,menu,mes,ano);
                                break;
                        }
                    }

                    if(ano == 2011){   

                        switch(mes){
                            case 1:
                                temp.getData(jan2011,31,menu,mes,ano);
                                break;
                            case 2:
                                temp.getData(fev2011,28,menu,mes,ano);
                                break;
                            case 3:
                                temp.getData(mar2011,31,menu,mes,ano);
                                break;
                            case 4:
                                temp.getData(abr2011,30,menu,mes,ano);
                                break;
                            case 5:
                                temp.getData(mai2011,31,menu,mes,ano);
                                break;
                            case 6:
                                temp.getData(jun2011,30,menu,mes,ano);
                                break;
                            case 7:
                                temp.getData(jul2011,31,menu,mes,ano);
                                break;
                            case 8:
                                temp.getData(ago2011,31,menu,mes,ano);
                                break;
                            case 9:
                                temp.getData(set2011,30,menu,mes,ano);
                                break;
                            case 10:
                                temp.getData(out2011,31,menu,mes,ano);
                                break;
                            case 11:
                                temp.getData(nov2011,30,menu,mes,ano);
                                break;
                            case 12:
                                temp.getData(dez2011,31,menu,mes,ano);
                                break;
                        }
                    }

                }else {
                    // Mes invalido
                    System.out.println("Data Inválida! verifique mes e ano digitados.");
                }
        }
    }
}
