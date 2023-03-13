package za.co.MyTests.toyrobot;

import org.junit.jupiter.api.Test;
import za.co.MyRobot.toyrobot.Direction;
import za.co.MyRobot.toyrobot.RightCommand;
import za.co.MyRobot.toyrobot.Robot;

import static org.junit.jupiter.api.Assertions.*;

class RightCommandTest {
    @Test
    void testRightCommand(){
        RightCommand command = new RightCommand();
        Robot robot = new Robot("Hal");
        assertEquals(Direction.NORTH, robot.getCurrentDirection());
    }
}