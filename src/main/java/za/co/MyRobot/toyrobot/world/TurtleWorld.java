package za.co.MyRobot.toyrobot.world;

import za.co.MyRobot.toyrobot.Position;
import za.co.MyRobot.toyrobot.maze.Maze;


public class TurtleWorld  extends AbstractWorld{
    private Turtle turtle = new Turtle();
    private Turtle gru;

    public void plotMaze(){
        StdDraw.setYscale(-200,200);
        StdDraw.setXscale(-100,100);
        gru = new Turtle();
        gru.speed(0);

        for(Obstacle obstacle :getObstacles()){
            Position p1 = obstacle.getBottomLeftCorner();
            Position p3 = obstacle.getTopLeftCorner();

            gru.up();
            gru.goTo(p1.getX(),p1.getY());
            gru.down();
            gru.forward(4);
            gru.right(90);
            gru.forward(4);
            gru.right(90);
            gru.forward(4);
            gru.right(90);
            gru.forward(4);
            gru.right(90);
        }

    }

    public TurtleWorld(Maze maze) {
        super(maze);
        plotMaze();
    }

    @Override
    public void moveBackRobot(Position position){
        this.turtle.goTo(position.getX(), position.getY());
        this.turtle.speed(0);
        this.turtle.penColor("red");
        this.turtle.dot(2);

    }

    @Override
    public void moveForwardRobot(Position position){

        this.turtle.goTo(position.getX(),position.getY());
        this.turtle.penColor("red");
        this.turtle.speed(0);
        this.turtle.dot(2);

    }


    @Override
    public void turtleWorldExit(){
        this.turtle.bye();
        this.gru.bye();
    }


}
