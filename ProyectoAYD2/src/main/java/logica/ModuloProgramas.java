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
    
    public boolean modificarPrograma(int id, String salon, int capacidad){
        try{
            prog.modificarPrograma(id, salon, capacidad);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean nuevoPrograma(String salon, int capacidad){
        try{
            prog.insertarPrograma(salon, capacidad);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean borrarPrograma(String salon){
        try{
            prog.borrarPrograma(salon);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean borrarPrograma(int id){
        try{
            prog.borrarPrograma(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public ArrayList obtenerProgramas(){
        try{
            String[] salones = prog.retornarProgramas().split("/");
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
    
    public ArrayList obtenerProgramasNombre(){
        try{
            String[] salones = prog.retornarProgramas().split("/");
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
    
    public ArrayList obtenerProgramasCapacidad(){
        try{
            String[] salones = prog.retornarProgramas().split("/");
            ArrayList ids = new ArrayList();
            for (int i = 0; i<salones.length;i++){
                ids.add(salones[i].split(",")[2]);
            }
            return ids;
        }catch(Exception e){
            ArrayList fail = new ArrayList();
            fail.add("- no items -");
            return fail;
        }
    }

    
}
