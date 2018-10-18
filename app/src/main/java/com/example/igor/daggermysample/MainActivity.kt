package com.example.igor.daggermysample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.igor.daggermysample.Example_1_Dagger2.BraavosModule
import com.example.igor.daggermysample.Example_1_Dagger2.DaggerBattleComponent
import com.example.igor.daggermysample.pay_car.DaggerPayCarComponent
import kotlinx.android.synthetic.main.activity_main.*
import com.example.igor.daggermysample.Example_1_Dagger2.Soldiers
import com.example.igor.daggermysample.Example_1_Dagger2.Cash



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cash = Cash()
        val soldiers = Soldiers()

        val component = DaggerBattleComponent
            .builder()
            .braavosModule(BraavosModule(cash, soldiers))
            .build()
        component.cash
        component.soldiers

        val war = component.war
        war.prepare()
        val report = war.report()

        val componentPayCar = DaggerPayCarComponent.create()
        val payCar = componentPayCar.payCar.payCar()

        val hello = "$payCar\n$report"
        tv.text = hello
    }
}
