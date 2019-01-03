package hf.factory.pizzastore;

import hf.factory.pizza.Pizza;
import hf.factory.pizza.ny.NYStyleCheesePizza;
import hf.factory.pizza.ny.NYStyleClamPizza;
import hf.factory.pizza.ny.NYStylePepperoniPizza;
import hf.factory.pizza.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {

    Pizza pizza = null;

    switch (type) {
      case "cheese":
        pizza = new NYStyleCheesePizza();
        break;
      case "pepperoni":
        pizza = new NYStylePepperoniPizza();
        break;
      case "clam":
        pizza = new NYStyleClamPizza();
        break;
      case "veggie":
        pizza = new NYStyleVeggiePizza();
        break;
    }
    return pizza;
  }
}
