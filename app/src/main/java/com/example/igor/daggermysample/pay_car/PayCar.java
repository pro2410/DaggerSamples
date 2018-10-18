package com.example.igor.daggermysample.pay_car;

import javax.inject.Inject;

public class PayCar {
    private final Bank bank;
    private final Shop shop;

    @Inject
    public PayCar(Bank bank, Shop shop) {
        this.bank = bank;
        this.shop = shop;
    }

    public String payCar() {
        int money = bank.getMonney();
        shop.payCar(money);
        return "pay car for ".concat(String.valueOf(money));
    }
}
