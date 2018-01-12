/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemplazarHerDele;

import refusedbequest.*;

/**
 *
 * @author Jorge Pinargote
 * 
 * Se reemplaza la herencia con delegacion ya que la clase persona no necesita todas las caracteristicas de la clase Tax
 */
public class Person {
    Tax taxes;
    

  public double GetTaxAmount() {  
        double tax = taxes.CalculateBaseTax();  
        double taxAmount =  taxes.AddTax(tax);  
        return taxAmount;  
    }  
}
