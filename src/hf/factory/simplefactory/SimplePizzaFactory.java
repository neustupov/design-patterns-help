package hf.factory.simplefactory;

import hf.factory.pizza.CheesePizza;
import hf.factory.pizza.ClamPizza;
import hf.factory.pizza.PepperoniPizza;
import hf.factory.pizza.Pizza;
import hf.factory.pizza.VeggiePizza;

public class SimplePizzaFactory {

  public Pizza createPizza(String type) {

    Pizza pizza = null;

    switch (type) {
      /*case "cheese":
        pizza = new CheesePizza();
        break;*/
      case "pepperoni":
        pizza = new PepperoniPizza();
        break;
      /*case "clam":
        pizza = new ClamPizza();
        break;*/
      case "veggie":
        pizza = new VeggiePizza();
        break;
    }
    return pizza;
  }
}
