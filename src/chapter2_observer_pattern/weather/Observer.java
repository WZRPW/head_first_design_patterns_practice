package chapter2_observer_pattern.weather;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
