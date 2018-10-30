package com.example.igor.daggermysample.subcomponents;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {
    @Provides
    public IDataRepo repo() {
        return new DataRepo();
    }
}
