package za.co.MyTests.toyrobot;

import org.junit.jupiter.api.Test;
import za.co.MyRobot.toyrobot.ForwardCommand;
import za.co.MyRobot.toyrobot.Position;
import za.co.MyRobot.toyrobot.Robot;

import static org.junit.jupiter.api.Assertions.*;

class ForwardCommandTest {

    @Test
    void testForwardCommand() {
        ForwardCommand command = new ForwardCommand("5");
        Robot robot = new Robot("Hal");
        Position roboPosition = robot.getPosition();
        assertEquals(0,roboPosition.getX());
    }

}