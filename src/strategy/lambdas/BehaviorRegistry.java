package strategy.lambdas;

import java.util.concurrent.ConcurrentSkipListMap;

public class BehaviorRegistry<T> {

  protected ConcurrentSkipListMap<String, T> map = new ConcurrentSkipListMap<>();

  public void add(final String behaveName, final T behaveFunc) {
    assertContainsNameNot(behaveName);
    BehaviorRegistry.assertArgNotNull(behaveFunc);
    map.put(behaveName, behaveFunc);
  }

  public T get(final String behaveName) {
    assertContainsName(behaveName);
    return map.get(behaveName);
  }

  public void replace(final String behaveName, final T behaveFunc) {
    assertContainsName(behaveName);
    BehaviorRegistry.assertArgNotNull(behaveFunc);
    map.put(behaveName, behaveFunc);
  }

  public void remove(final String behaveName) {
    assertContainsName(behaveName);
    map.remove(behaveName);
  }

  protected boolean contains(final String behaveName) {
    BehaviorRegistry.assertArgNotNull(behaveName);
    assertMapNotNull();
    return map.containsKey(behaveName) && (map.get(behaveName) != null);
  }

  private static void assertArgNotNull(final Object arg) {
    if ((arg instanceof String) && !"".equals(arg)) return;
    if (arg != null) return;
    throw new RuntimeException("Пустой аргумент.");
  }

  private void assertContainsName(final String behaveName) {
    BehaviorRegistry.assertArgNotNull(behaveName);
    assertMapNotNull();
    if (!contains(behaveName)) {
      throw new RuntimeException("Способность \"" + behaveName + "\" не зарегистрирована.");
    }
  }

  private void assertContainsNameNot(final String behaveName) {
    BehaviorRegistry.assertArgNotNull(behaveName);
    assertMapNotNull();
    if (contains(behaveName)) {
      throw new RuntimeException("Способность \"" + behaveName + "\" уже зарегистрирована.");
    }
  }

  private void assertMapNotNull() {
    if (map == null) throw new RuntimeException("Отсутствует map.");
  }
}
