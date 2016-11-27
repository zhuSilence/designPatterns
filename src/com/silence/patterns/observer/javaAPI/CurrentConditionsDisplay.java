package com.silence.patterns.observer.javaAPI;

import com.silence.patterns.observer.inter.DisplayElement;
import com.silence.patterns.observer.inter.Subject;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhuxiang on 2016/11/27.
 * Desc :
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void display() {
        System.out.println("当前情况。。。" + this.temperature + "|" + this.humidity + "|" + this.pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
