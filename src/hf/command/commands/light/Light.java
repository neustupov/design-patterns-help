package hf.command.commands.light;

public class Light {

  String name;

  public Light(String name) {
    this.name = name;
  }

  void on() {
    System.out.println("Light on!");
  }

  void off() {
    System.out.println("Light off!");
  }
}
