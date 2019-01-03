package hf.factory.Ingredientsfactory;

import hf.factory.Ingredientsfactory.ingredients.BlackOlives;
import hf.factory.Ingredientsfactory.ingredients.Cheese;
import hf.factory.Ingredientsfactory.ingredients.Clams;
import hf.factory.Ingredientsfactory.ingredients.Dough;
import hf.factory.Ingredientsfactory.ingredients.FrozenClams;
import hf.factory.Ingredientsfactory.ingredients.MozzarellaCheese;
import hf.factory.Ingredientsfactory.ingredients.Pepperoni;
import hf.factory.Ingredientsfactory.ingredients.PlumTomatoSauce;
import hf.factory.Ingredientsfactory.ingredients.Sauce;
import hf.factory.Ingredientsfactory.ingredients.SlicedPepperoni;
import hf.factory.Ingredientsfactory.ingredients.Spinach;
import hf.factory.Ingredientsfactory.ingredients.ThickCrustDough;
import hf.factory.Ingredientsfactory.ingredients.Veggies;

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
