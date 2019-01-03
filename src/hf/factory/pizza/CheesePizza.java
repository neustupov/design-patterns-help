package hf.factory.pizza;

import hf.factory.ingredientfactory.PizzaIngridientFactory;

public class CheesePizza extends Pizza {

  PizzaIngridientFactory ingridientFactory;

  public CheesePizza(PizzaIngridientFactory ingridientFactory) {
    this.ingridientFactory = ingridientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingridientFactory.createDough();
    sauce = ingridientFactory.createSauce();
    cheese = ingridientFactory.createCheese();
  }
}
