/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import java.sql.Connection;
import java.sql.ResultSet;
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
    public void modificarCurso(int id,String name)
    {
        
        nuevaConexion.crearConn();
        conn=nuevaConexion.getConn();
         Statement s = null;
        try
        {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("UPDATE curso SET nombre='"+name+"' WHERE id="+id+";");
            
        }catch (Exception e)
        {
            System.out.println("Problema al modificar en tabla curso. "+e);
        }
        nuevaConexion.cierraConn();
    }
    public void borrarCurso(int id)
    {
        
        nuevaConexion.crearConn();
        conn=nuevaConexion.getConn();
         Statement s = null;
        try
        {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("DELETE FROM curso  WHERE id="+id+";");
            
        }catch (Exception e)
        {
            System.out.println("Problema al eliminar en tabla curso. "+e);
        }
        nuevaConexion.cierraConn();
    }
    public void borrarCurso(String name)
    {
        
        nuevaConexion.crearConn();
        conn=nuevaConexion.getConn();
         Statement s = null;
         ResultSet rs = null;
        try
        {
            s = conn.createStatement();
            rs=s.executeQuery("SELECT id FROM curso WHERE nombre='"+name+"';");
            rs.next();
            int id=Integer.parseInt(rs.getString("id"));
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("DELETE FROM curso  WHERE id="+id+";");
            
        }catch (Exception e)
        {
            System.out.println("Problema al eliminar en tabla curso. "+e);
        }
        nuevaConexion.cierraConn();
    }
    public String retornarCursos()
    {
        nuevaConexion.crearConn();
        conn=nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        String devolver="";
        try
        {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            rs = s.executeQuery("SELECT * FROM  curso");
            while(rs.next())
            {
                devolver+=rs.getString(1)+","+rs.getString(2)+"/";
            }
            rs.close();
        }catch (Exception e)
        {
            System.out.println("Problema al consultar la tabla curso de la base de datos "+e);
        }
        nuevaConexion.cierraConn();
        return devolver;
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
    public void modificarSalon(int id,String name,int capacidad)
    {
        
        nuevaConexion.crearConn();
        conn=nuevaConexion.getConn();
         Statement s = null;
        try
        {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("UPDATE salon SET nombre='"+name+"', capacidad="+capacidad+" WHERE id="+id+";");
            
        }catch (Exception e)
        {
            System.out.println("Problema al modificar en tabla salon. "+e);
        }
        nuevaConexion.cierraConn();

    }
    public void borrarSalon(int id)
    {
        
        nuevaConexion.crearConn();
        conn=nuevaConexion.getConn();
         Statement s = null;
        try
        {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("DELETE FROM salon  WHERE id="+id+";");
            
        }catch (Exception e)
        {
            System.out.println("Problema al eliminar en tabla salon. "+e);
        }
        nuevaConexion.cierraConn();
    }
    public void borrarSalon(String name)
    {
        
        nuevaConexion.crearConn();
        conn=nuevaConexion.getConn();
         Statement s = null;
         ResultSet rs = null;
        try
        {
            s = conn.createStatement();
            rs=s.executeQuery("SELECT id FROM salon WHERE nombre='"+name+"';");
            rs.next();
            int id=Integer.parseInt(rs.getString("id"));
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("DELETE FROM curso  WHERE id="+id+";");
            
        }catch (Exception e)
        {
            System.out.println("Problema al eliminar en tabla salon. "+e);
        }
        nuevaConexion.cierraConn();
    }
    public String retornarSalones()
    {
        nuevaConexion.crearConn();
        conn=nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        String devolver="";
        try
        {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            rs = s.executeQuery("SELECT * FROM  salon");
            while(rs.next())
            {
                devolver+=rs.getString(1)+","+rs.getString(2)+"/";
            }
            rs.close();
        }catch (Exception e)
        {
            System.out.println("Problema al consultar la tabla salon de la base de datos "+e);
        }
        nuevaConexion.cierraConn();
        return devolver;
    }
}
