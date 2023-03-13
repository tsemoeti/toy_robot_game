package za.co.MyRobot.toyrobot;

public class SprintCommand extends Command{

    public SprintCommand(String argument){
        super("sprint",argument);
    }
    @Override
    public boolean execute(Robot target) {
        StringBuilder status = new StringBuilder();
        for(int nrSteps = Integer.parseInt(getArgument()); !(nrSteps < 1); nrSteps--) {

            new ForwardCommand(String.valueOf(nrSteps)).execute(target);
            if (nrSteps !=1){
                status.append(target).append("\n");
            }
            else {
                status.append(target);
            }
        }
        target.setStatus(String.valueOf(status));

        return true;
    }

}
