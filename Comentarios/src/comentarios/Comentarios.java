/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comentarios;

/**
 *
 * @author Jorge Pinargote
 */
public class Comentarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor=15;
        int taxes=16;
        int descuento=15;
        
        if(valor>5 && valor<100 && taxes<15 && descuento>15 ){
            // Si el articulo es accesible podria comprarse
            System.out.println("comprar");
        }
        
        // Extraer variable 
        
        boolean accesible = valor>5 && valor<100 && taxes<15 && descuento>15;
        if(accesible){
            System.out.println("comprar");
        }
        
    }
    
}
