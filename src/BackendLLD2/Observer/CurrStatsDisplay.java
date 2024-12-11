package BackendLLD2.Observer;

public class CurrStatsDisplay implements Observer, Display{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrStatsDisplay(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Current Statistics :");
        System.out.println("Temperature: " + temperature + "Humidity: " + humidity + "Pressure: " + pressure);
    }

    public void subscribe(Subject subject){
        subject.registerObserver(this);
    }

    public void unsubscribe(Subject subject){
        subject.removeObserver(this);
    }
}
