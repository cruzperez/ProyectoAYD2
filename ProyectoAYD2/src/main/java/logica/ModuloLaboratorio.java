/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import acceso.GestionLaboratorio;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author cruz
 */
public class ModuloLaboratorio {

    private GestionLaboratorio lab = new GestionLaboratorio();

    public boolean modificarSalon(int id, String salon, int capacidad) {
        try {
            lab.modificarSalon(id, salon, capacidad);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean nuevoSalon(String salon, int capacidad) {
        try {
            lab.insertarSalon(salon, capacidad);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarSalon(String salon) {
        try {
            lab.borrarSalon(salon);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarSalon(int id) {
        try {
            lab.borrarSalon(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList obtenerSalones() {
        try {
            String[] salones = lab.retornarSalones().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i < salones.length; i++) {
                ids.add(salones[i].split(",")[0]);
            }
            return ids;
        } catch (Exception e) {
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }

    public ArrayList obtenerSalonesNombre() {
        try {
            String[] salones = lab.retornarSalones().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i < salones.length; i++) {
                ids.add(salones[i].split(",")[1]);
            }
            return ids;
        } catch (Exception e) {
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }

    public ArrayList obtenerSalonesCapacidad() {
        try {
            String[] salones = lab.retornarSalones().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i < salones.length; i++) {
                ids.add(salones[i].split(",")[2]);
            }
            return ids;
        } catch (Exception e) {
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }

    public boolean modificarTRecurso(int id, String nombre) {
        try {
            lab.modificarTRecurso(id, nombre);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean nuevoTRecurso(String nombre) {
        try {
            lab.insertarTRecurso(nombre);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarTRecurso(String nombre) {
        try {
            lab.borrarTRecurso(nombre);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarTRecurso(int id) {
        try {
            lab.borrarTRecurso(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList obtenerTRecursos() {
        try {
            String[] trecursos = lab.retornarTRecurso().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i < trecursos.length; i++) {
                ids.add(trecursos[i].split(",")[0]);
            }
            return ids;
        } catch (Exception e) {
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }

    public ArrayList obtenerTRecursosNombre() {
        try {
            String[] trecurso = lab.retornarTRecurso().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i < trecurso.length; i++) {
                ids.add(trecurso[i].split(",")[1]);
            }
            return ids;
        } catch (Exception e) {
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }

    public boolean modificarRecurso(int id, String nombre, int id2) {
        try {
            lab.modificarRecurso(id, nombre, id2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean nuevoRecurso(String nombre, int id2) {
        try {
            lab.insertarRecurso(nombre, id2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarRecurso(String nombre) {
        try {
            lab.borrarRecurso(nombre);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarRecurso(int id) {
        try {
            lab.borrarRecurso(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList obtenerRecursos() {
        try {
            String[] recursos = lab.retornarRecurso().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i < recursos.length; i++) {
                ids.add(recursos[i].split(",")[0]);
            }
            return ids;
        } catch (Exception e) {
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }

    public ArrayList obtenerRecursosNombre() {
        try {
            String[] recurso = lab.retornarRecurso().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i < recurso.length; i++) {
                ids.add(recurso[i].split(",")[1]);
            }
            return ids;
        } catch (Exception e) {
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }

    public boolean modificarRecursoSalon(int id, int id2, int nombre, int nombre2, int nombre3) {
        try {
            lab.modificarRecursoSalon(id, id2, nombre, nombre2, nombre3);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean nuevoRecursoSalon(String nombre, String nombre2, String nombre3) {
        try {
            lab.insertarRecursoSalon(nombre, nombre2, nombre3);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarRecursoSalon(String nombre, String nombre2) {
        try {
            lab.borrarRecursoSalon(nombre, nombre2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarRecursoSalon(int id, int id2) {
        try {
            lab.borrarRecursoSalon(id, id2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList obtenerRecursosCapacidad() {
        try {
            String[] recurso = lab.retornarRecursoSalon().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i < recurso.length; i++) {
                ids.add(recurso[i].split(",")[0]);
            }
            return ids;
        } catch (Exception e) {
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }

    public boolean modificarCursoSalon(int id, int id2, int nombre, int nombre2) {
        try {
            lab.modificarCursoSalon(id, id2, nombre, nombre);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean nuevoCursoSalon(String nombre, String nombre2) {
        try {
            lab.insertarCursoSalon(nombre, nombre2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarCursoSalon(String nombre, String nombre2) {
        try {
            lab.borrarCursoSalon(nombre, nombre2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarCursoSalon(int id, int id2) {
        try {
            lab.borrarCursoSalon(id, id2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean reservarLaboratorio(String fechainicio, String horainicio, 
            String horafin, String encargado, String estado, int salon) {
        try {
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
