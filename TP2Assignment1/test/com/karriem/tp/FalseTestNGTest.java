/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.tp;

import com.configfile.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
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
public class FalseTestNGTest {
    
    private static AssertFalse aFalse;
    private static FalseInterface fInt;
    private static ApplicationContext ctx;
    
    public FalseTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testFalse(){
        
        System.out.println("AssertFalse()");
        boolean no = aFalse.notFalse();
        assertFalse(no);
    }
    
    @Test
    public void TestFailDelib() {

        Assert.fail("Failed delibrately");
    }
    
    @Test (enabled = false)
    public void TestIgnore() {

        Assert.fail("Failed delibrately");
    }
    
    @Test (timeOut = 1)
    public void TestTimeOut() {

        
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        fInt = (AssertFalse)ctx.getBean("AssertFalse");
        aFalse = new AssertFalse();
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
