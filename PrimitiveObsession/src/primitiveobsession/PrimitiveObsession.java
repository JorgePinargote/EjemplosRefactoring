/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveobsession;

/**
 *
 * @author Jorge Pinargote
 */
public class PrimitiveObsession {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] Estrella  = new String[3];
            Estrella[0] = "VY Canis Majoris";
            Estrella[1] = "canis maior";
            Estrella[2] = "1420 Masas Solares";
            System.out.println("Estrella:" + "nombre=" + Estrella[0] + ", Constelacion=" + Estrella[1] + ", Masa=" + Estrella[2]+"\n");
            
            // versus
            
            Estrella canis = new Estrella("VY Canis Majoris","canis maior",1420);
            System.out.println(canis.toString());
            
            
    }
    
}
