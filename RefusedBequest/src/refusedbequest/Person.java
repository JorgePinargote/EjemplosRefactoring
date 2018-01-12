/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refusedbequest;

/**
 *
 * @author Jorge Pinargote
 */
public class Person extends Tax {
    
  @Override
  public double GetTaxAmount() {  
        double tax = CalculateBaseTax();  
        double taxAmount =  AddTax(tax);  
        return taxAmount;  
    }  
}
