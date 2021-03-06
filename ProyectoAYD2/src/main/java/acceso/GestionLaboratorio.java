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

    public void insertarRecursoSalon(String name, String name2, String name3) {
        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("INSERT INTO salon_recurso values('" + name3 + "', '" + name + "','" + name2 + "');");

        } catch (Exception e) {
            System.out.println("Problema al insertar el recurso salon. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void modificarRecursoSalon(int id, int id2, int name, int name2, int name3) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("UPDATE salon_recurso SET cantidad = '" + name3 + "', recurso_id='" + name + "', salon_id ='" + name2 + "' WHERE recurso_id=" + id
                    + " and salon_id =" + id2 + ";");

        } catch (Exception e) {
            System.out.println("Problema al modificar en tabla recurso salon. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void borrarRecursoSalon(int id, int id2) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("DELETE FROM salon_recurso WHERE recurso_id=" + id + " and salon_id =" + id2 + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla recurso salon. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void borrarRecursoSalon(String name, String name2) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        ResultSet rs = null;
        Statement s2 = null;
        ResultSet rs2 = null;
        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT id FROM recurso WHERE nombre='" + name + "';");
            rs.next();
            int id = Integer.parseInt(rs.getString("id"));
            s2 = conn.createStatement();
            rs2 = s2.executeQuery("SELECT id FROM salon WHERE nombre='" + name2 + "';");
            rs2.next();
            int id2 = Integer.parseInt(rs2.getString("id"));
            s.executeUpdate("DELETE FROM salon_recurso WHERE recurso_id=" + id + " and salon_id=" + id2 + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla recurso salon. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public String retornarRecursoSalon() {
        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        String devolver = "";
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            rs = s.executeQuery("SELECT * FROM salon_recurso");
            while (rs.next()) {
                devolver += rs.getString(0) + "," + rs.getString(1) + "," + rs.getString(2) + "/";
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Problema al consultar la tabla recurso de la base de datos " + e);
        }
        nuevaConexion.cierraConn();
        return devolver;
    }

    public void insertarCursoSalon(String name, String name2) {
        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("INSERT INTO salon_curso values('" + name + "','" + name2 + "');");

        } catch (Exception e) {
            System.out.println("Problema al insertar el curso salon. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void modificarCursoSalon(int id, int id2, int name, int name2) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("UPDATE salon_curso SET curso_id='" + name + "', salon_id ='" + name2 + "' WHERE curso_id=" + id
                    + " and salon_id =" + id2 + ";");

        } catch (Exception e) {
            System.out.println("Problema al modificar en tabla curso salon. " + e);
        }
        nuevaConexion.cierraConn();

    }

    public void borrarCursoSalon(int id, int id2) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("DELETE FROM salon_curso WHERE curso_id=" + id + " and salon_id =" + id2 + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla curso salon. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void borrarCursoSalon(String name, String name2) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        ResultSet rs = null;
        Statement s2 = null;
        ResultSet rs2 = null;
        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT id FROM curso WHERE nombre='" + name + "';");
            rs.next();
            int id = Integer.parseInt(rs.getString("id"));
            s2 = conn.createStatement();
            rs2 = s2.executeQuery("SELECT id FROM salon WHERE nombre='" + name2 + "';");
            rs2.next();
            int id2 = Integer.parseInt(rs2.getString("id"));
            s.executeUpdate("DELETE FROM salon_curso WHERE curso_id=" + id + " and salon_id=" + id2 + ";");

        } catch (Exception e) {
            System.out.println("Problema al eliminar en tabla curso salon. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void insertarReservacion(String fechainicio, String horainicio,
            String horafin, String encargado, boolean estado, int salon) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("INSERT INTO reservacion values(default,'" + fechainicio + "','" + horainicio + "','" + horafin + "','" + salon
                    + "','" + encargado + "','" + estado + "')");

        } catch (Exception e) {
            System.out.println("Problema al insertar en reservacion. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void modificarReservacion(int id, String fechainicio, String horainicio,
            String horafin, String encargado, String estado, int salon) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
            s.executeUpdate("UPDATE reservacion SET fecha_inicio ='" + fechainicio + "', hora_inicio ='" + horainicio
                    + "', hora_final ='" + horafin + "', salon_id ='" + salon + "', encargado ='" + encargado
                    + "', estado ='" + estado + "' WHERE id=" + id + ";");

        } catch (Exception e) {
            System.out.println("Problema al modificar en tabla recurso. " + e);
        }
        nuevaConexion.cierraConn();
    }

    public void borrarReservacion(int id) {

        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        Statement s = null;
        try {
            s = conn.createStatement();
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
                devolver += rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + "," + rs.getString(5) + "," + rs.getString(6) + "," + rs.getString(7) + "/";
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Problema al consultar la tabla reservacion de la base de datos " + e);
        }
        nuevaConexion.cierraConn();
        return devolver;
    }

}
