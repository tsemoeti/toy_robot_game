
package za.co.MyRobot.toyrobot;

import za.co.MyRobot.toyrobot.world.IWorld;
import za.co.MyRobot.toyrobot.maze.MazeRunner;
import za.co.MyRobot.toyrobot.maze.SimpleMazeRunner;


public class MazeRunnerCommand extends Command{

    public MazeRunnerCommand(String argument){
        super("mazerun",argument);
    }

    public MazeRunnerCommand(){super("mazerun");}

    @Override
    public boolean execute(Robot target) {

        String arg = getArgument();
        MazeRunner mazeRunner = new SimpleMazeRunner();
        mazeRunner.setMaze(target.getWorld().getMaze());
            if (arg.equalsIgnoreCase("")) {

                mazeRunner.mazeRun(target, IWorld.Direction.UP);
                target.setStatus(String.format("I am at the top edge. (Cost: %d steps)", mazeRunner.getMazeRunCost()));
                return true;
            }
            if (arg.equalsIgnoreCase("top")) {

                mazeRunner.mazeRun(target, IWorld.Direction.UP);
                target.setStatus(String.format("I am at the top edge. (Cost: %d steps)", mazeRunner.getMazeRunCost()));
                return true;
            }
            if (arg.equalsIgnoreCase("bottom")) {
                mazeRunner.mazeRun(target, IWorld.Direction.DOWN);
                target.setStatus(String.format("I am at the bottom edge. (Cost: %d steps)", mazeRunner.getMazeRunCost()));
                return true;
            }
            if (arg.equalsIgnoreCase("right")) {
                mazeRunner.mazeRun(target, IWorld.Direction.RIGHT);
                target.setStatus(String.format("I am at the right edge. (Cost: %d steps)", mazeRunner.getMazeRunCost()));
                return true;
            }
            if (arg.equalsIgnoreCase("left")) {
                mazeRunner.mazeRun(target, IWorld.Direction.LEFT);
                target.setStatus(String.format("I am at the left edge. (Cost: %d steps)", mazeRunner.getMazeRunCost()));
                return true;
            }
            return true;
        }

    }

