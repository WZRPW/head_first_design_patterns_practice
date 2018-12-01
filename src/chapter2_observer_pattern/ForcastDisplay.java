package chapter2_observer_pattern;

public class ForcastDisplay implements Observer, DisplayUnit {
    private float currentPressure = 29.2f;
    private float lastPressure;
    private Subject wd;

    public ForcastDisplay(Subject wd) {
        this.wd = wd;
        wd.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forcast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
