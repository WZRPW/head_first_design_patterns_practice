package chapter2_observer_pattern.weather;

public class StatisticsDisplay implements Observer, DisplayUnit {
    private float maxTemp = 0.0f; //not a good init value here
    private float minTemp = 200f;
    private float sumTemp = 0.0f;
    private int numReadings = 0;
    private Subject wd; //Design Principle: program to Interface
    private boolean initialized = false; //currently display() called by update, no display problem!!!

    public StatisticsDisplay(Subject sbj) {
        this.wd = sbj;
        wd.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        numReadings++;
        maxTemp = temperature > maxTemp ? temperature : maxTemp;
        minTemp = temperature < minTemp ? temperature : minTemp;
        sumTemp += temperature;
        display();
    }
    
    @Override
    public void display() {
        if (numReadings != 0) {
            System.out.println("Avg/Max/Min temperature: " + sumTemp / numReadings + " / " + maxTemp + " / " + minTemp );
        } else {
            System.out.println("Hello! no weather data yet. Cannot display statistics");
        }
    }
}
