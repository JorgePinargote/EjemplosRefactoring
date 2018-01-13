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
public class DataClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(40,50);
        
        int area = (triangulo.base * triangulo.altura)/2;
        System.out.println("base:" + triangulo.base + " altura: " + triangulo.altura + " area: " + area);
        
        
        
        ///versus extrayendo metodo del area, el de imprimir y moviendolos a la antes data class triangulo
        Triangulo triangulorefact = new Triangulo(40,50);
        triangulorefact.ShowCaracteristicas();
    }
    
}
