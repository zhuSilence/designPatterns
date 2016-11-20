package com.silence.patterns.strange.inter.impl;

import com.silence.patterns.strange.inter.QuackBehavior;

/**
 * Created by zhuxiang on 2016/11/20.
 * Desc :
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("MuteQuack...");
    }
}
