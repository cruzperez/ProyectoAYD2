/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import acceso.GestionPrograma;
import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class ModuloProgramas {

    private GestionPrograma prog = new GestionPrograma();

    public boolean modificarPrograma(int id, String nombre) {
        try {
            prog.modificarPrograma(id, nombre);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean nuevoPrograma(String nombre) {
        try {
            System.out.println("llego aqui");
            prog.insertarPrograma(nombre);
            return true;
        } catch (Exception e) {
            System.out.println("trono");
            return false;
        }
    }

    public boolean borrarPrograma(String nombre) {
        try {
            prog.borrarPrograma(nombre);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarPrograma(int id) {
        try {
            prog.borrarPrograma(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList obtenerProgramas() {
        try {
            String[] programas = prog.retornarProgramas().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i < programas.length; i++) {
                ids.add(programas[i].split(",")[0]);
            }
            return ids;
        } catch (Exception e) {
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }

    public ArrayList obtenerProgramasNombre() {
        try {
            String[] programas = prog.retornarProgramas().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i < programas.length; i++) {
                ids.add(programas[i].split(",")[1]);
            }
            return ids;
        } catch (Exception e) {
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }

    public boolean modificarProgramaSalon(int id, int id2, int nombre, int nombre2) {
        try {
            prog.modificarProgramaSalon(id, id2, id, id2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean nuevoProgramaSalon(String nombre, String nombre2) {
        try {
            prog.insertarProgramaSalon(nombre, nombre2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarProgramaSalon(String nombre, String nombre2) {
        try {
            prog.borrarProgramaSalon(nombre, nombre2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarProgramaSalon(int id, int id2) {
        try {
            prog.borrarProgramaSalon(id, id2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
