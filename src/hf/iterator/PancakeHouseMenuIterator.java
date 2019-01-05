package hf.iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

  List<MenuItem> menuItems;
  int position = 0;

  public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    return !(position >= menuItems.size() || menuItems.get(position) == null);
  }

  @Override
  public Object next() {
    MenuItem menuItem = menuItems.get(position);
    position++;
    return menuItem;
  }
}
