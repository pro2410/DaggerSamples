package com.example.igor.daggermysample.Example_1_Dagger2;

import dagger.Component;

@Component(modules = BraavosModule.class)
public interface BattleComponent {
    War getWar();
    Cash getCash();
    Soldiers getSoldiers();
}
