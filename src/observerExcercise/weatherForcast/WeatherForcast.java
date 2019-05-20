package observerExcercise.weatherForcast;

import observerExcercise.notify.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForcast implements Observable {
    private int temperature;
    private int pressure;
    private final Set<Observer> registeredObservers = new HashSet<Observer>();

    public WeatherForcast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    private void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);

    }

    @Override

    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.updateForecast(this);
        }


    }

    public void updateForcast(int temperature, int pressure) {
        setTemperature(temperature);
        setPressure(pressure);
        notifyObservers();
    }
}
