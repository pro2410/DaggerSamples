package com.example.igor.daggermysample.pay_car;

import javax.inject.Inject;

public class Shop {

    @Inject
    public Shop() {
    }

    public void payCar(int money) {
        System.out.println("be..be!!");
    }
}
