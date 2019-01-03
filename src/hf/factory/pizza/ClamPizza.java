package hf.factory.pizza;

import hf.factory.ingredientfactory.PizzaIngridientFactory;

public class ClamPizza extends Pizza {

  PizzaIngridientFactory ingridientFactory;

  public ClamPizza(PizzaIngridientFactory ingridientFactory) {
    this.ingridientFactory = ingridientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Prepare " + name);
    dough = ingridientFactory.createDough();
    sauce = ingridientFactory.createSauce();
    cheese = ingridientFactory.createCheese();
    clam = ingridientFactory.createClams();
  }
}
