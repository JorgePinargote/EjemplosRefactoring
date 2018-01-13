/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shotgun;

import java.awt.Color;

/**
 *
 * @author Jorge Pinargote
 */
public class Circle {
    private Painter myPainter;

    public Circle(Color c)
    {
        myPainter = new Painter(c);
    }
}
