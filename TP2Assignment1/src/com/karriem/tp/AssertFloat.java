/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.tp;

/**
 *
 * @author 211111279
 */
public class AssertFloat implements FloatInterface {
    
    @Override
    public double add()
    {
        double result = 3.5 + 5.4;
        System.out.println("Float value" +result);
        return result;
    }
    
}
