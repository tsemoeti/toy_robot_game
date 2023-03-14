package za.co.MyRobot.toyrobot;

public class ForwardCommand extends Command {
    /**
     * Represents a command to move a robot forward a specified number of steps.
     * Inherits from the Command class.
     */

    @Override
    public boolean execute(Robot target) {

        int nrSteps = Integer.parseInt(getArgument());
        if (target.updatePosition(nrSteps)){
            target.setStatus("Moved forward by "+nrSteps+" steps.");
        } else {
            if(Robot.statusBloked){
                target.setStatus("Sorry, I cannot go outside my safe zone.");
            }else {
                target.setStatus("Sorry, there is an obstacle in the way.");
            }
        }
        return true;
    }
    public ForwardCommand(String argument) {

        super("forward", argument);
    }

}

