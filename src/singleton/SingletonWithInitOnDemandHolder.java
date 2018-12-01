package singleton;

public class SingletonWithInitOnDemandHolder {

  private SingletonWithInitOnDemandHolder() {
  }

  private static class SingletonHolder {

    private final static SingletonWithInitOnDemandHolder instance = new SingletonWithInitOnDemandHolder();
  }

  public static SingletonWithInitOnDemandHolder getInstance() {
    return SingletonHolder.instance;
  }
}
