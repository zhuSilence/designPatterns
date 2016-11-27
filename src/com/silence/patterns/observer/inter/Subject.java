package com.silence.patterns.observer.inter;

/**
 * Created by zhuxiang on 2016/11/20.
 * Desc :
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
