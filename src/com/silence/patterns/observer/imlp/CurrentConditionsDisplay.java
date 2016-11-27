package com.silence.patterns.observer.imlp;

import com.silence.patterns.observer.inter.DisplayElement;
import com.silence.patterns.observer.inter.Observer;
import com.silence.patterns.observer.inter.Subject;

/**
 * Created by zhuxiang on 2016/11/27.
 * Desc :
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("当前情况。。。");
    }
}
