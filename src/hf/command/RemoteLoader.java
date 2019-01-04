package hf.command;

import hf.command.commands.Command;
import hf.command.commands.light.Light;
import hf.command.commands.stereo.Stereo;

public class RemoteLoader {

  public static void main(String[] args) {
    RemoteControlWithUndo remote = new RemoteControlWithUndo();

    Light light = new Light("Living Room");
    Stereo stereo = new Stereo("Kitchen");

    Command stereoOn = () -> {
      stereo.on();
      stereo.setCD();
      stereo.setVolume(11);
    };

    remote.setCommand(0, light::on, light::off);
    remote.setCommand(1, stereoOn, stereo::off);

    System.out.println(remote);

    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
    remote.onButtonWasPushed(1);
    remote.offButtonWasPushed(1);
  }
}
