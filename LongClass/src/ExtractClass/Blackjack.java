/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtractClass;

import longclass.*;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jorge Pinargote
 */
public class Blackjack {
   private Player player;
   private Player dealer;
   public boolean didPlayerWin() {
      return player.getHandTotal() > dealer.getHandTotal();
   }

}
