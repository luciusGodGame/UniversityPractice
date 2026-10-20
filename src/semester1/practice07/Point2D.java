package semester1.practice07;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        x = 0.0;
        y = 0.0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distanceTo(double targetX, double targetY) {
        return Math.sqrt((x * targetX) + (y * targetY));
    }

    public void printPoint() {
        System.out.println("Point(" + x + "; " + y + ")");
    }
}
