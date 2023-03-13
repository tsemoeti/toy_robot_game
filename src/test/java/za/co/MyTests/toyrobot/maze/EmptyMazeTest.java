package za.co.MyTests.toyrobot.maze;

import org.junit.jupiter.api.Test;
import za.co.MyRobot.toyrobot.maze.EmptyMaze;

import static org.junit.jupiter.api.Assertions.*;

class EmptyMazeTest {

    @Test
    void TestingGetObstaclesResults() {
        EmptyMaze maze = new EmptyMaze();
        assertEquals(0,maze.getObstacles().size());
    }

}