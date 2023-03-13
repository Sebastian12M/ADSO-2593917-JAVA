import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);


        int opcion=0;
        int pos_disponible = 0;
        int opcion2=0;
        int buscar=0;
        Persona arreglo [] = new Persona [10];
        do{

            System.out.println("||-------------------------------------- ||");
			System.out.println("||------------ PERSONAS ---------------- ||");
			System.out.println("||-------------------------------------- ||");
			System.out.println("||------- Personas Registradas: "+pos_disponible+" -||");
			System.out.println("||                                       ||");
			System.out.println("||   1. Registrar Persona.               ||");
			System.out.println("||   2. Ver lista de Personas.           ||");
            System.out.println("||   3. Modificar informacion de cliente ||");
			System.out.println("||   4. Ordenar lista de Personas.       ||");
            System.out.println("||   5. Eliminar persona.                ||");
			System.out.println("||   6. Salir.                           ||");
			System.out.println("||                                       ||");
			System.out.println("||-------------------------------------- ||");
			System.out.print("||=> Ingrese una opcion: ");
			opcion = numeros.nextInt();

            if(opcion == 1){
                System.out.print("Ingrese su documento: ");
                int documento = numeros.nextInt();

                System.out.print("Ingrese el nombre: ");
                String nombre = texto.nextLine();

                System.out.print("Ingrese los apellidos: ");
                String apellidos = texto.nextLine();

                System.out.print("Ingrese el numero de celular: ");
                int celular = numeros.nextInt();

                System.out.print("Ingrese la direcion: ");
                String direccion = texto.nextLine();

                Persona temporal = new Persona(documento, nombre, apellidos, celular, direccion);

                boolean valido = true;
                for (int i=0;i<pos_disponible;i++){
                    if(temporal.getDocumento() == arreglo[i].getDocumento()) {
                        valido = false;
                        System.out.println("Documento no valido");
                        break;
                    }
                    
                }
                if (valido){
                        arreglo[pos_disponible] = temporal;
                        pos_disponible++;
                        System.out.println("Registrado correctamente");
                    }

                
            }else if(opcion == 2){
                for(int i=0;i<arreglo.length;i++){
                    if(arreglo[i]!=null ){
                        
                        arreglo[i].resumen();
                        
                    }
                    
                }
            }else if(opcion == 3 ){
                for(int i=0;i<arreglo.length;i++){
                    if(arreglo[i]!=null ){
                        System.out.println("----------------------");
                        arreglo[i].mostrarDatos();
                        System.out.println("----------------------");
                        
                    }
                    
                }

                System.out.println("Ingrese el documento: ");
                buscar = numeros.nextInt();

                for(int i = 0;i<pos_disponible;i++){
                    

                    if(buscar==arreglo[i].getDocumento() ){
                        do{
                            System.out.println("1.Documento");
                            System.out.println("2.Nombre");
                            System.out.println("3.Apellido");
                            System.out.println("4.Celular");
                            System.out.println("5.Direccion");
                            System.out.println("6.Salir ");
                            System.out.print("||=> Ingrese una opcion: ");
                            opcion2=numeros.nextInt();

                            if(opcion2 == 1){

                                System.out.print("Ingrese la nueva cedula: ");
                                int cedula=numeros.nextInt();
                                arreglo[i].setDocumento(cedula);

                            }else if(opcion2==2){
                                System.out.print("Ingrese el nuevo nombre: ");
                                String nombre=texto.nextLine();
                                arreglo[i].setNombre(nombre);
                            }else if(opcion2==3){
                                System.out.print("Ingrese el nuevo apellido: ");
                                String apellido = texto.nextLine();
                                arreglo[i].setApellidos(apellido);

                            }else if(opcion2==4){
                                System.out.print("Ingrese el nuevo numero de celular: ");
                                int n_numero=numeros.nextInt();
                                arreglo[i].setCelular(n_numero);
                            }else if(opcion2==5){
                                System.out.print("Ingrese la nueva direccion: ");
                                String n_direccion=texto.nextLine();
                                arreglo[i].setDireccion(n_direccion);
                            }

                        }while(opcion2!=6);
                    }else if (buscar!=arreglo[i].getDocumento()) {
                        System.out.println("---==>Numero de documento no encontrado<==---");
                    }
                }
            }else if(opcion==4){
                for(int i=0;i<arreglo.length;i++){
                    if(arreglo[i]!=null){
                        arreglo[i].resumen();
                    }
                }
                System.out.print("Ingrese el numero de documento: ");
                int document=numeros.nextInt();
                
                for(int i=0;i<pos_disponible;i++){
                    if(document==arreglo[i].getDocumento()){
                        arreglo[i].mostrarDatos();
                    }
                    
                }
            }else if(opcion==5){
                for(int i=0;i<arreglo.length;i++){
                    if(arreglo[i]!=null){
                        arreglo[i].resumen();
                    }
                    
                }
                System.out.print("Ingrese el documento de la persona ha eliminar: ");
                int eliminar=numeros.nextInt();

                for(int i=0;i<pos_disponible;i++){
                    if(arreglo[i]!= null  &&  eliminar==arreglo[i].getDocumento()){
                        int pos=i;
                        for(int j=pos;j<arreglo.length-1;j++){
                            arreglo[j]=arreglo[j+1];
                            
                        }
                        
                    }
                }
            }



        }while(opcion != 6);


    }

}