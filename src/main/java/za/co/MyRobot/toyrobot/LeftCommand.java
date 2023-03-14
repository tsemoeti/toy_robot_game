package za.co.MyRobot.toyrobot;


public class LeftCommand extends Command{
    /**
     * Represents a command to turn the robot to the left.
     * Inherits from the Command class.
     */
    @Override
    public boolean execute(Robot target) {
        target.updateDirection(false);
        target.setStatus("Turned left.");
        return true;
    }

    public LeftCommand(){
        super("left");
    }

}


