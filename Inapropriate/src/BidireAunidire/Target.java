/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BidireAunidire;

import inapropriate.*;

/**
 *
 * @author Jorge Pinargote
 */
public class Target {
    int coordenadax;
    int coordenaday;
    int radio;
   

    public Target(int coordenadax, int coordenaday, int radio) {
        this.coordenadax = coordenadax;
        this.coordenaday = coordenaday;
        this.radio = radio;
    }
    
    
    public void takeCareof(Bala bala){
        System.out.println("Bala id:" + bala.getId());
    }
    
    
}
