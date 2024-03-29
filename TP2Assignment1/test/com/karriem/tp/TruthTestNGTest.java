/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.tp;

import com.configfile.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Karriem
 */
public class TruthTestNGTest {
    
    private static TruthInterface tInt;
    private static AssertTruth aTruth;
    private static ApplicationContext ctx;
    
    public TruthTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testTruth(){
        
        System.out.println("truth()");
        boolean yes = aTruth.truth();
        assertTrue(yes);        
    }    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        tInt = (AssertTruth)ctx.getBean("AssertTruth");
        aTruth = new AssertTruth();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
