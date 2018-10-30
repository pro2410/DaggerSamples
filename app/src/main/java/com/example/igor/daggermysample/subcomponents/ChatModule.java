package com.example.igor.daggermysample.subcomponents;

import dagger.Binds;
import dagger.Module;

@Module
public interface ChatModule {

    @Binds
    IChatInteractor chatInteractor(ChatInteractor interactor);
}
