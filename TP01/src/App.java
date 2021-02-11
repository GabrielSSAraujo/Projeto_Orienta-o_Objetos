import java.util.Scanner; //leitura de dados

class MetodoAddTemp{
    public void AddTemperature(double[] data, int qteDias){ 
        int dia;
        Scanner ler = new Scanner(System.in);

        for(int i=1; i<=qteDias; i++){
            System.out.println("Insira a temperatura do dia "+i+":");
            dia = ler.nextInt();
            data[i-1] = dia;
        }
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

        double[] jan2020 = new double[31];
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
        int exit = 1;

        Scanner ler = new Scanner(System.in);
        while(exit != 0){
            System.out.print("Digite o mes:\n");
            mes = ler.nextInt();

            System.out.print("Digite o ano:\n");
            ano = ler.nextInt();

            MetodoAddTemp temp = new MetodoAddTemp();

            if(mes >= 1 && mes <= 12 && ano < 2021 && ano > 2010){

                if(ano == 2020){
                    
                    switch(mes){
                        case 1:
                            temp.AddTemperature(jan2020, 31);
                            break;
                        case 2:
                            temp.AddTemperature(fev2020, 29);   
                            break;
                        case 3:
                            temp.AddTemperature(mar2020, 31);   
                            break;
                        case 4:
                            temp.AddTemperature(abr2020, 30);   
                            break;
                        case 5:
                            temp.AddTemperature(mai2020, 31);
                            break;
                        case 6:
                            temp.AddTemperature(jun2020, 30);
                            break;
                        case 7:
                            temp.AddTemperature(jul2020, 31);
                            break;
                        case 8:
                            temp.AddTemperature(ago2020, 31);
                            break;
                        case 9:
                            temp.AddTemperature(set2020, 30);
                            break;
                        case 10:
                            temp.AddTemperature(out2020, 31);
                            break;
                        case 11:
                            temp.AddTemperature(nov2020, 30);
                            break;
                        case 12:
                            temp.AddTemperature(dez2020, 31);
                            break;
                    }
                }
                
                if(ano == 2019){
                    
                    switch(mes){
                        case 1:
                            temp.AddTemperature(jan2019, 31);
                            break;
                        case 2:
                            temp.AddTemperature(fev2019, 28);   
                            break;
                        case 3:
                            temp.AddTemperature(mar2019, 31);   
                            break;
                        case 4:
                            temp.AddTemperature(abr2019, 30);   
                            break;
                        case 5:
                            temp.AddTemperature(mai2019, 31);
                            break;
                        case 6:
                            temp.AddTemperature(jun2019, 30);
                            break;
                        case 7:
                            temp.AddTemperature(jul2019, 31);
                            break;
                        case 8:
                            temp.AddTemperature(ago2019, 31);
                            break;
                        case 9:
                            temp.AddTemperature(set2019, 30);
                            break;
                        case 10:
                            temp.AddTemperature(out2019, 31);
                            break;
                        case 11:
                            temp.AddTemperature(nov2019, 30);
                            break;
                        case 12:
                            temp.AddTemperature(dez2019, 31);
                            break;
                    }
                }

                if(ano == 2018){
                    
                    switch(mes){
                        case 1:
                            temp.AddTemperature(jan2018, 31);
                            break;
                        case 2:
                            temp.AddTemperature(fev2018, 28);   
                            break;
                        case 3:
                            temp.AddTemperature(mar2018, 31);   
                            break;
                        case 4:
                            temp.AddTemperature(abr2018, 30);   
                            break;
                        case 5:
                            temp.AddTemperature(mai2018, 31);
                            break;
                        case 6:
                            temp.AddTemperature(jun2018, 30);
                            break;
                        case 7:
                            temp.AddTemperature(jul2018, 31);
                            break;
                        case 8:
                            temp.AddTemperature(ago2018, 31);
                            break;
                        case 9:
                            temp.AddTemperature(set2018, 30);
                            break;
                        case 10:
                            temp.AddTemperature(out2018, 31);
                            break;
                        case 11:
                            temp.AddTemperature(nov2018, 30);
                            break;
                        case 12:
                            temp.AddTemperature(dez2018, 31);
                            break;
                    }
                }

                if(ano == 2017){
                    
                    switch(mes){
                        case 1:
                            temp.AddTemperature(jan2017, 31);
                            break;
                        case 2:
                            temp.AddTemperature(fev2017, 28);   
                            break;
                        case 3:
                            temp.AddTemperature(mar2017, 31);   
                            break;
                        case 4:
                            temp.AddTemperature(abr2017, 30);   
                            break;
                        case 5:
                            temp.AddTemperature(mai2017, 31);
                            break;
                        case 6:
                            temp.AddTemperature(jun2017, 30);
                            break;
                        case 7:
                            temp.AddTemperature(jul2017, 31);
                            break;
                        case 8:
                            temp.AddTemperature(ago2017, 31);
                            break;
                        case 9:
                            temp.AddTemperature(set2017, 30);
                            break;
                        case 10:
                            temp.AddTemperature(out2017, 31);
                            break;
                        case 11:
                            temp.AddTemperature(nov2017, 30);
                            break;
                        case 12:
                            temp.AddTemperature(dez2017, 31);
                            break;
                    }
                }

                if(ano == 2016){
                    
                    switch(mes){
                        case 1:
                            temp.AddTemperature(jan2016, 31);
                            break;
                        case 2:
                            temp.AddTemperature(fev2016, 29);   
                            break;
                        case 3:
                            temp.AddTemperature(mar2016, 31);   
                            break;
                        case 4:
                            temp.AddTemperature(abr2016, 30);   
                            break;
                        case 5:
                            temp.AddTemperature(mai2016, 31);
                            break;
                        case 6:
                            temp.AddTemperature(jun2016, 30);
                            break;
                        case 7:
                            temp.AddTemperature(jul2016, 31);
                            break;
                        case 8:
                            temp.AddTemperature(ago2016, 31);
                            break;
                        case 9:
                            temp.AddTemperature(set2016, 30);
                            break;
                        case 10:
                            temp.AddTemperature(out2016, 31);
                            break;
                        case 11:
                            temp.AddTemperature(nov2016, 30);
                            break;
                        case 12:
                            temp.AddTemperature(dez2016, 31);
                            break;
                    }
                }

                if(ano == 2015){
                    
                    switch(mes){
                        case 1:
                            temp.AddTemperature(jan2015, 31);
                            break;
                        case 2:
                            temp.AddTemperature(fev2015, 28);   
                            break;
                        case 3:
                            temp.AddTemperature(mar2015, 31);   
                            break;
                        case 4:
                            temp.AddTemperature(abr2015, 30);   
                            break;
                        case 5:
                            temp.AddTemperature(mai2015, 31);
                            break;
                        case 6:
                            temp.AddTemperature(jun2015, 30);
                            break;
                        case 7:
                            temp.AddTemperature(jul2015, 31);
                            break;
                        case 8:
                            temp.AddTemperature(ago2015, 31);
                            break;
                        case 9:
                            temp.AddTemperature(set2015, 30);
                            break;
                        case 10:
                            temp.AddTemperature(out2015, 31);
                            break;
                        case 11:
                            temp.AddTemperature(nov2015, 30);
                            break;
                        case 12:
                            temp.AddTemperature(dez2015, 31);
                            break;
                    }
                }

                if(ano == 2014){
                    
                    switch(mes){
                        case 1:
                            temp.AddTemperature(jan2014, 31);
                            break;
                        case 2:
                            temp.AddTemperature(fev2014, 28);   
                            break;
                        case 3:
                            temp.AddTemperature(mar2014, 31);   
                            break;
                        case 4:
                            temp.AddTemperature(abr2014, 30);   
                            break;
                        case 5:
                            temp.AddTemperature(mai2014, 31);
                            break;
                        case 6:
                            temp.AddTemperature(jun2014, 30);
                            break;
                        case 7:
                            temp.AddTemperature(jul2014, 31);
                            break;
                        case 8:
                            temp.AddTemperature(ago2014, 31);
                            break;
                        case 9:
                            temp.AddTemperature(set2014, 30);
                            break;
                        case 10:
                            temp.AddTemperature(out2014, 31);
                            break;
                        case 11:
                            temp.AddTemperature(nov2014, 30);
                            break;
                        case 12:
                            temp.AddTemperature(dez2014, 31);
                            break;
                    }
                }

                if(ano == 2013){
                    
                    switch(mes){
                        case 1:
                            temp.AddTemperature(jan2013, 31);
                            break;
                        case 2:
                            temp.AddTemperature(fev2013, 28);   
                            break;
                        case 3:
                            temp.AddTemperature(mar2013, 31);   
                            break;
                        case 4:
                            temp.AddTemperature(abr2013, 30);   
                            break;
                        case 5:
                            temp.AddTemperature(mai2013, 31);
                            break;
                        case 6:
                            temp.AddTemperature(jun2013, 30);
                            break;
                        case 7:
                            temp.AddTemperature(jul2013, 31);
                            break;
                        case 8:
                            temp.AddTemperature(ago2013, 31);
                            break;
                        case 9:
                            temp.AddTemperature(set2013, 30);
                            break;
                        case 10:
                            temp.AddTemperature(out2013, 31);
                            break;
                        case 11:
                            temp.AddTemperature(nov2013, 30);
                            break;
                        case 12:
                            temp.AddTemperature(dez2019, 31);
                            break;
                    }
                }

                if(ano == 2012){
                    
                    switch(mes){
                        case 1:
                            temp.AddTemperature(jan2012, 31);
                            break;
                        case 2:
                            temp.AddTemperature(fev2012, 29);   
                            break;
                        case 3:
                            temp.AddTemperature(mar2012, 31);   
                            break;
                        case 4:
                            temp.AddTemperature(abr2012, 30);   
                            break;
                        case 5:
                            temp.AddTemperature(mai2012, 31);
                            break;
                        case 6:
                            temp.AddTemperature(jun2012, 30);
                            break;
                        case 7:
                            temp.AddTemperature(jul2012, 31);
                            break;
                        case 8:
                            temp.AddTemperature(ago2012, 31);
                            break;
                        case 9:
                            temp.AddTemperature(set2012, 30);
                            break;
                        case 10:
                            temp.AddTemperature(out2012, 31);
                            break;
                        case 11:
                            temp.AddTemperature(nov2012, 30);
                            break;
                        case 12:
                            temp.AddTemperature(dez2012, 31);
                            break;
                    }
                }

                if(ano == 2011){   

                    switch(mes){
                        case 1:
                            temp.AddTemperature(jan2011, 31);
                            break;
                        case 2:
                            temp.AddTemperature(fev2011, 28);   
                            break;
                        case 3:
                            temp.AddTemperature(mar2011, 31);   
                            break;
                        case 4:
                            temp.AddTemperature(abr2011, 30);   
                            break;
                        case 5:
                            temp.AddTemperature(mai2011, 31);
                            break;
                        case 6:
                            temp.AddTemperature(jun2011, 30);
                            break;
                        case 7:
                            temp.AddTemperature(jul2011, 31);
                            break;
                        case 8:
                            temp.AddTemperature(ago2011, 31);
                            break;
                        case 9:
                            temp.AddTemperature(set2011, 30);
                            break;
                        case 10:
                            temp.AddTemperature(out2011, 31);
                            break;
                        case 11:
                            temp.AddTemperature(nov2011, 30);
                            break;
                        case 12:
                            temp.AddTemperature(dez2011, 31);
                            break;
                    }
                }

            }else {
                // Mes invalido
                System.out.println("Data Inválida! verifique se digitou um ano ente 2011 e 2020.");
            }

            System.out.println("Digite 0 para sair ou 1 para continuar inserindo dado de temperatura!");
            exit = ler.nextInt();
        }
    }
}
