package hf.command;

import hf.command.commands.Command;
import hf.command.commands.MacroCommand;
import hf.command.commands.light.Light;
import hf.command.commands.light.LightOffCommand;
import hf.command.commands.light.LightOnCommand;
import hf.command.commands.stereo.Stereo;
import hf.command.commands.stereo.StereoOffWithCDCommand;
import hf.command.commands.stereo.StereoOnWithCDCommand;

public class RemoteLoader {

  public static void main(String[] args) {
    RemoteControlWithUndo remote = new RemoteControlWithUndo();

    Light light = new Light("Living Room");
    Stereo stereo = new Stereo("Kitchen");

    LightOnCommand lightOnCommand = new LightOnCommand(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);

    StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
    StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

    Command[] macroOn = {lightOnCommand, stereoOnWithCDCommand};
    Command[] macroOff = {lightOffCommand, stereoOffWithCDCommand};

    MacroCommand macroOnCommand = new MacroCommand(macroOn);
    MacroCommand macroOffCommand = new MacroCommand(macroOff);

    remote.setCommand(0, lightOnCommand, lightOffCommand);
    remote.setCommand(1, stereoOnWithCDCommand, stereoOffWithCDCommand);
    remote.setCommand(2, macroOnCommand, macroOffCommand);

    System.out.println(remote);

    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
    remote.undoButtonWasPushed();
    remote.onButtonWasPushed(1);
    remote.offButtonWasPushed(1);
    remote.undoButtonWasPushed();
    System.out.println("Macro ON");
    remote.onButtonWasPushed(2);
    System.out.println("Macro Off");
    remote.offButtonWasPushed(2);
  }
}
