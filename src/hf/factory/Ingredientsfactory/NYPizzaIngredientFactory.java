package hf.factory.Ingredientsfactory;

import hf.factory.Ingredientsfactory.ingredients.Cheese;
import hf.factory.Ingredientsfactory.ingredients.Clams;
import hf.factory.Ingredientsfactory.ingredients.Dough;
import hf.factory.Ingredientsfactory.ingredients.Pepperoni;
import hf.factory.Ingredientsfactory.ingredients.Sauce;
import hf.factory.Ingredientsfactory.ingredients.Veggies;
import hf.factory.Ingredientsfactory.ingredients.FreshClams;
import hf.factory.Ingredientsfactory.ingredients.Garlic;
import hf.factory.Ingredientsfactory.ingredients.MarinaraSauce;
import hf.factory.Ingredientsfactory.ingredients.Onion;
import hf.factory.Ingredientsfactory.ingredients.ReggianoCheese;
import hf.factory.Ingredientsfactory.ingredients.SlicedPepperoni;
import hf.factory.Ingredientsfactory.ingredients.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngridientFactory {

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[]{new Onion(), new Garlic()};
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClams() {
    return new FreshClams();
  }
}
