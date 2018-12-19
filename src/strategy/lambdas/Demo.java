package strategy.lambdas;

import java.util.stream.Stream;

public class Demo {

  public static void main(final String[] args) {
    Runnable behaviorFunc = null;

    final Duck mallardDuck = new Duck();
    behaviorFunc = () -> System.out.println("Я кряква");
    EBehaviors.Display.sendTo(mallardDuck.behaviors::add, behaviorFunc);
    EBehaviors.Fly.sendTo(mallardDuck.behaviors::add);
    EBehaviors.Quack.sendTo(mallardDuck.behaviors::add);

    final Duck redheadDuck = new Duck();
    behaviorFunc = () -> System.out.println("Я красноголовая утка");
    EBehaviors.Display.sendTo(redheadDuck.behaviors::add, behaviorFunc);
    EBehaviors.Fly.sendTo(redheadDuck.behaviors::add);
    EBehaviors.Quack.sendTo(redheadDuck.behaviors::add);

    final Duck rubberDuck = new Duck();
    behaviorFunc = () -> System.out.println("Я резиновая утка");
    EBehaviors.Display.sendTo(rubberDuck.behaviors::add, behaviorFunc);
    EBehaviors.Quack.sendTo(rubberDuck.behaviors::add);

    final Duck decoyDuck = new Duck();
    behaviorFunc = () -> System.out.println("Я деревянная утка");
    EBehaviors.Display.sendTo(decoyDuck.behaviors::add, behaviorFunc);

    final Duck exclusiveDuck = new Duck();
    behaviorFunc = () -> System.out.println("Я эксклюзивная утка");
    EBehaviors.Display.sendTo(exclusiveDuck.behaviors::add, behaviorFunc);
    behaviorFunc = () -> System.out.println("Я изрыгаю пламя    <== эксклюзивное поведение");
    exclusiveDuck.behaviors.add("палить огнем", behaviorFunc);

    final Duck[] ducks = { mallardDuck, redheadDuck, rubberDuck, decoyDuck, exclusiveDuck };

    // Простой тест всех уток.
    System.out.println("############################################## 1");
    Stream.of(ducks).forEachOrdered(Duck::performAll);

    // Подменяем стандартное поведение созданной красноголовой утки.
    System.out.println("############################################## 2");
    behaviorFunc = () -> System.out.println("Кряяааааааа!    <== подменили в RunTime");
    EBehaviors.Display.sendTo(redheadDuck.behaviors::replace, behaviorFunc);
    redheadDuck.performAll();

    // Добавляем последействие к каждой способности кряквы.
    System.out.println("############################################## 3");
    EBehaviors.Propagate.sendTo(mallardDuck.behaviors::add);
    EBehaviors.Sleep.sendTo(mallardDuck.behaviors::add);
    mallardDuck.behaviors.map.forEach((name, func) -> {
      final Runnable newFunc = () -> {
        func.run();
        System.out.println("   ^^^^^  последействие");
      };
      mallardDuck.behaviors.replace(name, newFunc);
    });
    mallardDuck.performAll();

    // Удаляем все стандартные способности у всех уток, если они у них есть.
    System.out.println("############################################## 4");
    for (final Duck duck : ducks) {
      Stream.of(EBehaviors.values()).map(val -> val.name).filter(duck.behaviors::contains)
          .forEach(duck.behaviors::remove);
    }
    Stream.of(ducks).forEachOrdered(Duck::performAll);
  }
}
