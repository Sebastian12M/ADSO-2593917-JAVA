
package Principal;


public class Productos {
    String id;
    String nombre;
    String cant;
    String precio;

    public Productos(String id, String nombre, String cant, String precio) {
        this.id = id;
        this.nombre = nombre;
        this.cant = cant;
        this.precio=precio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCant() {
        return cant;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
}
