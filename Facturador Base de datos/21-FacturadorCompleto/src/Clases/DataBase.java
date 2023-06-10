package Clases;

import java.sql.*;
import javax.print.DocFlavor;
import ModuloFacturas.CrearFactura;
import com.mysql.cj.protocol.Resultset;

public class DataBase {
    
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "almacenes";
        String database_user = "root";
        String database_password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try{
            Connection conexion = DriverManager.getConnection(url, database_user, database_password);
            this.manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa a: "+database_name);
        }catch(SQLException e){
            System.out.println("Error en conexion: "+e.getMessage());
            this.manipularDB = null;
        }
    }
    
    public Persona[] listaClientes(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    public Persona[] listaVendedores(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    public Persona buscarCliente(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Persona buscarVendedor(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public boolean editarCliente(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE clientes SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarVendedor(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE vendedores SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean insertarCliente(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO clientes(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean insertarVendedor(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO vendedores(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean EliminarCliente(String cedula){
           try {
            String cedulas = cedula;
            String consulta="DELETE FROM clientes WHERE cedula='"+cedulas+"'";
            int resp_consulta=manipularDB.executeUpdate(consulta);
            if(resp_consulta==1){
                return true;
            }
        } catch (SQLException e){
            System.out.println("--> Error : " + e.getMessage());
            return false;
        }
        
           
        return false;
    }
    
    public boolean EliminarVendedor(String cedula){
           try {
            String cedulas = cedula;
            String consulta="DELETE FROM vendedores WHERE cedula='"+cedulas+"'";
            int resp_consulta=manipularDB.executeUpdate(consulta);
            if(resp_consulta==1){
                return true;
            }
        } catch (SQLException e){
            System.out.println("--> Error : " + e.getMessage());
            return false;
        }
        
           
        return false;
    }
    
    public boolean InsertarProducto(String ids, String nombres,String precios){
        try {
            String id=ids;
            String nombre=nombres;
            String precio=precios;
            
            
            String consulta="INSERT INTO productos(id,nombre,precio) VALUES ('"+id+"','"+nombre+"','"+precio+"')";
            int respuesta=manipularDB.executeUpdate(consulta);
            if(respuesta==1){
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error"+e.getMessage());
            return false;
        }
        
        return false;
    } 
    
    
    
    public  Producto buscarProducto(String id){
        Producto temp=null;
            
        try {
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM productos WHERE id='"+id+"'");
            registros.next();
            if(registros.getRow()==1){
            int  precio=Integer.parseInt(registros.getString("precio"));
            temp= new Producto(registros.getString("id"), registros.getString("nombre"),precio);
                   
            }
            return temp; 
        } catch (SQLException e) {
            System.err.println("Error "+e.getMessage());
            return null;
        }
            
    }
                    
            
    public Producto[] ListarProductos(){
        Producto [] productos= new Producto[100];
        
        try {
            ResultSet registros=this.manipularDB.executeQuery("SELECT * FROM productos");
            registros.next();
            if(registros.getRow()==1){
                int indice=0;
                do{
                   int precio=Integer.parseInt(registros.getString("precio"));
                   Producto listado = new Producto(registros.getString("id"), registros.getString("nombre"), precio);
                   productos[indice]=listado;
                   indice++;
                }while(registros.next());
            }
            return productos;
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            
            return productos;
        }
        
    }                
 
            
            
    public boolean modificarProducto(Producto actualizar, String id){
       
        
        try {
        String nombre= actualizar.getNombre();
        int precio=actualizar.getPrecio();
        
        String consulta ="UPDATE productos SET nombre='"+nombre+"', precio ='"+precio+"' WHERE id='"+id+"'";
        int respuesta = manipularDB.executeUpdate(consulta);
         return true;
        } catch (SQLException e) {
            System.out.print("error:" +e.getMessage());
            return false;
        }
        
    }
    
    
    public boolean insertarFactura(String cedula_clie, String cedula_ven, Date fecha, int total){
        try {
            String cedula_cliente=cedula_clie;
            String cedula_vendedor=cedula_ven;
            Date fechas = fecha;
            int tot=total;
            String consulta="INSERT INTO facturas(cedula_cliente, cedula_vendedor,fecha,total) VALUES ('"+cedula_cliente+"','"+cedula_vendedor+"','"+fechas+"','"+tot+"')";
            int respuesta = manipularDB.executeUpdate(consulta);
            
            if(respuesta==1){
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error al crear la factura: "+e.getMessage());
            return false;
        }
        return false;
        
        
        
    }
    
    public boolean insertarFacturaProducto(Factura_producto productos[]){
        
        
        try {
            for(int i=0;i<productos.length;i++){
               
               if(productos[i]!=null){
                    Factura_producto producto= productos[i];
                    String id=producto.getId_producto();
                    String cantidad = producto.getCantidad();
                    int subtotal= producto.getSubtotal();
                    String id_factura=producto.getId_factura();
                    
                    String consulta="INSERT INTO items_factura(id_factura,id_producto, cantidad,subtotal) VALUES ('"+id_factura+"','"+id+"','"+cantidad+"','"+subtotal+"')";
                    int puesta = manipularDB.executeUpdate(consulta);
                    
                           
                
                
               }else{
                   break;
               }
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            return false;
        }
        return false;
    }
    
    
            
     public String extraerId(){
         try {
             ResultSet registro =this.manipularDB.executeQuery("SELECT * FROM facturas ORDER BY id DESC");
             registro.next();
             if(registro.getRow()==1){
                 return String.valueOf(registro.getInt("id")+1);
             }
         } catch (SQLException e) {
             System.out.print("error: "+e.getMessage());
         }
         return null;
     }
    
    
   
    public  Factura[] MostrarFacturas(){
        Factura [] facturas= new Factura[100];
       try {
           ResultSet registro =this.manipularDB.executeQuery("SELECT * FROM facturas");
           registro.next();
           if(registro.getRow()==1){
               
             int indice=0;

            do{
                   Factura temporal=new Factura(registro.getString("id"), registro.getString("cedula_cliente"), registro.getString("cedula_vendedor"), registro.getDate("fecha"), registro.getInt("total"));
                   facturas[indice]=temporal;
                   indice++;
                   System.out.println(temporal.getCedula_cliente());
            }while(registro.next());
           }
           return facturas;
       } catch (SQLException e) {
           System.out.println("Error: "+ e.getMessage());
           return  facturas;
       }
          
   }
    
    
   public Factura_producto[] productos(String id_fac){
       String id=id_fac;
       Factura_producto[] todos = new Factura_producto[100];
       
       try {
           ResultSet registro = this.manipularDB.executeQuery("SELECT * FROM items_factura WHERE id_factura='"+id+"'");
           registro.next();
           if(registro.getRow()==1){
               int i=0;
                do{
                    
                    Factura_producto temporal=new Factura_producto(registro.getString("id"), registro.getString("id_producto"),registro.getString("cantidad"), registro.getInt("subtotal"));
                    todos[i]=temporal;
                    
                    i++;
                }while(registro.next());
                
           }
           return todos;
       } catch (SQLException e) {
           System.out.print("Error: "+e.getMessage());
       }
       return todos;
   }
    
   public boolean  EliminarProducto(String id_producto){
       String id=id_producto;
       
       try {
           String consulta="DELETE FROM productos WHERE id='"+id+"'";
           int respuesta=manipularDB.executeUpdate(consulta);
           if(respuesta==1){
               return true;
           }
       } catch (SQLException e) {
           System.out.println("Error: "+e.getMessage());
           return false;
       }
          return false;
   }
    
    
}
