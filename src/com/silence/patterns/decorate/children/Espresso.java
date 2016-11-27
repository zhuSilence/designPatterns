package com.silence.patterns.decorate.children;

import com.silence.patterns.decorate.father.Beverage;

/**
 * Created by zhuxiang on 2016/11/27.
 * Desc :
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
