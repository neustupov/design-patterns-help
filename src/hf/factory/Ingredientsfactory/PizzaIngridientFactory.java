package hf.factory.Ingredientsfactory;

import hf.factory.Ingredientsfactory.ingredients.Cheese;
import hf.factory.Ingredientsfactory.ingredients.Clams;
import hf.factory.Ingredientsfactory.ingredients.Dough;
import hf.factory.Ingredientsfactory.ingredients.Pepperoni;
import hf.factory.Ingredientsfactory.ingredients.Sauce;
import hf.factory.Ingredientsfactory.ingredients.Veggies;

public interface PizzaIngridientFactory {

  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();
  Veggies[] createVeggies();
  Pepperoni createPepperoni();
  Clams createClams();
}
