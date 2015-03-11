/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;


import java.util.Vector;

/**
 *
 * @author cruz
 */
public class ComboValues {
    public Vector getValues(Input i){
        Vector v = new Vector<String>();
        if(i.getInput()==0)
            v.add("worked");
        else
           v.add("it hurts");
        return v;
    }
}
