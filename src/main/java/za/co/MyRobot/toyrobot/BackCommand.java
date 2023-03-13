package za.co.MyRobot.toyrobot;


public class BackCommand extends Command{

    @Override
    public boolean execute(Robot target) {
        int numberOfSteps = Integer.parseInt(getArgument());
        if(target.updatePositionBack(numberOfSteps)){

            target.setStatus("Moved back by "+numberOfSteps+" steps.");
        }else{
            if(Robot.statusBloked){
                target.setStatus("Sorry, I cannot go outside my safe zone.");
            }else {
                target.setStatus("Sorry, there is an obstacle in the way.");
            }
        }
        return true;
    }


    public BackCommand(String argument){
        super("back", argument);
    }

}