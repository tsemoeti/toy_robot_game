package za.co.MyRobot.toyrobot;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents the entry point to the robot toy simulation program.
 * It creates a new Robot instance and accepts user input through the console to execute commands.
 * The program also handles optional command line arguments for specifying the robot's visualization mode and maze.
 */

public class Play {
    static Scanner scanner;
    /**
     * The main method of the program.
     * It creates a new Robot instance and initializes it with the user-provided name and optional command line arguments.
     * It then accepts input from the user and executes the corresponding command until the user decides to quit.
     */


    public static void main(String[] args) {

        // Initialize scanner object to read input from console
        scanner = new Scanner(System.in);
        Robot robot;
        // Get the name for the robot from the user
        String name = getInput("What do you want to name your robot?");
        System.out.println("Hello Kiddo!");
        // Check if there are any command line arguments provided for visualization mode and maze
        if(args.length >= 1 && args[0].equalsIgnoreCase("text")){
            if(args.length == 2){

                robot = new Robot(name, "text",args[1]);
                System.out.println("Loading "+args[1]);
                robot.getWorld().showObstacles();
            }else {
                robot = new Robot(name,"text");
                System.out.println("Loading RandomMaze.");
                robot.getWorld().showObstacles();
            }
        }else if(args.length >= 1 && args[0].equalsIgnoreCase("turtle")){
            if(args.length == 2){

                robot = new Robot(name, "turtle",args[1]);
                System.out.println("Loading "+args[1]);
                robot.getWorld().showObstacles();
            }else {
            // Create a new Robot instance with the provided name and specified maze file for text mode
                robot = new Robot(name, "turtle");
                System.out.println("Loading RandomMaze.");
                robot.getWorld().showObstacles();
            }
        }else {

            // Create a new Robot instance with the provided name and a default maze file for text mode
            robot = new Robot(name,"text");
            System.out.println("Loading RandomMaze.");
            robot.getWorld().showObstacles();
        }

        System.out.println(robot.toString());

        Command command;
        boolean shouldContinue = true;
        do {
            String instruction = getInput(robot.getName() + "> What must I do next?").strip().toLowerCase();
            //myHistoryList.add(instruction);
            try {
                command = Command.create(instruction);

                if (instruction.contains("forward")|| instruction.contains("back")
                        || instruction.contains("left")|| instruction.contains("right")
                        || instruction.contains("sprint")) {
                    Robot.commandList.add(instruction);

                }

                shouldContinue = robot.handleCommand(command);
            } catch (IllegalArgumentException e) {
                robot.setStatus("Sorry, I did not understand '" + instruction + "'.");
            }
            if (instruction.contains("sprint")){
                System.out.println(robot.getStatus());
            }
            else {
                System.out.println(robot);
            }

        } while (shouldContinue);
        Robot.commandList.clear();
    }

    private static String getInput(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();

        while (input.isBlank()) {
            System.out.println(prompt);
            input = scanner.nextLine();
        }
        return input;
    }

    public static void display(ArrayList<String> sprintOutPut){
        for(String messages: sprintOutPut){
            System.out.println(messages);
        }
    }
}
