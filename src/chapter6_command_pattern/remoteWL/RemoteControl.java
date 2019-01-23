package chapter6_command_pattern.remoteWL;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    private static final int defaultCapacity = 10;

    public RemoteControl() {
        onCommands = new Command[defaultCapacity];
        offCommands = new Command[defaultCapacity];
        for (int i = 0; i < defaultCapacity; i++) {
            onCommands[i] = () -> { }; //what is this?
            offCommands[i] = () -> { };
        }
    }

    public void setComand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
