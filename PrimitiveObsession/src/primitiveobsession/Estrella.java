/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveobsession;

/**
 *
 * @author Jorge Pinargote
 *  
 */
public class Estrella {
   String nombre;
   String constelacion;
   int masa;

    public Estrella(String nombre, String Constelacion, int Masa) {
        this.nombre = nombre;
        this.constelacion = Constelacion;
        this.masa = Masa;
    }
   
    @Override
    public String toString() {
        return "Estrella:" + "nombre=" + nombre + ", Constelacion=" + constelacion + ", Masas solares=" + masa;
    }
   
   
    
}
