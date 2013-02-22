/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.configfile;

import com.karriem.tp.AssertFalse;
import com.karriem.tp.AssertFloat;
import com.karriem.tp.AssertInt;
import com.karriem.tp.AssertTruth;
import com.karriem.tp.FalseInterface;
import com.karriem.tp.FloatInterface;
import com.karriem.tp.IntInterface;
import com.karriem.tp.TruthInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author 211111279
 */
@Configuration
public class AppConfig {
    
    @Bean(name = "AssertFloat")
    public FloatInterface add(){
        return new AssertFloat();
    }
    
    @Bean(name = "AssertInt")
    public IntInterface addition(){
        return new AssertInt();
    }
    
    @Bean(name = "AssertTruth")
    public TruthInterface truth(){
        return new AssertTruth();
    }
    
    @Bean(name = "AssertFalse")
    public FalseInterface notFalse(){
        return new AssertFalse();
    }
}
