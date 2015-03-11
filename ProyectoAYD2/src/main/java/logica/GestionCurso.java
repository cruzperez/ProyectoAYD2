/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import acceso.GestionLaboratorio;
import java.util.ArrayList;

/**
 *
 * @author cruz
 */
public class GestionCurso {
    
    private GestionLaboratorio lab = new GestionLaboratorio();
    
    public boolean modificarCurso(int id, String curso){
        try{
            lab.modificarCurso(id, curso);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean nuevoCurso(String curso){
        try{
            lab.insertarCurso(curso);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean borrarCurso(String curso){
        try{
            lab.borrarCurso(curso);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean borrarCurso(int id){
        try{
            lab.borrarCurso(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public ArrayList obtenerCursos(){
        try{
            String[] salones = lab.retornarCursos().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i<salones.length;i++){
                ids.add(salones[i].split(",")[0]);
            }
            return ids;
        }catch(Exception e){
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }
    
    public ArrayList obtenerCursosNombre(){
        try{
            String[] salones = lab.retornarCursos().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i<salones.length;i++){
                ids.add(salones[i].split(",")[1]);
            }
            return ids;
        }catch(Exception e){
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }
}
