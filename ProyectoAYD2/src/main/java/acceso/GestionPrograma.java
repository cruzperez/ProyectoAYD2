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

    public void insertarPrograma(String name, int capacidad) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("INSERT INTO salon values(default,'" + name + "'," + capacidad + ");");

        } catch (Exception e) {
            System.out.println("Problema al insertar en salon. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void insertarPrograma(String name, int capacidad, String nombre) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("INSERT INTO salon values(default,'" + name + "'," + capacidad + ",'" + nombre + "');");

        } catch (Exception e) {
            System.out.println("Problema al insertar en salon. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void modificarPrograma(int id, String name, int capacidad) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("UPDATE salon SET nombre='" + name + "', capacidad=" + capacidad + " WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al modificar en tabla salon. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void borrarPrograma(int id) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("DELETE FROM salon  WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla salon. " + e);
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
            rs = s.executeQuery("SELECT id FROM salon WHERE nombre='" + name + "';");
            rs.next();
            int id = Integer.parseInt(rs.getString("id"));
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("DELETE FROM curso  WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla salon. " + e);
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
            rs = s.executeQuery("SELECT * FROM  salon");
            while (rs.next()) {
                devolver += rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "/";
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Problema al consultar la tabla salon de la base de datos " + e);
        }
        nuevaConexion.cierraConn();
        return devolver;
    }

}
