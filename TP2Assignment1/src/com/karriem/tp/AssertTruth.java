/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.tp;

/**
 *
 * @author Karriem
 */
public class AssertTruth implements TruthInterface {
   
    private boolean tpIsFun;
    
    @Override
    public boolean truth(){
        
        tpIsFun = true;
        
        return tpIsFun;
    }
}
