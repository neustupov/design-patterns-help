package strategy.lambdas;

public class Duck {

  protected BehaviorRegistry<Runnable> behaviors = new BehaviorRegistry<>();

  public void perform(final String behaveName) {
    behaviors.get(behaveName).run();
  }

  public void performAll() {
    behaviors.map.descendingKeySet().forEach(this::perform);
    System.out.println("----------------------------------------------");
  }
}
