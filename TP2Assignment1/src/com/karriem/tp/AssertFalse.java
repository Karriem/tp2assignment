/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.tp;

/**
 *
 * @author Karriem
 */
public class AssertFalse implements FalseInterface {
    
    private boolean tpIsBoring;
    
    @Override
    public boolean notFalse(){
        
        tpIsBoring = false;
        
        return tpIsBoring;
    }
}
