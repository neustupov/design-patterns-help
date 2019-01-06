package hf.iteratorandcomposite;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {

  HashMap<String, MenuItem> menuItems = new HashMap<>();

  public CafeMenu() {
    addItem("Veggie Burger", "Veggie burger",
        true, 3.99);
    addItem("Soup", "A cup of the soup",
        false, 3.69);
    addItem("Burrito", "A large burrito",
        true, 4.29);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.put(menuItem.name, menuItem);
  }

  @Override
  public Iterator createIterator() {
    return menuItems.values().iterator();
  }
}
