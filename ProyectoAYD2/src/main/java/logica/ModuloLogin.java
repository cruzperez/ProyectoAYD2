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
        try {
            String[] programas = prog.retornarUsuario().split("/");
            for (int i = 0; i < programas.length; i++) {
                if (programas[i].split(",")[0].equals(usuario) || programas[i].split(",")[1].equals(usuario)
                        && programas[i].split(",")[0].equals(contrasena)) {
                    return true;
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
