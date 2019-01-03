package hf.factory.ingredientfactory;

import hf.factory.ingredientfactory.ingredients.Cheese;
import hf.factory.ingredientfactory.ingredients.Clams;
import hf.factory.ingredientfactory.ingredients.Dough;
import hf.factory.ingredientfactory.ingredients.Pepperoni;
import hf.factory.ingredientfactory.ingredients.Sauce;
import hf.factory.ingredientfactory.ingredients.Veggies;

public interface PizzaIngridientFactory {

  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();
  Veggies[] createVeggies();
  Pepperoni createPepperoni();
  Clams createClams();
}
