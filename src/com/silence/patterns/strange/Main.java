package com.silence.patterns.strange;

import com.silence.patterns.strange.ducks.Duck;
import com.silence.patterns.strange.ducks.children.MallardDuck;
import com.silence.patterns.strange.inter.impl.FlyNoWay;
import com.silence.patterns.strange.inter.impl.FlyRocketPowered;
import com.silence.patterns.strange.inter.impl.Squeak;

public class Main {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck(new Squeak(), new FlyNoWay());
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }
}
