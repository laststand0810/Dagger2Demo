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
    public interface ZooComponent{
        Cage caging();
    }
    
    public static void main(String[] args){
        ZooComponent zoo = DaggerZooApp_ZooComponent.builder().build();
        zoo.caging().showCase();
    }
}
