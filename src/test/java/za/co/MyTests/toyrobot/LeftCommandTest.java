package za.co.MyTests.toyrobot;

import org.junit.jupiter.api.Test;
import za.co.MyRobot.toyrobot.Direction;
import za.co.MyRobot.toyrobot.LeftCommand;
import za.co.MyRobot.toyrobot.Robot;

import static org.junit.jupiter.api.Assertions.*;

class LeftCommandTest {
    @Test
    void testLeftCommand(){
        LeftCommand command = new LeftCommand();
        Robot robot = new Robot("Hal");
        assertEquals(Direction.NORTH, robot.getCurrentDirection());
    }

}