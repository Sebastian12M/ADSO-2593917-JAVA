
package Principal;


public class Vendedores {
   String nombre;
   String apellidos;
   String Cedula;
   String telefono;

    public Vendedores(String nombre, String apellidos, String Cedula, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Cedula = Cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
   
}
