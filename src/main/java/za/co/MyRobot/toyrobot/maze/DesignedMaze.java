package za.co.MyRobot.toyrobot.maze;

import za.co.MyRobot.toyrobot.world.Obstacle;
import za.co.MyRobot.toyrobot.world.SquareObstacle;

import java.util.ArrayList;
import java.util.List;

public class DesignedMaze extends AbstractMaze{


    private  ArrayList<ArrayList<Integer>> createMaze(boolean pathOrObstacles){
        ArrayList<ArrayList<Integer>> lisCoordinatesXY = new ArrayList<>();
        ArrayList<ArrayList<Integer>> pathCoordinates = new ArrayList<>();
        String[][] maze = {
                {"wwwwwwwwwwwwwwwwwww                 wwwwwwwwwwwwww"},
                {"w wwwwwwwww                    wwwwwwwwwwwwwwwwwww"},
                {"w wwwwwwwww                    wwwwwwwwwwwwwwwwwww"},
                {"w wwwwwwwww                                      w"},
                {"w        ww                                      w"},
                {"w        ww                                      w"},
                {"w        ww                                      w"},
                {"w        ww                                      w"},
                {"w        ww                                      w"},
                {"w        ww                       wwwwwwwwwwwwwwww"},
                {"ww       ww                       wwwwwwwwwwwwwwww"},
                {"w        ww                                      w"},
                {"w        ww                                      w"},
                {"w        ww                                      w"},
                {"w        ww                                      w"},
                {"w        ww                                      w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"ww                                              ww"},
                {"ww                                              ww"},
                {"w                                                w"},
                {"w                 wwwwwwwwwwwwwwwwww             w"},
                {"w                 wwwwwwwwwwwwwwwwww             w"},
                {"w                 wwwwwwwwwwwwwwwwww             w"},
                {"w                 wwwwwwwwwwwwwwwwww             w"},
                {"w                 wwwwwwwwwwwwwwwwww             w"},
                {"w                 wwwwwwwwwwwwwwwwww             w"},
                {"wwwwwww                    wwwwwwwwwwww          w"},
                {"wwwwwww                    wwwwwwwwwwwwwwwwwwwwwww"},
                {"w                          wwwwwwwwwwwwwwwwwwwwwww"},
                {"w                          wwwwwwwwwwwwwwwwwwwwwww"},
                {"w                                                w"},
                {"w                                                w"},
                {"w                                                w"},
                {"wwwww       www                                  w"},
                {"wwwww       www                                  w"},
                {"w           www                                  w"},
                {"w           www                                  w"},
                {"ww          www                 wwwwwwwwwwwwwwwwww"},
                {"ww          www                 wwwwwwwwwwwwwwwwww"},
                {"w           www                 wwwwwwwwwwwwwwwwww"},
                {"w           www                                  w"},
                {"wwwwwwwwwwwwwww                                  w"},
                {"wwwwwwwwwwwwwww                                  w"},
                {"wwwwwwwwwwwwwww                                  w"},
                {"w                                                w"},
                {"w                                                w"},
                {"w                                                w"},
                {"   wwwww                           wwwwwwwwwww    "},
                {"   wwwww                           wwwwwwwwwww    "},
                {"w                                                w"},
                {"w                                                w"},
                {"w                                                w"},
                {"w                         wwwwwwwwwwwwwwwwww     w"},
                {"w                         wwwwwwwwwwwwwwwwww     w"},
                {"w                         wwwwwwwwwwwwwwwwww     w"},
                {"w                         wwwwwwwwwwwwwwwwww     w"},
                {"w                         wwwwwwwwwwwwwwwwww     w"},
                {"www                       wwwwwwwwwwwwwwwwww    ww"},
                {"www                                              w"},
                {"w                                                w"},
                {"w        wwwwwwww                                w"},
                {"         wwwwwwww                                w"},
                {"         wwwwwwww                                w"},
                {"         wwwwwwww                                w"},
                {"         wwwwwwww                                w"},
                {"                                          wwwwwwww"},
                {"                                          wwwwwwww"},
                {"w                                         wwwwwwww"},
                {"w                                         wwwwwwww"},
                {"w                                         wwwwwwww"},
                {"w                                                w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w        wwwwwwwwwwww                            w"},
                {"w                                                w"},
                {"w                                                w"},
                {"ww  wwww                             ww         ww"},
                {"w   wwww                             ww           "},
                {"w   wwww                             www          "},
                {"w   wwwwwwww                         www          "},
                {"w   wwwwwwww                         ww           "},
                {"w   wwwwwwww                         ww           "},
                {"w   wwwwwwww                         www         w"},
                {"w   wwwwwwww                         ww          w"},
                {"w   wwwwwwww                         ww          w"},
                {"w                                    ww          w"},
                {"w                                    wwwwwwwwwwwww"},
                {"w                                    wwwwwwwwwwwww"},
                {"w                                    wwwwwwwwwwwww"},
                {"wwwwwwwwwwwwwwww                wwwwwwwwwwwwwwwwww"}
        };
        for(int y =0; y < maze.length; y++){
            for(int x = 0; x < maze[y][0].length(); x++){
                ArrayList<Integer> XYcoordinates = new ArrayList<>();
                int screenX = -100 + (x*4);
                int screenY = 200 -  (y*4);
                if(maze[y][0].charAt(x) == 'w'){
                    XYcoordinates.add(screenX);
                    XYcoordinates.add(screenY);
                    lisCoordinatesXY.add(XYcoordinates);
                }else{
                    XYcoordinates.add(screenX);
                    XYcoordinates.add(screenY);
                    pathCoordinates.add(XYcoordinates);

                }

            }
        }

        if(pathOrObstacles) {
            return pathCoordinates;
        }else{
            return lisCoordinatesXY;
        }
    }

    @Override
    public List<Obstacle> getObstacles() {
        List<Obstacle> obstacles = new ArrayList<>();
        for(ArrayList<Integer> cor : createMaze(false)){
            int corX = cor.get(0);
            int randY = cor.get(1);
            obstacles.add(new SquareObstacle(corX, randY));
        }
        return obstacles;
    }

    @Override
    public List<Obstacle> getObstaclePath() {
        List<Obstacle> obstacles = new ArrayList<>();
        for(ArrayList<Integer> cor : createMaze(true)){
            int corX = cor.get(0);
            int corY = cor.get(1);
            obstacles.add(new SquareObstacle(corX, corY));
        }
        return obstacles;
    }

}

