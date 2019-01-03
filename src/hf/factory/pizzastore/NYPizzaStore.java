package hf.factory.pizzastore;

import hf.factory.ingredientfactory.NYPizzaIngredientFactory;
import hf.factory.ingredientfactory.PizzaIngridientFactory;
import hf.factory.pizza.CheesePizza;
import hf.factory.pizza.ClamPizza;
import hf.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {

    Pizza pizza = null;

    PizzaIngridientFactory ingridientFactory = new NYPizzaIngredientFactory();

    switch (type) {
      case "cheese":
        pizza = new CheesePizza(ingridientFactory);
        pizza.setName("New York Style Cheese Pizza");
        break;
      case "clam":
        pizza = new ClamPizza(ingridientFactory);
        pizza.setName("New York Style Clam Pizza");
        break;
    }
    return pizza;
  }
}
