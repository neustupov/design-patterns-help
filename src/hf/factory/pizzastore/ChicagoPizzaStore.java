package hf.factory.pizzastore;

import hf.factory.pizza.Pizza;
import hf.factory.pizza.chicago.ChicagoStyleCheesePizza;
import hf.factory.pizza.chicago.ChicagoStyleClamPizza;
import hf.factory.pizza.chicago.ChicagoStylePepperoniPizza;
import hf.factory.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {

    Pizza pizza = null;

    switch (type) {
      case "cheese":
        pizza = new ChicagoStyleCheesePizza();
        break;
      case "pepperoni":
        pizza = new ChicagoStylePepperoniPizza();
        break;
      case "clam":
        pizza = new ChicagoStyleClamPizza();
        break;
      case "veggie":
        pizza = new ChicagoStyleVeggiePizza();
        break;
    }
    return pizza;
  }
}
