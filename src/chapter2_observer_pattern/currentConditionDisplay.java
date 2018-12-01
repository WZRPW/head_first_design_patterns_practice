package chapter2_observer_pattern;

public class currentConditionDisplay implements Observer, DisplayUnit {
    private float temperature;
    private float humidity;
    private Subject wheatherData;

    public currentConditionDisplay(Subject weatherData) {
        this.wheatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current condition: " +
                temperature + " F degrees and " +
                humidity + " % humidyt");
    }
}
