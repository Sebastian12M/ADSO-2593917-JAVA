
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBase {
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "colegio";
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
    
    
    
    public Profesor ExtraerDatosProfe(String usuario){
        ResultSet registros=null;
        
        try {
            String consulta = "SELECT * FROM profesores WHERE usuario='"+usuario+"'";
            registros=manipularDB.executeQuery(consulta);
            
            if(registros.next()){
               
                Profesor validar = new Profesor(registros.getString("usuario"), registros.getString("materia"));
                
               return validar;
            }
             
        }catch (SQLException e) {
            System.out.print("Usuario no registrado:"+e.getMessage());
            
        }
        return null;
    }
    
    public boolean insertarProfe(){
        boolean respuesta = false;
        String user="Oscar";
        int pass=11;
        String materia="Informatica";
    try {
        
        
        String consulta = "INSERT INTO profesores (usuario, contrasenia, materia) VALUES ('"+user+"','"+pass+"','"+materia+"')";
        int resp_consulta = manipularDB.executeUpdate(consulta);
        if (resp_consulta==1) {
            respuesta = true;
        }
    } catch (SQLException ex) {
        System.out.println("--> Error Insert: " + ex.getMessage());
    }
        return false;
    }

    
    public Usuario validacion(String usuario){
        ResultSet registros=null;
        
        try {
            String consulta = "SELECT * FROM profesores WHERE usuario='"+usuario+"'";
            registros=manipularDB.executeQuery(consulta);
            
            if(registros.next()){
               
                Usuario validar = new Usuario(registros.getString("usuario"), registros.getInt("contrasenia"));
                System.out.print(validar.getPassword()+ validar.getUsuario());
               return validar;
            }
             
        }catch (SQLException e) {
            System.out.print("Usuario no registrado:"+e.getMessage());
            
        }
        return null;
    }
    
    
    public boolean registrarEstudiante(Estudiantes estudiante ){
        String cedula= estudiante.getCedula();
        String nombre= estudiante.getNombre();
        String apellido=estudiante.getApellido();
        int edad=estudiante.getEdad();
        String correo=estudiante.getCorreo();
         try {
            
            
            String consuta="INSERT INTO estudiantes(cedula, nombre, apellido, edad, correo) VALUES ('"+cedula+"', '"+nombre+"', '"+apellido+"', '"+edad+"', '"+correo+"') ";
            int respusta = manipularDB.executeUpdate(consuta);
            if(respusta==1){
                System.out.println("insertado");
                return true;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error al insertar"+e.getMessage());
            
        }
        return false;
    }
    
    public Estudiantes [] mostrarEstudiantes(){
        ResultSet registros = null;
        Estudiantes arregloestu []= new Estudiantes[100];
	try {
	    String consulta = "SELECT * FROM estudiantes";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
                int indice=0;
	        do{
	            Estudiantes estudiante = new Estudiantes(registros.getString("cedula"), registros.getString("nombre"), registros.getString("apellido"), registros.getInt("edad"),registros.getString("correo") );
                    arregloestu[indice]=estudiante;
                    indice++;
	        }while(registros.next());
                
	    }
            return arregloestu;
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
        return arregloestu;
    }
    
    public Double[] Matematicas (String cedula){
        ResultSet registros = null;
        Double arregloestu []= new Double[4];
	try {
	    String consulta = "SELECT * FROM matematicas WHERE cedula='"+cedula+"'";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
                
	       
	        do{
                    arregloestu[0]=registros.getDouble("nota1");
                    arregloestu[1]=registros.getDouble("nota2");
                    arregloestu[2]=registros.getDouble("nota3"); 
                    arregloestu[3]=registros.getDouble("promedio");
                } while(registros.next());
               
                    
	        
                
	    }
            return arregloestu;
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
        return arregloestu;
    }
    
    public Double[] espaniol (String cedula){
        ResultSet registros = null;
        Double arregloestu []= new Double[4];
	try {
	    String consulta = "SELECT * FROM espaniol WHERE cedula='"+cedula+"'";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
                
	        
	       do{
                    arregloestu[0]=registros.getDouble("nota1");
                    arregloestu[1]=registros.getDouble("nota2");
                    arregloestu[2]=registros.getDouble("nota3");
                    arregloestu[3]=registros.getDouble("promedio"); 
               }while(registros.next()); 
                   
	        
                
	    }
            return arregloestu;
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
        return arregloestu;
    }
    
    public Double[] informatica(String cedula){
        ResultSet registros = null;
        Double arregloestu []= new Double[4];
	try {
	    String consulta = "SELECT * FROM informatica WHERE cedula='"+cedula+"'";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
                
	        
	        do{
                    arregloestu[0]=registros.getDouble("nota1");
                    arregloestu[1]=registros.getDouble("nota2");
                    arregloestu[2]=registros.getDouble("nota3");
                    arregloestu[3]=registros.getDouble("promedio"); 
                }while(registros.next());
               
                    
	        
                
	    }
            return arregloestu;
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
        return arregloestu;
    }
    
    
    public boolean AlmacenarMate(Double nota1, Double nota2, Double nota3, String cedula){
         
            Double promedio = (nota1+nota2+nota3)/3;
        
         try {
            
            
            String consuta="UPDATE  matematicas SET nota1='"+nota1+"', nota2='"+nota2+"',nota3='"+nota3+"', promedio='"+promedio+"' WHERE cedula='"+cedula+"'";
            int respusta = manipularDB.executeUpdate(consuta);
            if(respusta==1){
                System.out.println("insertado");
                return true;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error al insertar"+e.getMessage());
            
        }
        return false;
        
        
        
    }
    
    public boolean AlmacenarEspa(Double nota1, Double nota2, Double nota3, String cedula){
         
            Double promedio = (nota1+nota2+nota3)/3;
        
         try {
            
            
            String consuta="UPDATE  espaniol SET nota1='"+nota1+"', nota2='"+nota2+"',nota3='"+nota3+"', promedio='"+promedio+"' WHERE cedula='"+cedula+"'";
            int respusta = manipularDB.executeUpdate(consuta);
            if(respusta==1){
                System.out.println("insertado");
                return true;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error al insertar"+e.getMessage());
            
        }
        return false;
        
        
        
    }
    
    public boolean AlmacenarInfor(Double nota1, Double nota2, Double nota3, String cedula){
         
            Double promedio = (nota1+nota2+nota3)/3;
        
         try {
            
            
            String consuta="UPDATE  informatica SET nota1='"+nota1+"', nota2='"+nota2+"',nota3='"+nota3+"', promedio='"+promedio+"' WHERE cedula='"+cedula+"'";
            int respusta = manipularDB.executeUpdate(consuta);
            if(respusta==1){
                System.out.println("insertado");
                return true;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error al insertar"+e.getMessage());
            
        }
        return false;
        
        
        
    }
    
    public boolean RegistrarMate(String cedula){
         
        Double nota1=0.0;
        Double nota2=0.0;
        Double nota3=0.0;
        Double promedio=0.0;
        
        
        
         try {
            
            
            String consuta="INSERT INTO matematicas(cedula,nota1, nota2, nota3, promedio) VALUES ('"+cedula+"','"+nota1+"', '"+nota2+"', '"+nota3+"','"+promedio+"') ";
            int respusta = manipularDB.executeUpdate(consuta);
            if(respusta==1){
                System.out.println("insertado");
                return true;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error al insertar"+e.getMessage());
            
        }
        return false;
    }
    
    public boolean RegistrarEspa(String cedula){
         
        Double nota1=0.0;
        Double nota2=0.0;
        Double nota3=0.0;
        Double promedio=0.0;
        
        
        
         try {
            
            
            String consuta="INSERT INTO espaniol(cedula,nota1, nota2, nota3, promedio) VALUES ('"+cedula+"','"+nota1+"', '"+nota2+"', '"+nota3+"','"+promedio+"') ";
            int respusta = manipularDB.executeUpdate(consuta);
            if(respusta==1){
                System.out.println("insertado");
                return true;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error al insertar"+e.getMessage());
            
        }
        return false;
    }
    
    
    public boolean RegistrarInfor(String cedula){
         
        Double nota1=0.0;
        Double nota2=0.0;
        Double nota3=0.0;
        Double promedio=0.0;
        
        
        
         try {
            
            
            String consuta="INSERT INTO informatica(cedula,nota1, nota2, nota3, promedio) VALUES ('"+cedula+"','"+nota1+"', '"+nota2+"', '"+nota3+"','"+promedio+"') ";
            int respusta = manipularDB.executeUpdate(consuta);
            if(respusta==1){
                System.out.println("insertado");
                return true;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error al insertar"+e.getMessage());
            
        }
        return false;
    }
    
    
     public boolean SubirAsistencias(Asistencia[] asistencias){
         
        
        try {
            
            for(int i=0;i< asistencias.length;i++){
                if(asistencias[i]!=null){
                    String cedula = asistencias[i].getCedula();
                    String nombre = asistencias[i].getNombre();
                    String apellido = asistencias[i].getApellido();
                    String fecha = asistencias[i].getFecha();
                    String asis = asistencias[i].getAsistencia();
                    String materia = asistencias[i].getMateria();
                    String consuta="INSERT INTO asistencia(cedula_estu,nombre, apellido, fecha,materia, asistencia) VALUES ('"+cedula+"','"+nombre+"', '"+apellido+"', '"+fecha+"','"+materia+"'  ,'"+asis+"') ";
                    int respusta = manipularDB.executeUpdate(consuta);
                }
            }
            
            
        } catch (SQLException e) {
            System.out.println("Error al insertar"+e.getMessage());
            
        }
        return false;
    }
    
    
    public Asistencia[] mostrarAsis(String fecha){
        Asistencia [] listarAsis = new Asistencia[100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM asistencia WHERE fecha='"+fecha+"'");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Asistencia temp = new Asistencia(registros.getString("cedula_estu"),registros.getString("nombre"), registros.getString("apellido"), registros.getString("fecha"), registros.getString("asistencia"), registros.getString("materia") );
                    listarAsis[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listarAsis;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listarAsis;
        }
    }
    
    
    
    public Usuario validacionEstu(String usuario){
        ResultSet registros=null;
        
        try {
            String consulta = "SELECT * FROM estudiantes WHERE nombre='"+usuario+"'";
            registros=manipularDB.executeQuery(consulta);
            
            if(registros.next()){
               
                Usuario validar = new Usuario(registros.getString("nombre"), registros.getInt("cedula"));
                System.out.print(validar.getPassword()+ validar.getUsuario());
               return validar;
            }
             
        }catch (SQLException e) {
            System.out.print("Usuario no registrado:"+e.getMessage());
            
        }
        return null;
    }
    
    
    public Estudiantes BuscarEstudiante(String cedula){
        ResultSet registros=null;
        try {
            String consulta = "SELECT * FROM estudiantes WHERE cedula='"+cedula+"'";
            registros=manipularDB.executeQuery(consulta);
            
            if(registros.next()){
               
                Estudiantes validar = new Estudiantes(registros.getString("cedula"), registros.getString("nombre"),registros.getString("apellido"),registros.getInt("edad"),registros.getString("correo"));
                
               return validar;
            }
             
        }catch (SQLException e) {
            System.out.print("Usuario no registrado:"+e.getMessage());
            
        }
        return null;
    }
    
    public Asistencia[] mostrarAsisEstu(String cedula){
        Asistencia [] listarAsis = new Asistencia[100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM asistencia WHERE cedula_estu='"+cedula+"'");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Asistencia temp = new Asistencia(registros.getString("cedula_estu"),registros.getString("nombre"), registros.getString("apellido"), registros.getString("fecha"), registros.getString("asistencia"), registros.getString("materia") );
                    listarAsis[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listarAsis;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listarAsis;
        }
    }
    
    
}
