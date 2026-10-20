package semester1.practice06;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public boolean isValid() {
        if (a + b < c) {
            return false;
        }
        if (a + c < b) {
            return false;
        }
        if (b + c < a) {
            return false;
        }
        return true;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        if (!isValid()) {
            return 0.0;
        }
        double halfP = getPerimeter() / 2.0;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }
}
