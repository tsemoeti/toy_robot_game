package za.co.MyRobot.toyrobot;


public class BackCommand extends Command{
    /**
     * Represents a command to move a robot backward a specified number of steps.
     * Inherits from the Command class.
     */

    @Override
    public boolean execute(Robot target) {
        // This method executes the back command on the specified Robot object.
        int numberOfSteps = Integer.parseInt(getArgument());
        // It parses the number of steps from the command argument,
        if(target.updatePositionBack(numberOfSteps)){
        // attempts to move the robot back by that many steps,
            target.setStatus("Moved back by "+numberOfSteps+" steps.");
        // and updates the robot's status accordingly.
        }else{
        // If the robot cannot move back due to an obstacle or being out of bounds,
        // it updates the status with an appropriate message.
            if(Robot.statusBloked){
                target.setStatus("Sorry, I cannot go outside my safe zone.");
            }else {
                target.setStatus("Sorry, there is an obstacle in the way.");
            }
        }
        // Returns true to indicate successful execution of the command.
        return true;
    }


    public BackCommand(String argument){
        super("back", argument);
    }

}