package hf.command.commands.stereo;

public class Stereo {

  String name;

  public Stereo(String name) {
    this.name = name;
  }

  public Stereo() {
  }

  void on() {
    System.out.println("On stereo");
  }

  void off() {
    System.out.println("Off stereo");
  }

  void setCD() {
    System.out.println("Set CD");
  }

  void outCD() {
    System.out.println("Out CD");
  }

  void setVolume(int volume) {
    System.out.println("Volume: " + volume);
  }
}
