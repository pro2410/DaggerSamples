package com.example.igor.daggermysample.pay_car;

import javax.inject.Inject;

public class Bank {

    @Inject
    public Bank() {
    }

    public int getMonney() {
        return 700_000;
    }
}
