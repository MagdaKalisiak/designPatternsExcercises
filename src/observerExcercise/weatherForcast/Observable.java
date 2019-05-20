package observerExcercise.weatherForcast;

import observerExcercise.notify.Observer;

interface Observable {


    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
