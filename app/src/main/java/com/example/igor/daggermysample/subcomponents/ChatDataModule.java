package com.example.igor.daggermysample.subcomponents;

import dagger.Module;
import dagger.Provides;

@Module
public class ChatDataModule {

    @Provides
    public IChatDataRepo chatDataModule(IDataRepo dataRepo) {
        return new ChatDataRepo();
    }
}
