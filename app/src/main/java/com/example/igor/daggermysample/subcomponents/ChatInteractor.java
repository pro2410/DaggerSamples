package com.example.igor.daggermysample.subcomponents;

import javax.inject.Inject;

public class ChatInteractor implements IChatInteractor {

    @Inject
    public ChatInteractor(String hard, IChatDataRepo dataRepo) {
    }
}
