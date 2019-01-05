package hf.templatemethod;

public class Demo {

  public static void main(String[] args) {
    Tea tea = new Tea();
    CoffeeWithHook coffee = new CoffeeWithHook();

    tea.prepareRecipe();
    coffee.prepareRecipe();
  }
}
