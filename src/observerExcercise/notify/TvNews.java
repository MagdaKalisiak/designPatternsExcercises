package observerExcercise.notify;

import observerExcercise.weatherForcast.WeatherForcast;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForcast weatherForcast) {
        System.out.println("TvNews-aktualna  prognoza pogody: temperatura: " + weatherForcast.getTemperature() + " stopni Celsiusza, ciśnienie: " + weatherForcast.getPressure() + "hPa.");
    }
}
