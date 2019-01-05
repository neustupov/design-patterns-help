package hf.adapter;

public class DuckTestDrive {

  public static void main(String[] args) {
    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();
    TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

    test(duck);
    test(turkeyAdapter);
  }

  static void test(Duck duck) {
    duck.quack();
    duck.fly();
  }
}
