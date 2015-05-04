/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import acceso.GestionLogin;

/**
 *
 * @author victor
 */
public class ModuloLogin {

    private GestionLogin prog = new GestionLogin();

    public boolean obtenerCredenciales(String usuario, String contrasena) {
        String nombre = usuario;
        String correo = usuario;
        String pass = contrasena;
        String nombre1 = "";
        String correo1 = "";
        String pass1 = "";
        try {
            String[] programas = prog.retornarUsuario().split("/");
            for (int i = 0; i < programas.length; i++) {
                nombre1 = programas[i].split(",")[0];
                correo1 = programas[i].split(",")[1];
                pass1 = programas[i].split(",")[2];
                if (nombre.equals(nombre1) || correo.equals(correo1)) {
                    if (pass1.equals(pass1)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

}
