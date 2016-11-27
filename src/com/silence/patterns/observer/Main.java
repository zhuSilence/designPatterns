package com.silence.patterns.observer;

import com.silence.patterns.observer.javaAPI.CurrentConditionsDisplay;
import com.silence.patterns.observer.javaAPI.WeatherData;

/**
 * Created by zhuxiang on 2016/11/27.
 * Desc :
 */
public class Main {
    public static void main(String[] args) {
        /*WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);*/
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(88, 8, 8);
        currentConditionsDisplay.update(weatherData, null);
    }
}
