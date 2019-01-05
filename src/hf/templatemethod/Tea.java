package hf.templatemethod;

public class Tea extends CaffeineBeverageWithHook {

  @Override
  void brew() {
    System.out.println("Steeping the bag");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding lemon");
  }
}
