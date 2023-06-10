
package Clases;


public class Factura_producto {
    private String id_factura;
    private String id_producto;
    private String cantidad;
    private int subtotal;

    public Factura_producto(String id_factura,String id_producto, String cantidad, int subtotal) {
        this.id_factura=id_factura;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public String getId_producto() {
        return id_producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }
    
    
}
