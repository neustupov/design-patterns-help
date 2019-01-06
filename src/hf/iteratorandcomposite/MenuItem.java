package hf.iteratorandcomposite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

  String name;
  String description;
  boolean vegetarian;
  double price;

  public MenuItem(String name, String description, boolean vegetarian, double price) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public boolean isVegetarian() {
    return vegetarian;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public void print() {
    System.out.print(getName() + " : " + getDescription() + " : " + getPrice() + " : "
        + isVegetarian());
  }

  @Override
  public String toString() {
    return "MenuItem{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", vegetarian=" + vegetarian +
        ", price=" + price +
        '}';
  }

  public Iterator<MenuComponent> createIterator() {
    return new NullIterator();
  }
}
