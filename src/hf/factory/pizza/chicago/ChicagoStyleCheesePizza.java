package hf.factory.pizza.chicago;

import hf.factory.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

  public ChicagoStyleCheesePizza() {
    name = "Chicago Style Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";

    toppings.add("Mozzarela Cheese");
  }

  @Override
  public void cut() {
    System.out.println("Square slices");
  }
}
