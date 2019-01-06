package hf.iterator;

import java.util.Iterator;

public class Waitress {

  private Menu pancakeHouseMenu;
  private Menu dinnerMenu;
  private Menu cafeMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinnerMenu = dinnerMenu;
    this.cafeMenu = cafeMenu;
  }

  public void printMenu() {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinnerIterator = dinnerMenu.createIterator();
    Iterator cafeIterator = cafeMenu.createIterator();
    System.out.println("Pancake menu");
    printMenu(pancakeIterator);
    System.out.println("Dinner menu");
    printMenu(dinnerIterator);
    System.out.println("Cafe menu");
    printMenu(cafeIterator);
  }

  public void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem);
    }
  }
}
