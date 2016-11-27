package com.silence.patterns.observer.inter;

/**
 * Created by zhuxiang on 2016/11/27.
 * Desc :
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
