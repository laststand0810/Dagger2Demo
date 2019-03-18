/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.zoo;

import dagger.Component;
import javax.inject.Singleton;

/**
 *
 * @author nguyenpham
 */

public class ZooApp{

    /**
     *
     */
    @Singleton
    @Component(modules = {LionCageModule.class})
    public interface LionCageComponent{
        Cage caging();
    }
    
    @Singleton
    @Component(modules = {BearCageModule.class})
    public interface BearCageComponent{
        Cage caging();
    }
    
    public static void main(String[] args){
        LionCageComponent lionCage = DaggerZooApp_LionCageComponent.builder().build();
        lionCage.caging().showCase();
        BearCageComponent bearCage = DaggerZooApp_BearCageComponent.builder().build();
        bearCage.caging().showCase();
    }
}
