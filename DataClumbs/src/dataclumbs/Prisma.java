/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataclumbs;

/**
 *
 * @author Jorge Pinargote
 */
public class Prisma {
    double base;
    double altura;
    double profundidad;   
    
    

    public Prisma(double base, double altura, double profundidad) {
        this.base = base;
        this.altura = altura;
        this.profundidad=profundidad;
    }
   
    // Metodo que recibe todas los atributos
    public boolean mayorVolumen(double base, double altura, double profundidad){
        double volumen = this.base * this.altura * this.altura;
        return (calcularVolumen() > volumen);
    }
    
    
    //despues, se añade un metodo que preserve todo el objeto
    public boolean MayorVolumen(Prisma rect){
        return calcularVolumen()>rect.calcularVolumen();// en este caso ganamos el reusar codigo.
    }
    
    
    public double calcularVolumen(){
        return this.base * this.altura * this.altura;
    }
}
