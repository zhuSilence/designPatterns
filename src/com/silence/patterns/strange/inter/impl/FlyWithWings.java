package com.silence.patterns.strange.inter.impl;

import com.silence.patterns.strange.inter.FlyBehavior;

/**
 * Created by zhuxiang on 2016/11/20.
 * Desc :
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}
