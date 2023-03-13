package za.co.MyRobot.toyrobot;
public abstract class Command {
    private final String name;
    private String argument;


    public abstract boolean execute(Robot target);

    public Command(String name){
        this.name = name.trim().toLowerCase();
        this.argument = "";

    }

    public Command(String name, String argument) {
        this(name);
        this.argument = argument.trim();
    }

    public String getName() {                                                                           //<2>
        return name;
    }

    public String getArgument() {
        return this.argument;
    }


    public static Command create(String instruction) {
        String[] args = instruction.toLowerCase().trim().split(" ",2);

        switch (args[0]){

            case "back":
                if(args.length > 1) {
                    return new BackCommand(args[1]);
                }
            case "left":
                return new LeftCommand();
            case "right":
                return new RightCommand();
            case "shutdown":
            case "off":
                return new ShutdownCommand();
            case "help":
                return new HelpCommand();
            case "forward":
                if(args.length > 1) {
                    return new ForwardCommand(args[1]);
                }
            case "mazerun":
                if(args.length == 1) {
                    return new MazeRunnerCommand();
                }
                else {
                    return new MazeRunnerCommand(args[1]);
                }

            case "sprint":
                if(args.length > 1) {
                    return new SprintCommand(args[1]);
                }
            case "replay":
                if(args.length==1) {

                    return new ReplayCommand();
                }
                else{
                    return new ReplayCommand(args[1]);
                }
            default:

                throw new IllegalArgumentException("Unsupported command: " + instruction);
        }
    }
}



