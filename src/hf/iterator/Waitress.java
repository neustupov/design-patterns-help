package hf.iterator;

import java.util.Iterator;

public class Waitress {

  private Menu pancakeHouseMenu;
  private Menu dinnerMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinnerMenu = dinnerMenu;
  }

  public void printMenu() {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinnerIterator = dinnerMenu.createIterator();
    printMenu(pancakeIterator);
    printMenu(dinnerIterator);
  }

  public void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem);
    }
  }
}
