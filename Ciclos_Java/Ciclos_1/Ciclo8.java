import java.util.Scanner;

public class Ciclo8 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();

        int num1= (numero)%10;
        
        int i = 1;
        while(i<=6){
            num1= (numero/10)%10;
            int result=num1;
            System.out.println("este es el numero"+i+":"+result);
            i++;
        }
       
    }
}