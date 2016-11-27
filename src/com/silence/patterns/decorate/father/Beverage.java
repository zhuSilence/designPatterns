package com.silence.patterns.decorate.father;

/**
 * Created by zhuxiang on 2016/11/27.
 * Desc :
 */
public abstract class Beverage {
    protected String description = "unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
