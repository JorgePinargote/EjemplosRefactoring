/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicate;

/**
 *
 * @author Jorge Pinargote
 */
public class Duplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String dificultad="";
        int cantidad = 2;// un randon
        
        
        if(dificultad.equals("facil")){
            cantidad = cantidad * 3;
            System.out.println("cantidad para facil:" + cantidad);
            
        }else if(dificultad.equals("medio")){
            cantidad = cantidad * 6;
            System.out.println("cantidad para medio:" + cantidad);
        }else{
            cantidad = cantidad * 9;
            System.out.println("cantidad para dificil:" + cantidad);
        }
        
        
        
        if(dificultad.equals("facil")){
            configurarDificultad(cantidad,3,"facil");
            
        }else if(dificultad.equals("medio")){
            configurarDificultad(cantidad,6,"medio");
        }else{
            configurarDificultad(cantidad,9,"dificil");
        }
        
        
        
        
        
    }
    
    //Extrayendo metodo 
    public static void configurarDificultad(int cantidad,int factor, String nivel){
            cantidad = cantidad * factor ;
            System.out.println("cantidad para" + nivel +":"+ cantidad);
        }
    
}
