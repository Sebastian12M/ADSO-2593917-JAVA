import java.util.Scanner;

public class Ejercicio307 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

         System.out.println("Ingrese el tamaño del arreglo");
         int num =entrada.nextInt();


            
           
            int arreglo1 [] =new int [num];
            int aux=0;

            for(int i=0;i<arreglo1.length;i++){
                
                int aleatorio = (int)(Math.random()*100);
                arreglo1[i]=aleatorio;
            


               

            }


                for(int j=0;j<arreglo1.length;j++){
                
                    for(int k=0;k<arreglo1.length-1;k++){
                        if(arreglo1[k]>arreglo1[k+1]){
                            aux=arreglo1[k];
                            arreglo1[k]=arreglo1[k+1];
                            arreglo1[k+1]=aux;

                        }
                    }
            
                }


                for(int h=0;h<arreglo1.length;h++){
                
                    System.out.println("Estos son los numeros impares: "+arreglo1[h]);
                
                }

        }

}