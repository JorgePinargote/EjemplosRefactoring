/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReemplazarDelHer;

import feature.*;

/**
 *
 * @author Jorge Pinargote
 */
public class Animal {
    Boolean vertebrado;
    String clase;
    double tamaño;

    public Animal(Boolean vertebrado, String clase, double tamaño) {
        this.vertebrado = vertebrado;
        this.clase = clase;
        this.tamaño = tamaño;
    }

    
    
    @Override
    public String toString() {
        return "Animal{" + "vertebrado=" + vertebrado + ", clase=" + clase + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
    
}
