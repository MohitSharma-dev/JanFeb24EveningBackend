package BackendLLD2.Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currDisplay = new CurrStatsDisplay();
        Observer forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(currDisplay);
        weatherData.registerObserver(forecastDisplay);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
