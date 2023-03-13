package za.co.MyRobot.toyrobot;
public enum Direction {
    NORTH("NORTH"),
    UP("UP"),
    DOWN("DOWN"),
    RIGHT("RIGHT"),
    LEFT("LEFT");

    private final String direction;

    Direction(String direction){
        this.direction = direction;
    }

    public String getDirection(){
        return this.direction;
    }
}