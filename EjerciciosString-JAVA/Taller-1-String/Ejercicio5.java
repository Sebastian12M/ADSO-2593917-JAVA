import java.util.Scanner;

public class Ejercicio5 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

            System.out.println("Ingrese su nombre");
            String oracion = entrada .nextLine();  

                
               
                    int opcion=0;

                    System.out.println("1.Iniciar 2.Salir");
                    opcion = entrada.nextInt(); 
                    String secreta ="arroz";
                    String [] arreglo1 = new String[secreta.length()];
                    
                    
               
                
                    for(int i=0;i<secreta.length();i++){
                        arreglo1[i]=" _ " ;
                        
                       
                       System.out.print(arreglo1[i]);
                    if(opcion==1){
                        

                        
                    }

                        for(int j=0;j<secreta.length();j++){
                                 
                         
                        
                                System.out.print(arreglo1[j]);

                                System.out.print("Ingrese una letra");
                                char letra = entrada.nextLine().charAt(0);
                                String aestring=String.valueOf(letra);;

                                if(letra.equalsIgnoreCase(secreta.charAt(j))){
                                        arreglo1[j]=aestring;
                 
                                        System.out.print(arreglo1[j]);

                                }
                        }
   

                    
                            

                }
               



               
                
                
               
                    
                
        }

}
