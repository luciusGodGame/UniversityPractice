package semester1.practice07;

public class LineSegment {
    private Point start;
    private Point end;

    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public LineSegment(double x1, double y1, double x2, double y2) {
        start = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public double getLenght() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public Point getMidPoint() {
        return new Point(start.getX() + end.getX() / 2.0, start.getY() + end.getY() / 2.0);
    }

    public void printSegment() {
        System.out.println("(" + start.getX() + ":" + start.getY() + ") - (" + end.getX() + ":" + end.getY() + ")" +
                "\nДовжина: " + getLenght() +
                "\nТочка посередині: (" + getMidPoint().getX() + ":" + getMidPoint().getY() + ")");
    }
}
