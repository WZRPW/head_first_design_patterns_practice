package chapter2_observer_pattern.weatherobservable;

import chapter2_observer_pattern.weather.ForcastDisplay;

import java.util.Observable;
import java.util.Random;

public class WeatherStation {


    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

//        weatherData.setMeasurements(80, 65, 30.4f);
//        weatherData.setMeasurements(82, 70, 29.2f);
//        weatherData.setMeasurements(78, 90, 29.2f);
        Random rd = new Random();
        while (rd.nextInt(100) < 90) {
            weatherData.setMeasurements(rd.nextInt(), rd.nextInt(), rd.nextInt());
        }
    }
}
