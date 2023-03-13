package za.co.MyRobot.toyrobot;

public class ShutdownCommand extends Command {

        @Override
        public boolean execute(Robot target) {
            target.getWorld().turtleWorldExit();
            target.setStatus("Shutting down...");
            return false;
        }

        public ShutdownCommand() {
            super("off");
        }

    }
