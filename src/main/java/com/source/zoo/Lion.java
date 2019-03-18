/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.zoo;

import javax.inject.Inject;

/**
 *
 * @author nguyenpham
 */
public class Lion implements Animal{
    
    boolean isHungy;
    @Override
    public void eat() {
        System.out.print("Lion is eating...\nLion is full.\n");
        this.isHungy = false;
    }

    @Override
    public void wake() {
        System.out.print("Lion awaken.\n");
    }

    @Override
    public boolean isHungry() {
        return isHungy;
    }
    
}
