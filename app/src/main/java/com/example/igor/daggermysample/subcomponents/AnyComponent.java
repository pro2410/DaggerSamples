package com.example.igor.daggermysample.subcomponents;

import dagger.Subcomponent;

import javax.inject.Singleton;

@Subcomponent
public interface AnyComponent {

    @Subcomponent.Builder
    interface Builder {
        //        AnyComponent.Builder anyComponent();
        AnyComponent build();
    }

    String hardString();

    IChatDataRepo chatRepo();


}
