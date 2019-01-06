package hf.iteratorandcomposite;

public class Demo {

  public static void main(String[] args) {

    MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
    MenuComponent dinerMenu = new Menu("Diner menu", "Dinner");
    MenuComponent cafeMenu = new Menu("Cafe menu", "Lunch");
    MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert");

    MenuComponent allMenus = new Menu("All menus", "All menus");

    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);

    dinerMenu.add(new MenuItem("Pasta", "Spaghetti", true, 3.89));

    dinerMenu.add(dessertMenu);

    dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie",
        true, 1.59));

    Waitress waitress = new Waitress(allMenus);

    waitress.printMenu();
  }
}
