package hf.strategy.simuduck;

import hf.strategy.simuduck.fly.FlyBehavior;
import hf.strategy.simuduck.quack.QuackBehavior;

public abstract class Duck {

  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All simuduck float, even decoys");
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
