/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import acceso.*;
/**
 *
 * @author cruz
 */
public class ModuloLaboratorio {
    
    private GestionLaboratorio lab = new GestionLaboratorio();
    
    public boolean reservarSalon(int id, String salon, int capacidad){
        try{
            
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean nuevoSalon(String salon, int capacidad){
        try{
            return true;
        }catch(Exception e){
            return false;
        }
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
