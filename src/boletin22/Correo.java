/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

/**
 *
 * @author Samuel
 */
public class Correo {
    String mensaje;
    boolean tick;

    public Correo(String mensaje, boolean tick) {
        this.mensaje = mensaje;
        this.tick = tick;
    }

    
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isTick() {
        return tick;
    }

    public void setTick(boolean tick) {
        this.tick = tick;
    }

    @Override
    public String toString() {
        return "mensaje=" + mensaje + " Valor=" + tick + '}';
    }
    
}
