package semester1.practice07;

public class AreaCalculator {
    public double calculateArea(double side) {
        return Math.pow(side, 2);
    }

    public double calculateArea(double width, double height) {
        return width * height;
    }

    public double calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * Math.pow(radius, 2);
        }
        return calculateArea((radius));
    }

    public double calculateAreaTriangle(double a, double b, double c) {
        double halfP = a + b + c / 2.0;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    public double calculateArea(double base1, double base2, double height) {
        return base1 + base2 / 2 * height;
    }
}
