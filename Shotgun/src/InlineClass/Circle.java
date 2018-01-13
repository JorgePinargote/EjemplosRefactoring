/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InlineClass;

import shotgun.*;
import java.awt.Color;

/**
 *
 * @author Jorge Pinargote
 */
public class Circle {
  private Color myColor;

    public Circle(Color c)
    {
        myColor = c;
        InitPainter(myColor);
    }

    private void InitPainter(Color color)
    {
        //init painter
    }
}
