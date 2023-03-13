package za.co.MyRobot.toyrobot.maze;

import za.co.MyRobot.toyrobot.world.Obstacle;
import za.co.MyRobot.toyrobot.world.SquareObstacle;

import java.util.ArrayList;
import java.util.List;

public class SimpleMaze extends AbstractMaze {


    @Override
    public List<Obstacle> getObstacles() {
        ArrayList<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new SquareObstacle(1,1));
        return obstacles;
    }


    public List<Obstacle> getObstaclePath() {
        List<Obstacle> obstacles = new ArrayList<>();
        for(ArrayList<Integer> cor : getPathForRobot()){
            int Xcor = cor.get(0);
            int Ycor = cor.get(1);
            obstacles.add(new SquareObstacle(Xcor, Ycor));
        }
        return obstacles;
    }

    private ArrayList<ArrayList<Integer>> getPathForRobot(){
        getObstacles();
        ArrayList<ArrayList<Integer>> listPathCoordinates = new ArrayList<>();
        for(int y = 0; y < 100 ; y++){
            for(int x = 0; x < 50; x++){
                ArrayList<Integer> listXYCoordinates = new ArrayList<>();
                int screenX = -100 + (x*4);
                int screenY = 200 - (y*4);
                for(Obstacle obstacle : getObstacles()){
                    if(obstacle.getBottomLeftCorner().getX()!=screenX && obstacle.getBottomLeftCorner().getX() != screenY){
                        listXYCoordinates.add(screenX);
                        listXYCoordinates.add(screenY);
                        listPathCoordinates.add(listXYCoordinates);
                    }
                }

            }
        }
        return listPathCoordinates;
    }


}

