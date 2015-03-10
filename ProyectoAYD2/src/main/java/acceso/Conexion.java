/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;
import java.sql.*; //importacion para el uso de sql
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cruz
 */
public class Conexion {
private Connection conn;
    public Conexion() 
    {
        
    }
    
    public void crearConn()
    {
        String driver = "org.postgresql.Driver"; // el nombre de nuestro driver Postgres.
        String connectString = "jdbc:postgresql://localhost:5433/ProyectoAYD2"; // llamamos nuestra bd
        String user = "postgres"; // usuario postgres
        String password = "root"; // no tiene password nuestra bd.
        //String devolver="";
        
        try {
            Class.forName(driver);//Hacemos la coneccion.
            conn = DriverManager.getConnection(connectString, user, password);//Si la Conexion fue realizada con exito, muestra el sgte mensaje.
            //devolver="Conexion a la base de datos Ejemplo realizada con exito! ";
            System.out.println("Conexion a la base de datos Ejemplo realizada con exito! ");
            //Cerramos la Conexion
            //conn.close();
        }
//Si se produce una Excepcion y no nos podemos conectar, muestra el sgte. mensaje.
catch(SQLException e) {
  System.out.println("Se ha producido un error en la conexion a la base de datos Ejemplo! "+e);
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("fallo la conexion "+ex.toString());
        }
        
    }

    public Connection getConn() {
        return conn;
    }
       public ResultSet dameNombre()
    {
        ResultSet rs = null;
        Statement s = null;
        try
        {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            rs = s.executeQuery("SELECT * FROM  Alumnos");
        }catch (Exception e)
        {
            System.out.println("Problema al consultar la base de datos "+e);
        }
        return rs;
    }
       
       public void cierraConn()
    {
        try
        {
            conn.close();
        }catch(Exception e)
        {
            System.out.println("Problema para cerrar la Conexión a la base de datos" );
        }
    }
        
}
