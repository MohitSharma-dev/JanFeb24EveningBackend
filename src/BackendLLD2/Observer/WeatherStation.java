package BackendLLD2.Observer;

import java.util.ArrayList;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrStatsDisplay currDisplay = new CurrStatsDisplay();
        Observer forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(currDisplay);
        weatherData.registerObserver(forecastDisplay);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.removeObserver(forecastDisplay);
        currDisplay.unsubscribe(weatherData);
        weatherData.setMeasurements(78, 90, 29.2f);

        ArrayList
    }
}
