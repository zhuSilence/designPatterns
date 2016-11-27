package com.silence.patterns.decorate.decorator;

import com.silence.patterns.decorate.father.Beverage;
import com.silence.patterns.decorate.father.CondimentDecorator;

/**
 * Created by zhuxiang on 2016/11/27.
 * Desc :
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
