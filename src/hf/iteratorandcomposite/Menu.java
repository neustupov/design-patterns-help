package hf.iteratorandcomposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

  List<MenuComponent> menuComponents = new ArrayList<>();
  String name;
  String description;

  Iterator<MenuComponent> iterator = null;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  public void add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  @Override
  public void remove(MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
  }

  @Override
  public MenuComponent getChild(int i) {
    return menuComponents.get(i);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void print() {
    System.out.println(name + " : " + description);

    Iterator<MenuComponent> iterator = menuComponents.iterator();
    while (iterator.hasNext()) {
      MenuComponent menuComponent = iterator.next();
      menuComponent.print();
    }
  }

  @Override
  public Iterator<MenuComponent> createIterator() {
    if (iterator == null) {
      iterator = new CompositeIterator(menuComponents.iterator());
    }
    return iterator;
  }
}
