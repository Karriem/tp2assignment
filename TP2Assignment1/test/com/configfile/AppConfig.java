/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.configfile;

import com.karriem.tp.AssertFloat;
import com.karriem.tp.AssertInt;
import com.karriem.tp.FloatInterface;
import com.karriem.tp.IntInterface;
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
}
