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
public class Tax {
    protected double CalculateBaseTax()   {  
        return 0.00;
    }  
  
    protected double AddTax(double tax) {  
        return tax*45;
    }  
  
    public double GetTaxAmount() {  
        double tax = CalculateBaseTax();  
        double taxAmount =  AddTax(tax);  
        return taxAmount;  
    }  
    
    protected double BalanceAnualTax(double tax) {  
        return tax * 0.98;
    }  
}
