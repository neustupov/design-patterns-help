package strategy.lambdas;

import java.util.function.BiConsumer;

public enum EBehaviors {

  Display("представиться", () -> System.out.println("Я утка")),
  Fly("летать", () -> System.out.println("Я летаю")),
  Sleep("спать", () -> System.out.println("Z-z-z-z")),
  Quack("крякать", () -> System.out.println("Кря-кря-кря")),
  Propagate("размножаться", () -> System.out.println("O_o"));

  public String   name;
  public Runnable func;

  private EBehaviors(final String m_name, final Runnable m_func) {
    this.name = m_name;
    this.func = m_func;
  }

  public void sendTo(final BiConsumer<String, Runnable> someApiFunction) {
    someApiFunction.accept(this.name, this.func);
  }

  public void sendTo(final BiConsumer<String, Runnable> someApiFunction, final Runnable m_func) {
    someApiFunction.accept(this.name, m_func);
  }
}
