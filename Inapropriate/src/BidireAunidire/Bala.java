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
public class Bala {
    int id;
    int calibre;
    Target target;

    public Bala(int calibre, Target target) {
        this.calibre = calibre;
        this.target = target;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    
    
    
}
