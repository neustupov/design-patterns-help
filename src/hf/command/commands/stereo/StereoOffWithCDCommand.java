package hf.command.commands.stereo;

import hf.command.commands.Command;

public class StereoOffWithCDCommand implements Command {

  Stereo stereo;

  public StereoOffWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.off();
  }
}
