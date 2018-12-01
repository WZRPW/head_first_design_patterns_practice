package chapter2_observer_pattern.weather;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        currentConditionDisplay currentDisplay = new currentConditionDisplay(wd);
        StatisticsDisplay statDisplay = new StatisticsDisplay(wd);
        ForcastDisplay forcastDisplay = new ForcastDisplay(wd);

        wd.setMeasurements(80, 60, 30.4f);
        wd.setMeasurements(90, 100, 50.1f);
        wd.removeObserver(currentDisplay);
        wd.notifyObserver();
        wd.setMeasurements(70, 60, 20.6f);
    }
}
