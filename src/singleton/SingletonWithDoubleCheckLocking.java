package singleton;

public class SingletonWithDoubleCheckLocking {

  private static volatile SingletonWithDoubleCheckLocking instance;

  private SingletonWithDoubleCheckLocking() {
  }

  public static SingletonWithDoubleCheckLocking getInstance() {
    if (instance == null) {
      synchronized (SingletonWithDoubleCheckLocking.class) {
        if (instance == null) {
          instance = new SingletonWithDoubleCheckLocking();
        }
      }
    }
    return instance;
  }

}
