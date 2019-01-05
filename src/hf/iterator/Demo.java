package hf.iterator;

public class Demo {

  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinnerMenu dinnerMenu = new DinnerMenu();

    Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);

    waitress.printMenu();
  }
}
