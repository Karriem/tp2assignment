/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.tp;

/**
 *
 * @author Karriem
 */
public class AssertEquality implements AssertEqualityInterface {
    
    @Override
    public String lWord(){
        
        String word = "Bankai";
        System.out.println("String equals " +word);
        
        return word;
    }
    
}
