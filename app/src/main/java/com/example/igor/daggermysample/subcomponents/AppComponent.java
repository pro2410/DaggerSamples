package com.example.igor.daggermysample.subcomponents;

import dagger.Component;

import javax.inject.Singleton;

@Component(modules = {DataModule.class, AppModule.class})
@Singleton
public interface AppComponent {
    String getHardString();

    ChatComponent.Builder chatComponentBuilder();

}
