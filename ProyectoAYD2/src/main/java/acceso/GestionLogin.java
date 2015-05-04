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
public class GestionLogin {

    private Conexion nuevaConexion;
    private Connection conn;

    public GestionLogin() {
        nuevaConexion = new Conexion();
        conn = nuevaConexion.getConn();
    }

    public String retornarUsuario() {
        nuevaConexion.crearConn();
        conn = nuevaConexion.getConn();
        ResultSet rs = null;
        Statement s = null;
        String devolver = "";
        try {
            s = conn.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            rs = s.executeQuery("SELECT * FROM  usuario");
            while (rs.next()) {
                devolver += rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "/";
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Problema al consultar la tabla usuario de la base de datos " + e);
        }
        nuevaConexion.cierraConn();
        return devolver;
    }

}
