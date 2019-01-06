package hf.iteratorandcomposite;

import java.util.Iterator;
import java.util.List;

public class Waitress {

  List<Menu> menus;

  public Waitress(List<Menu> menus) {
    this.menus = menus;
  }

  public void printMenu() {
    Iterator<Menu> menuIterator = menus.iterator();
    while (menuIterator.hasNext()){
      Menu menu = menuIterator.next();
      printMenu(menu.createIterator());
    }
  }

  public void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem);
    }
  }
}
