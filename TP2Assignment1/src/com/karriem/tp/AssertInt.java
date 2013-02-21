/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.tp;

/**
 *
 * @author Karriem
 */
public class AssertInt implements IntInterface {
    
    @Override
    public int addition(){
        
        int resultA = 2 + 12;
        System.out.println("Addition value " +resultA);
        return resultA;
    }
}
