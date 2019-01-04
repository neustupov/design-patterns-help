package hf.command.commands.light;

import hf.command.commands.Command;

public class LightOffCommand implements Command {

  Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }
}
