
package Clases;

import java.util.Date;


public class Factura {
    private String id_factura;
    private String cedula_cliente;
    private String cedula_vendedor;
    private Date fecha;
    private int total;

    public Factura(String id_factura,String cedula_cliente, String cedula_vendedor, Date fecha, int total) {
        this.id_factura=id_factura;
        this.cedula_cliente = cedula_cliente;
        this.cedula_vendedor = cedula_vendedor;
        this.fecha = fecha;
        this.total = total;
    }

    public void setCedula_cliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public void setCedula_vendedor(String cedula_vendedor) {
        this.cedula_vendedor = cedula_vendedor;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getCedula_cliente() {
        return cedula_cliente;
    }

    public String getCedula_vendedor() {
        return cedula_vendedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getTotal() {
        return total;
    }

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }
    
    
}
