import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner entrada = new Scanner (System.in);
	  System.out.println("Escriba las coordenas del punto A");
	  System.out.print("Valor X:");
	  int xa =entrada.nextInt();
	  System.out.print("Valor Y:");
	  int ya=entrada.nextInt();
	  System.out.println("Escriba las coordenas del punto B");
	  System.out.print("Valor X:");
	  int xb =entrada.nextInt();
	  System.out.print("Valor Y:");
	  int yb=entrada.nextInt();
	  
	  int y=yb-ya;
	  int x=xb-xa;
	  int res=y/x;
	  
	  if(res>0){
	      System.out.println("El valor de la pendiente es "+res);
	      System.out.print("La pendiente es positiva");
	  }else if(res<0){
	      System.out.println("El valor de la pendiente es "+res);
	      System.out.print("La pendiente es negativa");
	  }
	}
}
