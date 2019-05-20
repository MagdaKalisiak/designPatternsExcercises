package observerExcercise.notify;

import observerExcercise.weatherForcast.WeatherForcast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForcast weatherForcast) {
        System.out.println("RadioNews-aktualna  prognoza pogody: temperatura: " + weatherForcast.getTemperature() + " stopni Celsiusza, ciśnienie: " + weatherForcast.getPressure() + "hPa.");
    }
}
