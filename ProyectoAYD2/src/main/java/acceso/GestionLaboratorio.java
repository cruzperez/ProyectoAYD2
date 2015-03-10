/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author bray
 */
public class GestionLaboratorio {
    private Conexion nuevaConexion;
    private Connection conn;
    public GestionLaboratorio()
    {
        nuevaConexion= new Conexion();
         conn=nuevaConexion.getConn();
    }
    public void insertarCurso(String name)
    {
        
        nuevaConexion.crearConn();
        conn=nuevaConexion.getConn();
         Statement s = null;
        try
        {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("INSERT INTO curso values(default,'"+name+"');");
            
        }catch (Exception e)
        {
            System.out.println("Problema al insertar en curso. "+e);
        }
        nuevaConexion.cierraConn();

    }
    public void insertarSalon(String name,int capacidad)
    {
        
        nuevaConexion.crearConn();
        conn=nuevaConexion.getConn();
         Statement s = null;
        try
        {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("INSERT INTO salon values(default,'"+name+"',"+capacidad+");");
            
        }catch (Exception e)
        {
            System.out.println("Problema al insertar en salon. "+e);
        }
        nuevaConexion.cierraConn();

    }    
}
