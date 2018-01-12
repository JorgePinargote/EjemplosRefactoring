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
public class Perro extends Animal {
    Animal animal;
    String raza;
    String docPedigree;

    public Perro(Boolean vertebrado, String clase, double tamaño, String raza, String doc) {
        super(vertebrado, clase, tamaño);
        this.raza=raza;
        this.docPedigree=doc;
    }

    @Override
    public String toString() {
        return  super.toString() + "raza:" + this.raza + "documento de pedegree" + this.docPedigree;
    }
    
    
   
    
    
    
}
