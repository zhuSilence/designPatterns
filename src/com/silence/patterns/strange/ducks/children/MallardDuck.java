package com.silence.patterns.strange.ducks.children;

import com.silence.patterns.strange.ducks.Duck;
import com.silence.patterns.strange.inter.FlyBehavior;
import com.silence.patterns.strange.inter.QuackBehavior;

/**
 * Created by zhuxiang on 2016/11/20.
 * Desc :
 */
public class MallardDuck extends Duck {
    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void display() {
        System.out.println("I'm MallardDuck...");
    }
}
