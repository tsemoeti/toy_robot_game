package za.co.MyRobot.toyrobot;

public class HelpCommand extends Command {

    public HelpCommand() {

        super("help");
    }

    @Override
    public boolean execute(Robot target) {
        target.setStatus("I can understand these commands:\n" +
                "OFF  - Shut down robot\n" +
                "HELP - provide information about commands\n" +
                "FORWARD - move forward by specified number of steps, e.g. 'FORWARD 10'\n" +
                "Back - move back by specified number of steps, e.g. 'Back 10'\n" +
                "Right - turn right\n" +
                "Left - turn left\n" +
                "Sprint - sprints by total of number of steps less by 1 e.g Sprint 5, sprints by 15");
        return true;
    }
}
