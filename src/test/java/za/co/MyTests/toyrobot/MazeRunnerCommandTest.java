package za.co.MyTests.toyrobot;

import org.junit.jupiter.api.Test;
import za.co.MyRobot.toyrobot.MazeRunnerCommand;
import za.co.MyRobot.toyrobot.Position;
import za.co.MyRobot.toyrobot.Robot;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MazeRunnerCommandTest {
    @Test
    void TestingMazeRunner() {
        PrintStream outputStream = System.out;
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(arrayOutputStream));

        MazeRunnerCommand mazeRunCommand = new MazeRunnerCommand("");
        Robot robot = new Robot("Hal");
        mazeRunCommand.execute(robot);
        assertTrue(arrayOutputStream.toString().contains("[0,200] Hal> Moved forward by 1 steps."));
        Position robotPosition = robot.getPosition();
        assertEquals(0,robotPosition.getX());
        assertEquals(200,robotPosition.getY());
        System.setOut(outputStream);
    }

}