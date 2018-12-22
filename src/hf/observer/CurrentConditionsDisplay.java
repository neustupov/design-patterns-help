package hf.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Temp: " + temperature + ", Humidity: " + humidity + ", Pressure: "
        + pressure);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
}
