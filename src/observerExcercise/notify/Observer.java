package observerExcercise.notify;

import observerExcercise.weatherForcast.WeatherForcast;

public interface Observer {
    void updateForecast(WeatherForcast weatherForcast);
}
