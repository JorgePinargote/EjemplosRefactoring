/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feature;

/**
 *
 * @author Jorge Pinargote
 */
public class Perro {
    Animal animal;
    String raza;
    String docPedegree;

    public Perro(Animal animal, String raza, String docPedegree) {
        this.animal = animal;
        this.raza = raza;
        this.docPedegree = docPedegree;
    }

    @Override
    public String toString() {
        return animal.toString() + ", raza=" + raza + ", docPedegree=" + docPedegree + '}';
    }

    
}
