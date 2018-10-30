package com.example.igor.daggermysample.subcomponents;

import dagger.Subcomponent;

@Subcomponent(modules = {ChatModule.class, ChatDataModule.class})
public interface ChatComponent {
    @Subcomponent.Builder
    interface Builder{
        ChatComponent build();
    }

    IChatInteractor chatInteractor();
    IDataRepo datarepo();
    AnyComponent.Builder anyComponentBuilder();
}
