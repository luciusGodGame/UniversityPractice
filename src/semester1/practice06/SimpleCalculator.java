package semester1.practice06;

public class SimpleCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtrack(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("ойой..");
            return 0.0;
        }
        return a / (b * 1.00);
    }
}
