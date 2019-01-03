package hf.factory.pizza.ny;

import hf.factory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

  public NYStyleCheesePizza() {
    name = "NY Style Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";

    toppings.add("Grated Reggiano Cheese");
  }
}
