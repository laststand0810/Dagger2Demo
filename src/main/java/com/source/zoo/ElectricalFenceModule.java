/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.zoo;

import dagger.Binds;
import dagger.Module;

/**
 *
 * @author nguyenpham
 */
@Module
abstract class ElectricalFenceModule {
    @Binds
    abstract Fence provideFence(ElectricalFence fence);
}
