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
public class GestionPrograma {

    private Conexion nuevaConexion;
    private Connection conn;

    public void insertarPrograma(String name) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("INSERT INTO programa values(default,'" + name + "');");

        } catch (Exception e) {
            System.out.println("Problema al insertar el programa. " + e);
        }
        nuevaConexion.cierraConn();

    }


    public void modificarPrograma(int id, String name) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("UPDATE programa SET nombre='" + name + "' WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al modificar en tabla programa. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void borrarPrograma(int id) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("DELETE FROM programa WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla programa. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void borrarPrograma(String name) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        ResultSet rs = null;
        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT id FROM programa WHERE nombre='" + name + "';");
            rs.next();
            int id = Integer.parseInt(rs.getString("id"));
            s.executeUpdate("DELETE FROM programa WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla programa. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public String retornarProgramas() {
        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        String devolver = "";
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            rs = s.executeQuery("SELECT * FROM  programas");
            while (rs.next()) {
                devolver += rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "/";
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Problema al consultar la tabla programa de la base de datos " + e);
        }
        nuevaConexion.cierraConn();
        return devolver;
    }

}
