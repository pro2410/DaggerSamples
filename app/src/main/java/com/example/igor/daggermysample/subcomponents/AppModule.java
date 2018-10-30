package com.example.igor.daggermysample.subcomponents;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public String anyString() {
        return "HARD";
    }
}
