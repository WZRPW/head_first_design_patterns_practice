package chapter6_command_pattern.SimpleREmoteWL;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        remote.setCommand(light::on); //not sure :: keyword/symbol
        remote.buttonWasPressed();

        remote.setCommand(garageDoor::up);
        remote.buttonWasPressed();

        remote.setCommand(garageDoor::lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageDoor::lightOff);
        remote.buttonWasPressed();

        remote.setCommand(garageDoor::down);
        remote.buttonWasPressed();

        remote.setCommand(garageDoor::stop);
        remote.buttonWasPressed();
    }
}
