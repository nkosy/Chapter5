/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.chapter5.creational.factorymethod;

import com.nkosy.chapter5.config.AppConfig;
import com.nkosy.chapter5.creational.factorymethod.service.Animal;
import com.nkosy.chapter5.creational.factorymethod.service.impl.AnimalFactory;
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
public class TestFactoryMethod {
    AnimalFactory animalFactory;
    public TestFactoryMethod() {
    }
    
    @Before
    public void setUp() {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        animalFactory= (AnimalFactory)ctx.getBean("factoryMethod");
    }
    
    @Test
    public void testFactoryMethod(){
        Animal a1 = animalFactory.getAnimal("feline");
        Animal a2 = animalFactory.getAnimal("canine");
        
        assertEquals("Woof", a2.makeSound());
        assertEquals("Meow", a1.makeSound());
        
    }
    
    @After
    public void tearDown() {
    }
    
}
