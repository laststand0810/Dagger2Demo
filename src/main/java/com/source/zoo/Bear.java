/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.zoo;

/**
 *
 * @author nguyenpham
 */
public class Bear implements Animal {

    boolean isHungy;

    @Override
    public void eat() {
        System.out.print("Bear is eating...\nBear is full.\n");
        this.isHungy = false;
    }

    @Override
    public void wake() {

        System.out.print("Bear awaken.\n");
    }

    @Override
    public boolean isHungry() {
        return isHungy;
    }

}
