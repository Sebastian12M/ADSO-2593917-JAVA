import java.util.Scanner;


public class Ahorcado{
   
    public  int oportunidades;
    public String palabra;
    public String letra;
    public char array[];
    
    public Ahorcado(){
        
        this.oportunidades=3;
        this.palabra="arroz";
        this.letra="";
        this.array=new char [5];
        this.limpiarAhorcado();
    }
    
    public boolean verificarLetra(){
        for(int i=0;i<5;i++){
            if(this.letra==this.palabra.charAt(i)){
                this.array[i]=this.letra;
                return true;
            }else{
                return false;
            }
        }
    }

    public void limpiarAhorcado(){
        for (int i=0; i<this.palabra.length; i++ ) {
			this.array[i] = '_';
		}
    }

    public void imprimirTablero(){
        for(int i=0;i<this.array.length;i++){
            System.out.print(this.array[i]);
        }
    }

    public void start(){
        Scanner texto = new Scanner(System.in);


        do{

            System.out.print("Ingrese una letra");
            this.letra=texto.nextLine();
            if(this.verificarLetra()){
                for(int i=0;i<5;i++){
                    System.out.print("Letra correcta :)");
                    
                }
            }else{
                
                System.out.println("Letra incorrecta :(");
                this.oportunidades--;
                
            }





        }while(this.oportunidades<1);

    }

}