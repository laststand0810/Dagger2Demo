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
public class ElectricalFence implements Fence{
    boolean isDamaged = true;
    private final Animal animal;
    
    @Inject
    ElectricalFence(Animal animal){
        this.animal = animal;
    }
    @Override
    public void repair() {
        if(this.isDamaged){
            System.out.print("Fence is repairing...\nFence is repaired.\n");
        }
    }

    @Override
    public boolean isDamaged() {
        return isDamaged;
    }
    
}
