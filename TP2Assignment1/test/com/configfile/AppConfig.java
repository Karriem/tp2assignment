/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.configfile;

import com.karriem.tp.AssertFloat;
import com.karriem.tp.FloatInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author 211111279
 */
@Configuration
public class AppConfig {
    
    @Bean(name = "Hello")
    public FloatInterface add(){
        return new AssertFloat();
    }
}
