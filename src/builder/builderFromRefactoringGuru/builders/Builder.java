package builder.builderFromRefactoringGuru.builders;

import builder.builderFromRefactoringGuru.cars.Type;
import builder.builderFromRefactoringGuru.components.Engine;
import builder.builderFromRefactoringGuru.components.GPSNavigator;
import builder.builderFromRefactoringGuru.components.Transmission;
import builder.builderFromRefactoringGuru.components.TripComputer;

public interface Builder {
  void setType(Type type);
  void setSeats(int seats);
  void setEngine(Engine engine);
  void setTransmission(Transmission transmission);
  void setTripComputer(TripComputer tripComputer);
  void setGPSNavigator(GPSNavigator gpsNavigator);
}
