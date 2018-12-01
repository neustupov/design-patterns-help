package builder.builderFromRefactoringGuru;

import builder.builderFromRefactoringGuru.builders.CarBuilder;
import builder.builderFromRefactoringGuru.builders.CarManualBuilder;
import builder.builderFromRefactoringGuru.cars.Car;
import builder.builderFromRefactoringGuru.cars.Manual;
import builder.builderFromRefactoringGuru.director.Director;

public class Demo {
  public static void main(String[] args) {
    Director director = new Director();

    // Директор получает объект конкретного строителя от клиента
    // (приложения). Приложение само знает какой строитель использовать,
    // чтобы получить нужный продукт.
    CarBuilder builder = new CarBuilder();
    director.constructSportsCar(builder);

    // Готовый продукт возвращает строитель, так как Директор чаще всего не
    // знает и не зависит от конкретных классов строителей и продуктов.
    Car car = builder.getResult();
    System.out.println("Car built:\n" + car.getType());


    CarManualBuilder manualBuilder = new CarManualBuilder();

    // Директор может знать больше одного рецепта строительства.
    director.constructSportsCar(manualBuilder);
    Manual carManual = manualBuilder.getResult();
    System.out.println("\nCar manual built:\n" + carManual.print());
  }
}
