package hf.iteratorandcomposite;

import java.util.Arrays;

public class Demo {

  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinnerMenu dinnerMenu = new DinnerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    Waitress waitress = new Waitress(Arrays.asList(pancakeHouseMenu, dinnerMenu, cafeMenu));

    waitress.printMenu();
  }
}
