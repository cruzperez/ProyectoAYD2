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
    
    public boolean nuevoSalon(int id, String salon, int capacidad){
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
    
    public String obtenerSalones(){
        return "";
    }
    
    public boolean reservarLaboratorio(String salon, int dia0, int dia1, 
            int mes0, int mes1, int anno0, int anno1, int hora0, int hora1, 
            String encargado){
        try{
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
}
