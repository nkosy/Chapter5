/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.chapter5.config;

import com.nkosy.chapter5.creational.factorymethod.service.impl.AnimalFactory;
import com.nkosy.chapter5.creational.singleton.service.impl.SingletonExample;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author 212018183
 */
public class AppConfig {
    @Bean(name = "singletonTest")
    public SingletonExample getSingletonService() {
        return SingletonExample.getInstance();
    }
    
    @Bean(name = "factoryMethod")
    public AnimalFactory getFactoryService() {
        return AnimalFactory.getInstance();
    }
    
}
