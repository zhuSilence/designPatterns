package com.silence.patterns.decorate;

import com.silence.patterns.decorate.children.Espresso;
import com.silence.patterns.decorate.decorator.Mocha;
import com.silence.patterns.decorate.father.Beverage;

/**
 * Created by zhuxiang on 2016/11/27.
 * Desc :
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "|" + beverage.cost());

        Beverage beverage2 = new Mocha(beverage);
        System.out.println(beverage2.getDescription() + "|" + beverage2.cost());
    }
}
