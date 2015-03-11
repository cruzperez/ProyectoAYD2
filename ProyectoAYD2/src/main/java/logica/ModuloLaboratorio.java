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
    
    public boolean modificarSalon(int id, String salon, int capacidad){
        try{
            lab.modificarSalon(id, salon, capacidad);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean nuevoSalon(String salon, int capacidad){
        try{
            lab.insertarSalon(salon, capacidad);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean borrarSalon(String salon){
        try{
            lab.borrarSalon(salon);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean borrarSalon(int id){
        try{
            lab.borrarSalon(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public ArrayList obtenerSalones(){
        try{
            String[] salones = lab.retornarSalones().split("/");
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
    
    public ArrayList obtenerSalonesNombre(){
        try{
            String[] salones = lab.retornarSalones().split("/");
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
    
    public ArrayList obtenerSalonesCapacidad(){
        try{
            String[] salones = lab.retornarSalones().split("/");
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
    
    public boolean ReservarLaboratorio(String salon, int dia0, int dia1, 
            int mes0, int mes1, int anno0, int anno1, int hora0, int hora1, 
            String encargado){
        try{
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
}
