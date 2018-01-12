/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longclass;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jorge Pinargote
 */
public class Blackjack {
   private List playerHand;
   private List dealerHand;
   
   public boolean didPlayerWin() {
      return getHandTotal(playerHand) > getHandTotal(dealerHand);
   }
   
   private int getHandTotal(List hand) {
      int total = 0;
      Iterator iCard = hand.iterator();
      while (iCard.hasNext()) {
         Card card = (Card)iCard.next();
         total += card.valor;
      }
      return total;
   }
}
