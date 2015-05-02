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

    public GestionLaboratorio() {
        nuevaConexion = new Conexion();
        conn = nuevaConexion.getConn();
    }

    public void insertarCurso(String name) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("INSERT INTO curso values(default,'" + name + "');");

        } catch (Exception e) {
            System.out.println("Problema al insertar en curso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void modificarCurso(int id, String name) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("UPDATE curso SET nombre='" + name + "' WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al modificar en tabla curso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void borrarCurso(int id) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("DELETE FROM curso  WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla curso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void borrarCurso(String name) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        ResultSet rs = null;
        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT id FROM curso WHERE nombre='" + name + "';");
            rs.next();
            int id = Integer.parseInt(rs.getString("id"));
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("DELETE FROM curso  WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla curso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public String retornarCursos() {
        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        String devolver = "";
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            rs = s.executeQuery("SELECT * FROM  curso");
            while (rs.next()) {
                devolver += rs.getString(1) + "," + rs.getString(2) + "/";
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Problema al consultar la tabla curso de la base de datos " + e);
        }
        nuevaConexion.cierraConn();
        return devolver;
    }

    public void insertarSalon(String name, int capacidad) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("INSERT INTO salon values(default,'" + name + "','" + capacidad + "');");

        } catch (Exception e) {
            System.out.println("Problema al insertar en salon. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void insertarSalon(String name, int capacidad, String nombre) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("INSERT INTO salon values(default,'" + name + "','" + capacidad + "','" + nombre + "');");

        } catch (Exception e) {
            System.out.println("Problema al insertar en salon. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void modificarSalon(int id, String name, int capacidad) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("UPDATE salon SET nombre='" + name + "', capacidad=" + capacidad + " WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al modificar en tabla salon. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void borrarSalon(int id) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("DELETE FROM salon  WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla salon. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void borrarSalon(String name) {

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

    public String retornarSalones() {
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

    public void insertarReservacion(String fechaIni, String fechaFin, String horaIni, String horaFin, String nombre) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            rs = s.executeQuery("SELECT id FROM salon WHERE nombre='" + nombre + "';");
            rs.next();
            int id = Integer.parseInt(rs.getString("id"));
            //System.out.println("obtenido "+capac);
            s.executeUpdate("INSERT INTO reservacion values(default,'" + fechaIni + "','" + fechaFin + "','" + horaIni + "','" + horaFin + "'," + id + ");");

        } catch (Exception e) {
            System.out.println("Problema al insertar en reservacion. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void insertarReservacion(String fechaIni, String fechaFin, String horaIni, String horaFin, int id) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("INSERT INTO reservacion values(default,'" + fechaIni + "','" + fechaFin + "','" + horaIni + "','" + horaFin + "'," + id + ");");

        } catch (Exception e) {
            System.out.println("Problema al insertar en reservacion. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void modificarReservacion(int idR, String fechaIni, String fechaFin, String horaIni, String horaFin, int id) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("UPDATE reservacion SET fecha_inicio='" + fechaIni + "',fecha_final='" + fechaFin + "',hora_inicio='" + horaIni + "',hora_final='" + horaFin
                    + "',salon_id=" + id + " WHERE id=" + idR + ";");

        } catch (Exception e) {
            System.out.println("Problema al modificar en reservacion. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void modificarReservacion(int idR, String fechaIni, String fechaFin, String horaIni, String horaFin, String nombre) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT id FROM salon WHERE nombre='" + nombre + "';");
            rs.next();
            int id = Integer.parseInt(rs.getString("id"));
            s.executeUpdate("UPDATE reservacion SET fecha_inicio='" + fechaIni + "',fecha_final='" + fechaFin + "',hora_inicio='" + horaIni
                    + "',hora_final='" + horaFin + "',salon_id=" + id + " WHERE id=" + idR + ";");

        } catch (Exception e) {
            System.out.println("Problema al insertar en reservacion. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void borrarReservacion(int id) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("DELETE FROM reservacion  WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla reservacion. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public String retornarReservacion() {
        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        String devolver = "";
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            rs = s.executeQuery("SELECT * FROM  reservacion");
            while (rs.next()) {
                devolver += rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + "," + rs.getString(5) + "," + rs.getString(6) + "/";
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Problema al consultar la tabla reservacion de la base de datos " + e);
        }
        nuevaConexion.cierraConn();
        return devolver;
    }

    public void insertarTRecurso(String name) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("INSERT INTO tipo_recurso values(default,'" + name + "');");

        } catch (Exception e) {
            System.out.println("Problema al insertar en tipo recurso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void modificarTRecurso(int id, String name) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("UPDATE tipo_recurso SET nombre='" + name + "' WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al modificar en tabla tipo recurso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void borrarTRecurso(int id) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("DELETE FROM tipo_recurso WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla tipo recurso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void borrarTRecurso(String name) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        ResultSet rs = null;
        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT id FROM  WHERE tipo_recurso nombre='" + name + "';");
            rs.next();
            int id = Integer.parseInt(rs.getString("id"));
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //System.out.println("INSERT INTO curso values(default,'"+name+"');");
            s.executeUpdate("DELETE FROM tipo_recurso  WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla tipo recurso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public String retornarTRecurso() {
        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        String devolver = "";
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            rs = s.executeQuery("SELECT * FROM  tipo_recurso");
            while (rs.next()) {
                devolver += rs.getString(1) + "," + rs.getString(2) + "/";
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Problema al consultar la tabla tipo recurso de la base de datos " + e);
        }
        nuevaConexion.cierraConn();
        return devolver;
    }

    public void insertarRecurso(String name, int id2) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("INSERT INTO recurso values(default,'" + name + "','" + id2 + "')");

        } catch (Exception e) {
            System.out.println("Problema al insertar en recurso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void modificarRecurso(int id, String name, int id2) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("UPDATE recurso SET nombre='" + name + "', tipo_recurso_id ='" + id2 + "' WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al modificar en tabla recurso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void borrarRecurso(int id) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("DELETE FROM recurso WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla recurso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void borrarRecurso(String name) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        ResultSet rs = null;
        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT id FROM recurso WHERE nombre='" + name + "';");
            rs.next();
            int id = Integer.parseInt(rs.getString("id"));
            s.executeUpdate("DELETE FROM recurso  WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en recurso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public String retornarRecurso() {
        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        String devolver = "";
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            rs = s.executeQuery("SELECT * FROM recurso");
            while (rs.next()) {
                devolver += rs.getString(1) + "," + rs.getString(2) + "/";
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Problema al consultar la tabla recurso de la base de datos " + e);
        }
        nuevaConexion.cierraConn();
        return devolver;
    }

}
