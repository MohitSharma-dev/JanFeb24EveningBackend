package BackendLLD2.Observer;

public class ForecastDisplay implements Observer , Display{
    float temperature;
    float humidity;
    float pressure;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public void display() {
        if(temperature > 80){
            System.out.println("Forecast : A hot evening is coming" );
            return;
        }

        System.out.println("Forecast : Nothing changed please get back to your work!");
    }
}
