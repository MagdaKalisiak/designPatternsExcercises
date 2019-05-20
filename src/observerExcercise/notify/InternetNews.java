package observerExcercise.notify;

import observerExcercise.weatherForcast.WeatherForcast;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForcast weatherForcast) {
        System.out.println("InternetNews-aktualna  prognoza pogody: temperatura: " + weatherForcast.getTemperature() + " stopni Celsiusza, ciśnienie: " + weatherForcast.getPressure() + "hPa.");
    }
}

