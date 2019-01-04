package hf.command.commands.stereo;

public class Stereo {

  String name;

  public Stereo(String name) {
    this.name = name;
  }

  public Stereo() {
  }

  public void on() {
    System.out.println("On stereo");
  }

  public void off() {
    System.out.println("Off stereo");
  }

  public void setCD() {
    System.out.println("Set CD");
  }

  public void setVolume(int volume) {
    System.out.println("Volume: " + volume);
  }
}
