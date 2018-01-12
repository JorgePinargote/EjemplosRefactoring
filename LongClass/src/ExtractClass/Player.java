/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtractClass;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jorge Pinargote
 */
public class Player {
    private List hand;
   public int getHandTotal() {
      int total = 0;
      Iterator iCard = hand.iterator();
      while (iCard.hasNext()) {
         Card card = (Card)iCard.next();
         total += card.valor;
      }
      return total;
    }
   
}
