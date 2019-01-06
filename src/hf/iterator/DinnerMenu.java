package hf.iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu{

  static final int MAX_ITEMS = 6;

  int numberOfItems = 0;

  MenuItem[] menuItems;

  public DinnerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];

    addItem("Vegetarian BLT", "Bacon with lettuce",
        true, 2.99);
    addItem("BLT", "Bacon with lettuce and tomato",
        false, 2.99);
    addItem("Soup", "Soup of the day",
        false, 3.29);
    addItem("Hot dog", "A hot dog",
        false, 3.05);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if (numberOfItems >= MAX_ITEMS) {
      System.err.println("Menu if full");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems++;
    }
  }

  public Iterator createIterator() {
    return new DinnerMenuIterator(menuItems);
  }
}
