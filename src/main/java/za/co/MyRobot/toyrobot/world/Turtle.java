package za.co.MyRobot.toyrobot.world;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Turtle {

    private int speed = 100;
    private final double penSize = 2;
    private Color penColor = Color.BLACK;
    private static Map<String, Color> colorNames;
    private double x = 0, y = 0;
    private double angle = 0;
    private boolean isPenDown = true;


    public Turtle() {
    }

    private void init() {

        worldCoordinates(-320, -240, 320, 240);
        colorNames = new HashMap<>();

        colorNames.put("goldenrod", new Color(0xdaa520));
        colorNames.put("gray", new Color(0x808080));
        colorNames.put("green", new Color(0x008000));
        colorNames.put("greenyellow", new Color(0xadff2f));
        colorNames.put("honeydew", new Color(0xf0fff0));
        colorNames.put("plum", new Color(0xdda0dd));
        colorNames.put("powderblue", new Color(0xb0e0e6));

    }

    {
        init();
    }


    public void speed(int t) {
        speed = t;
    }


    public void goTo(double x, double y) {
        StdDraw.setPenColor(penColor);
        StdDraw.setPenRadius(penSize / 512);
        if (isPenDown) {
            StdDraw.line(this.x, this.y, x, y);
        }
        this.x = x;
        this.y = y;
        delay(speed);
    }

    public void up() {
        isPenDown = false;
    }


    public void down() {
        isPenDown = true;
    }


    public void left(double delta) {
        angle += delta;
        angle %= 360;
    }


    public void right(double delta) {
        angle -= delta;
        angle %= 360;
    }


    public void forward(double step) {
        double oldx = x;
        double oldy = y;
        x += step * Math.cos(Math.toRadians(angle));
        y += step * Math.sin(Math.toRadians(angle));
        StdDraw.setPenColor(penColor);
        StdDraw.setPenRadius(penSize / 512);
        if (isPenDown) {
            StdDraw.line(oldx, oldy, x, y);
        }
        delay(speed);
    }


    public void dot(double size) {
        StdDraw.setPenRadius(size / 512);
        StdDraw.line(x, y, x, y);
        StdDraw.setPenRadius(penSize / 512);
        delay(speed);
    }


    public void delay(int t) {
        StdDraw.show(t);
    }


    public void penColor(String color) {
        penColor = getColor(color);
        StdDraw.setPenColor(penColor);
    }

    public double x() {
        return x;
    }


    public double y() {
        return y;
    }


    public boolean isDown() {
        return isPenDown;
    }


    private Color getColor(String color) {
        Color c = Color.RED;
        color = color.replaceAll("_", "").replaceAll(" ", "").toLowerCase();
        if (colorNames.containsKey(color)) {
            c = colorNames.get(color);
        } else {
            try {
                c = new Color(Integer.parseInt(color, 16));
            } catch (Exception e2) {
                System.out.println(":)");
            }
        }
        return c;
    }


    public void worldCoordinates(double minx, double miny, double maxx, double maxy) {
        StdDraw.setXscale(minx, maxx);
        StdDraw.setYscale(miny, maxy);
    }


    public void bye() {
        System.exit(0);
    }

}