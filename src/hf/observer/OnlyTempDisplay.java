package hf.observer;

public class OnlyTempDisplay implements Observer, DisplayElement {

  private float temp;
  private Subject weatherData;

  public OnlyTempDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Temp: " + temp);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temp = temp;
    display();
  }
}
