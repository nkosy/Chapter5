/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.chapter5.creational.factorymethod.service.impl;

import com.nkosy.chapter5.creational.factorymethod.service.Animal;

/**
 *
 * @author nkosy
 */
public class Cat extends Animal {

    @Override
    public String makeSound() {
        return "Meow";
    }
    
}
