package hf.factory.pizzastore;

import hf.factory.pizza.Pizza;

public class Demo {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println(pizza.getName());
    System.out.println(pizza);

    Pizza pizza1 = chicagoStore.orderPizza("clam");
    System.out.println(pizza1.getName());
    System.out.println(pizza1);
  }
}
