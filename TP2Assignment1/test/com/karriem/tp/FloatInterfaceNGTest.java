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
 * @author 211111279
 */
public class FloatInterfaceNGTest {
    private static FloatInterface flt;
    private static AssertFloat aFloat;
    private static ApplicationContext ctx;
    
    public FloatInterfaceNGTest() {
    }
    
    @Test
    public void testAdd(){
        System.out.print("add()");
        double result = aFloat.add();
        assertEquals(result, 8.9);
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        flt = (AssertFloat)ctx.getBean("AssertFloat");
        aFloat = new AssertFloat();
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
