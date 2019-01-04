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
    stereo.outCD();
    stereo.setVolume(0);
  }

  @Override
  public void undo() {
    stereo.on();
    stereo.setCD();
    stereo.setVolume(11);
  }
}
