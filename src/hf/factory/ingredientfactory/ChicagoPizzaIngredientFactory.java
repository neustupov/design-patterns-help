package hf.factory.ingredientfactory;

import hf.factory.ingredientfactory.ingredients.BlackOlives;
import hf.factory.ingredientfactory.ingredients.Cheese;
import hf.factory.ingredientfactory.ingredients.Clams;
import hf.factory.ingredientfactory.ingredients.Dough;
import hf.factory.ingredientfactory.ingredients.FrozenClams;
import hf.factory.ingredientfactory.ingredients.MozzarellaCheese;
import hf.factory.ingredientfactory.ingredients.Pepperoni;
import hf.factory.ingredientfactory.ingredients.PlumTomatoSauce;
import hf.factory.ingredientfactory.ingredients.Sauce;
import hf.factory.ingredientfactory.ingredients.SlicedPepperoni;
import hf.factory.ingredientfactory.ingredients.Spinach;
import hf.factory.ingredientfactory.ingredients.ThickCrustDough;
import hf.factory.ingredientfactory.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngridientFactory {

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[]{new BlackOlives(), new Spinach()};
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClams() {
    return new FrozenClams();
  }
}
