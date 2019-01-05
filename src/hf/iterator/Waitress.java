package hf.iterator;

public class Waitress {

  PancakeHouseMenu pancakeHouseMenu;
  DinnerMenu dinnerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
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
