package hf.strategy.simuduck;

import hf.strategy.simuduck.fly.FlyRocketPowered;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
