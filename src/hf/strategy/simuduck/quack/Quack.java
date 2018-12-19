package hf.strategy.simuduck.quack;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack!");
  }
}
