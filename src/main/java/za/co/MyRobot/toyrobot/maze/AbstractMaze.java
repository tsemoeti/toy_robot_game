package za.co.MyRobot.toyrobot.maze;

import za.co.MyRobot.toyrobot.Position;
import za.co.MyRobot.toyrobot.world.Obstacle;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMaze implements Maze {
    public List<Obstacle> getObstaclePath(){
        return new ArrayList<>();
    }

    public boolean blocksPath(Position a, Position b){
        return  false;
    }


}