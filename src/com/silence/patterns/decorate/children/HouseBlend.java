package com.silence.patterns.decorate.children;

import com.silence.patterns.decorate.father.Beverage;

/**
 * Created by zhuxiang on 2016/11/27.
 * Desc :
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
