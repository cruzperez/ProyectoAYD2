/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bray
 */
public class GestionPrograma {
    private Connection conn;
    public GestionPrograma() 
    {
        
    }
    
    public void crearConn()
    {
        String driver = "org.postgresql.Driver"; // el nombre de nuestro driver Postgres.
        String connectString = "jdbc:postgresql://localhost:5433/ProyectoAYD2"; // llamamos nuestra bd
        String user = "postgres"; // usuario postgres
        String password = "root"; // no tiene password nuestra bd.
        try {
            Class.forName(driver);//Hacemos la coneccion.
            conn = DriverManager.getConnection(connectString, user, password);//Si la Conexion fue realizada con exito, muestra el sgte mensaje.
            //devolver="Conexion a la base de datos Ejemplo realizada con exito! ";
            //Cerramos la Conexion
            //conn.close();
        }
//Si se produce una Excepcion y no nos podemos conectar, muestra el sgte. mensaje.
catch(SQLException e) {
    System.out.println("Se ha producido un error en la conexion a la base de datos Ejemplo! "+e);
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionPrograma.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("fallo la conexion "+ex.toString());
        }
        
        //return devolver;
        
        //return devolver;
    }

    public Connection getConn() {
        return conn;
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
