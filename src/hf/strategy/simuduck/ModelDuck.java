package hf.strategy.simuduck;

import hf.strategy.simuduck.fly.FlyNoWay;
import hf.strategy.simuduck.quack.Quack;

public class ModelDuck extends Duck {

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I`m a model duck!");
  }
}
