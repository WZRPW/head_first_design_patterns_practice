package chapter2_observer_pattern;

import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        currentConditionDisplay currentDisplay = new currentConditionDisplay(wd);
        //
        //
        wd.setMeasurements(80, 60, 30.4f);
        wd.setMeasurements(90, 100, 50.1f);
        wd.setMeasurements(70, 60, 20.6f);
    }
}
