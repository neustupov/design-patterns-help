package hf.factory.ingredientfactory;

import hf.factory.ingredientfactory.ingredients.Cheese;
import hf.factory.ingredientfactory.ingredients.Clams;
import hf.factory.ingredientfactory.ingredients.Dough;
import hf.factory.ingredientfactory.ingredients.Pepperoni;
import hf.factory.ingredientfactory.ingredients.Sauce;
import hf.factory.ingredientfactory.ingredients.Veggies;
import hf.factory.ingredientfactory.ingredients.FreshClams;
import hf.factory.ingredientfactory.ingredients.Garlic;
import hf.factory.ingredientfactory.ingredients.MarinaraSauce;
import hf.factory.ingredientfactory.ingredients.Onion;
import hf.factory.ingredientfactory.ingredients.ReggianoCheese;
import hf.factory.ingredientfactory.ingredients.SlicedPepperoni;
import hf.factory.ingredientfactory.ingredients.ThinCrustDough;

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
