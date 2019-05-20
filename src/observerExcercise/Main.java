package observerExcercise;

import observerExcercise.notify.InternetNews;
import observerExcercise.notify.RadioNews;
import observerExcercise.notify.TvNews;
import observerExcercise.weatherForcast.WeatherForcast;

class Main {
    public static void main(String[] args) {

        WeatherForcast weatherForcast = new WeatherForcast(10, 1002);
        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();

        weatherForcast.registerObserver(internetNews);
        weatherForcast.registerObserver(radioNews);
        weatherForcast.registerObserver(tvNews);

        weatherForcast.notifyObservers();
        weatherForcast.unregisterObserver(tvNews);
        weatherForcast.unregisterObserver(radioNews);
        System.out.println("Powiadomienie po wypisaniu radia i telewizji- nowa prognoza");
        weatherForcast.updateForcast(1, 2000);
    }
}
