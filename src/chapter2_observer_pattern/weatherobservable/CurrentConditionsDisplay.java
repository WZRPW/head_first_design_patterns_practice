package chapter2_observer_pattern.weatherobservable;

import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs; //implement the interface update method
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override  //Design Principle: program to interface ranther specific class
    public void display() {
        System.out.println("Current conditions: " + temperature
                         + "F degrees and " + humidity + "% humidity");
    }
}
