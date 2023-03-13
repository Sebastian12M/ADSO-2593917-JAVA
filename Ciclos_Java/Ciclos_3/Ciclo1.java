import java.util.Scanner;

public class Main {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        Scanner texto = new Scanner (System.in);
        
        
        double apia_apia=5.0;
        double apia_balboa=39.8;
        double apia_belen=39.5;
        double apia_dosquebradas=68.39;
        double apia_guatica=58.7;
        double apia_celia=24.1;
        double apia_virginia=34.39;
        double apia_marsella=88.1;
        double apia_mistrato=55.6;
        double apia_pereira=65.7;
        double apia_pueblorico=26.4;
        double apia_quinchia=77.4;
        double apia_santarosa=77.8;
        double apia_santuario=15.3;
        
        double balboa_apia=39.8;
        double balboa_balboa=5.0;
        double balboa_belen=56.9;
        double balboa_dosquebradas=52.9;
        double balboa_guatica=76.1;
        double balboa_celia=13.7;
        double balboa_virginia=18.9;
        double balboa_marsella=72.1;
        double balboa_mistrato=73.0;
        double balboa_pereira=49.7;
        double balboa_pueblorico=64.8;
        double balboa_quinchia=94.8;
        double balboa_santarorsa=61.9;
        double balboa_santuario=38.3;
        
        double belen_apia=39.5;
        double belen_balboa=56.9;
        double belen_belen=5.0;
        double belen_dosquebradas=74.6;
        double belen_guatica=25.1;
        double belen_celia=71.9;
        double belen_virginia=40.8;
        double belen_marsella=93.8;
        double belen_mistrado=16.3;
        double belen_pereira=71.4;
        double belen_pueblorico=65.4;
        double belen_quinchia=52.4;
        double belen_santarosa=83.6;
        double belen_santuario=71.4;
        
        double dosquebradas_apia=67.5;
        double dosquebradas_balboa=51.5;
        double dosquebradas_belen=73.1;
        double dosquebradas_dosquebradas=5.0;
        double dosquebradas_guatica=92.3;
        double dosquebradas_celia=66.6;
        double dosquebradas_virginia=32.5;
        double dosquebradas_marsella=34.4;
        double dosquebradas_mistrado=89.3;
        double dosquebradas_pereira=2.4;
        double dosquebradas_pueblorico=92.5;
        double dosquebradas_quinchia=93.9;
        double dosquebradas_santarosa=12.4;
        double dosquebradas_santuario=66.0;
        
        double guatica_apia=58.7;
        double guatica_balboa=76.1;
        double guatica_belen=25.1;
        double guatica_dosquebradas=93.8;
        double guatica_guatica=5.0;
        double guatica_celia=91.1;
        double guatica_virginia=60.0;
        double guatica_marsella=98.5;
        double guatica_mistrado=25.1;
        double guatica_pereira=90.6;
        double guatica_pueblorico=84.8;
        double guatica_quinchia=22.9;
        double guatica_santarosa=85.5;
        double guatica_santuario=73.4;
        
        double celia_apia=24.1;
        double celia_balboa=13.7;
        double celia_belen=71.9;
        double celia_dosquebradas=67.9;
        double celia_guatica=91.1;
        double celia_celia=5.0;
        double celia_virginia=33.9;
        double celia_marsella=87.2;
        double celia_mistrado=88.1;
        double celia_pereira=64.7;
        double celia_pueblorico=49.1;
        double celia_quinchia=110.0;
        double celia_santarosa=76.9;
        double celia_santuario=22.6;
        
        double virginia_apia=35.0;
        double virginia_balboa=19.0;
        double virginia_belen=40.8;
        double virginia_dosquebradas=34.0;
        double virginia_guatica=60.0;
        double virginia_celia=34.0;
        double virginia_virginia=5.0;
        double virginia_marsella=53.3;
        double virginia_mistrado=56.9;
        double virginia_pereira=30.8;
        double virginia_pueblorico=60.0;
        double virginia_quinchia=78.7;
        double virginia_santarosa=43.0;
        double virginia_santuario=33.7;
        
        double marsella_apia=88.0;
        double marsella_balboa=72.0;
        double marsella_belen=93.6;
        double marsella_dosquebradas=35.8;
        double marsella_guatica=98.4;
        double marsella_celia=87.0;
        double marsella_virginia=53.0;
        double marsella_marsella=5.0;
        double marsella_mistrado=110.0;
        double marsella_pereira=32.9;
        double marsella_pueblorico=113.0;
        double marsella_quinchia=96.6;
        double marsella_santarosa=44.7;
        double marsella_santuario=86.5;
        
        
        double pereira_apia=65.7;
        double pereira_balboa=49.8;
        double pereira_belen=71.3;
        double pereira_dosquebradas=2.4;
        double pereira_guatica=90.5;
        double pereira_celia=64.8;
        double pereira_virginia=30.7;
        double pereira_marsella=33.0;
        double pereira_mistrado=87.5;
        double pereira_pereira=5.0;
        double pereira_pueblorico=90.7;
        double pereira_quinchia=95.8;
        double pereira_santarosa=14.3;
        double pereira_santuario=64.2;
        
        double pueblorico_apia=26.2;
        double pueblorico_balboa=64.6;
        double pueblorico_belen=65.5;
        double pueblorico_dosquebradas=93.7;
        double pueblorico_guatica=84.5;
        double pueblorico_celia=48.9;
        double pueblorico_virginia=59.7;
        double pueblorico_marsella=113.0;
        double pueblorico_mistrado=81.5;
        double pueblorico_pereira=90.5;
        double pueblorico_pueblorico=5.0;
        double pueblorico_quinchia=103.0;
        double pueblorico_santarosa=103.0;
        double pueblorico_santuario=34.3;
        
        double quinchia_apia=77.4;
        double quinchia_balboa=94.7;
        double quinchia_belen=52.4;
        double quinchia_dosquebradas=91.9;
        double quinchia_guatica=22.8;
        double quinchia_celia=110.0;
        double quinchia_virginia=78.7;
        double quinchia_marsella=96.2;
        double quinchia_mistrado=57.9;
        double quinchia_pereira=93.8;
        double quinchia_pueblorico=103.0;
        double quinchia_quinchia=5.0;
        double quinchia_santarosa=83.2;
        double quinchia_santuario=109.0;
        
        double santarosa_apia=76.7;
        double santarosa_balboa=60.8;
        double santarosa_belen=82.6;
        double santarosa_dosquebradas=10.3;
        double santarosa_guatica=85.4;
        double santarosa_celia=75.8;
        double santarosa_virginia=41.7;
        double santarosa_marsella=43.6;
        double santarosa_mistrado=98.5;
        double santarosa_pereira=12.3;
        double santarosa_pueblorico=102.0;
        double santarosa_quinchia=83.5;
        double santarosa_santarosa=5.0;
        double santarosa_santuario=75.2;
        
        double santuario_apia=15.3;
        double santuario_balboa=38.3;
        double santuario_belen=71.4;
        double santuario_dosquebradas=67.4;
        double santuario_guatica=73.5;
        double santuario_celia=22.6;
        double santuario_virginia=33.4;
        double santuario_marsella=86.6;
        double santuario_mistrado=70.5;
        double santuario_pereira=64.2;
        double santuario_pueblorico=34.5;
        double santuario_quinchia=109.0;
        double santuario_santarosa=76.4;
        double santuario_santuario=5.0;
        
        System.out.println("1.apia 2.balboa 3.belen 4.dosquebradas 5.guatica");
            System.out.println("6.celia 7.virginia 8.marsella 9.mistrato 10.pereira");
            System.out.println("11.pueblo rico 12.quinchia 13.santa rosa 14.santuario");
            
        String ciudad_inicio;
        System.out.println("En que ciudad iniciara el recorrido");
        ciudad_inicio=texto.nextLine();
        
        System.out.println("1.apia 2.balboa 3.belen 4.dosquebradas 5.guatica");
            System.out.println("6.celia 7.virginia 8.marsella 9.mistrato 10.pereira");
            System.out.println("11.pueblo rico 12.quinchia 13.santa rosa 14.santuario");
            
    
         
        System.out.println("Por favor indique la cantidad de paradas");
        int paradas=entrada.nextInt();

         
        System.out.println("Cuantos kilometros recorre por galon");
        int reco_galon=entrada.nextInt();
        
        for (int i=1;i<paradas;i++){
            
            
            
            System.out.println("1.apia 2.balboa 3.belen 4.dosquebradas 5.guatica");
            System.out.println("6.celia 7.virginia 8.marsella 9.mistrato 10.pereira");
            System.out.println("11.pueblo rico 12.quinchia 13.santa rosa 14.santuario");
            
            System.out.println("Por favor indique la parada"+i);
            int ciudad_siguiente=entrada nextInt();
             
            if(ciudad_inicio==1 && ciudad_siguiente==1 ){
                
            }
            
        }
      }
}