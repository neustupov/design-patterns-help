package hf.iteratorandcomposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{

  List<MenuItem> menuItems;

  public PancakeHouseMenu() {
    this.menuItems = new ArrayList<>();

    addItem("Pancake Breakfast", "Pancakes with eggs",
        true, 2.99);
    addItem("Regular Pancake", "Pancake with fried eggs",
        false, 2.99);
    addItem("Blueberry pancakes", "Pancakes with blueberry",
        true, 3.49);
    addItem("Waffles", "Waffles with strawberries",
        true, 3.59);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  public Iterator<MenuItem> createIterator() {
    return menuItems.iterator();
  }
}
