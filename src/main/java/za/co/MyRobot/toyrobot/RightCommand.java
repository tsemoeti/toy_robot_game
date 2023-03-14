package za.co.MyRobot.toyrobot;

public class RightCommand extends Command{
    /**
     * Represents a command to turn the robot to the right.
     * Inherits from the Command class.
     */

    @Override
    public boolean execute(Robot target) {
        target.updateDirection(true);
        target.setStatus("Turned right.");
        return true;
    }

    public RightCommand(){
        super("right");
    }

}
