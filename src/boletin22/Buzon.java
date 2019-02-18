/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author Samuel
 */
public class Buzon{

    private ArrayList<Correo> al;

    public Buzon(ArrayList<Correo> al) {
        this.al = al;
    }


    
    
    public int numCorreos() {
        return al.size();
    }

    public void engade(Correo c) {
        al.add(c);
    }

    public boolean porLer() {
        boolean comprobar = true;
        for (Correo c : al) {
            if (c.isTick() == false) {
                comprobar = false;
            }
        }
        return comprobar;
    }


public String amosarPrimerNoLeido(){
        for(Correo c : al){
            if(c.isTick()==false){
                return c.getMensaje();
            }
        }
        return "Ya has leido los mensajes";
}
    

    public String amosa(int k) {
   return al.get(k).getMensaje(); //primero se coge el numero y luego se usa para coger el mensaje
    }

    public void elimina(int k) {
    al.remove(k);
    }
}