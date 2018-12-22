package hf.observer;

public class WeatherStation {

  public static void main(String[] args) {
    WeaterData weaterData = new WeaterData();

    CurrentConditionsDisplay display = new CurrentConditionsDisplay(weaterData);
    OnlyTempDisplay onlyTempDisplay = new OnlyTempDisplay(weaterData);

    weaterData.setMeasurements(10, 15, 20);
  }
}
