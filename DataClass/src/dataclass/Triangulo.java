/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataclass;

/**
 *
 * @author Jorge Pinargote
 */
public class Triangulo {
    int base;
    int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    //Despues 
    // Dandole responsabilidades que deberia soportar
    
    public int area(){
        return (this.altura*this.base)/2;
    }

  
    public String ShowCaracteristicas() {
        return "base: " + base + ", altura: " + altura + "area:" + area();
    }
    
    
   
    
}
