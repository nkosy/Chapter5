/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.chapter5.creational.singleton;

import com.nkosy.chapter5.creational.singleton.service.impl.SingletonExample;
import com.nkosy.chapter5.config.AppConfig;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author 212018183
 */
public class SingletonTest {
    SingletonExample obj;
    public SingletonTest() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        obj= (SingletonExample)ctx.getBean("singletonTest");

    }
    
    @Test
    public void TestSingleton (){
        assertEquals("Hello", obj.sayHello());
    }
    
    @After
    public void tearDown() {
    }
    
}
