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
class Cage {
    private final Animal animal;
    private final Fence fence;
    
    @Inject Cage(Animal animal, Fence fence){
        this.animal = animal;
        this.fence = fence;
    }
    
    public void showCase(){
        fence.repair();
        animal.wake();
        animal.eat();
        
    }
    
    
}
