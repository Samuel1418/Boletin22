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
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Correo> al = new ArrayList<Correo>();
        Buzon obx = new Buzon(al);
         Correo prueba1= new Correo("hola",true);
         Correo prueba2= new Correo("adios",false);
         
        obx.engade(prueba2);
        obx.engade(prueba1);
        System.out.println(obx.numCorreos());
        System.out.println(obx.porLer());
        System.out.println(obx.amosarPrimerNoLeido());
        obx.elimina(0);
        System.out.println(obx.numCorreos());
}
}