public class Persona{
    //Atributos
    int documento;
    String nombre;
    String apellidos;
    int celular;
    String direcion;

    public Persona(int documento, String nombre, String apellidos, int celular, String direcion){
        this.documento = documento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.direcion = direcion;
    }

    public int getDocumento(){
        return this.documento;
    }
    public String getNombre(){
        return this.nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public int getCelular(){
        return this.celular;
    }

    public String getDireccion(){
        return this.direcion;
    }

    public void setDocumento(int documento){
        this.documento = documento;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setCelular(int celular){
        this.celular = celular;
    }

    public void setDireccion(String direcion){
        this.direcion = direcion;
    }

    public void mostrarDatos(){
        System.out.println("--------------------------------");
        System.out.println("Documento: " + this.documento);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Celular: " + this.celular);
        System.out.println("Direccion: " + this.direcion);
        System.out.println("--------------------------------");
    }
    
    public void resumen(){
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Documento -- "+this.documento+" -- "+"Nombres -- "+this.nombre+" -- "+"Apellidos -- "+this.apellidos);
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }


}