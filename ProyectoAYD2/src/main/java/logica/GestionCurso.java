/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import acceso.GestionLaboratorio;

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
    
    public String obtenerCursos(){
        try{
            return lab.retornarCursos();
        }catch(Exception e){
            return "error";
        }
    }
}
