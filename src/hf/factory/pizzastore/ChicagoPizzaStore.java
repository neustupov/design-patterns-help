package hf.factory.pizzastore;

import hf.factory.Ingredientsfactory.ChicagoPizzaIngredientFactory;
import hf.factory.Ingredientsfactory.PizzaIngridientFactory;
import hf.factory.pizza.CheesePizza;
import hf.factory.pizza.ClamPizza;
import hf.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {

    Pizza pizza = null;
    PizzaIngridientFactory ingridientFactory = new ChicagoPizzaIngredientFactory();

    switch (type) {
      case "cheese":
        pizza = new CheesePizza(ingridientFactory);
        pizza.setName("Chicago Style Cheese pizza");
        break;
      case "clam":
        pizza = new ClamPizza(ingridientFactory);
        pizza.setName("Chicago Style Clams pizza");
        break;
    }
    return pizza;
  }
}
