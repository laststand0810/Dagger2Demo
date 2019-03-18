/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.zoo;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author nguyenpham
 */
@Module (includes = ElectricalFenceModule.class)
class LionCageModule {
    @Provides
    static Animal provideAnimal(){
        return new Lion();
    }
}
