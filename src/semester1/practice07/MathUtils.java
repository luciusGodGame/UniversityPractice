package semester1.practice07;

public class MathUtils {
    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;

    private MathUtils() {
    }

    public static long factorial(int n) {
        int output = 0;
        for (int i = 1; i <= n; i++) {
            output += i;
        }
        return output;
    }

    public static double power(double base, int exp) {
        double output = 1;
        if (exp == 0) {
            return 1;

        } else if (exp > 0) {
            for (int i = 1; i <= exp; i++) {
                output = output * base;
            }
            return output;
        }
        exp = exp * -1;
        for (int i = 1; i <= exp; i++) {
            output = output * base;
        }
        return 1.0 / output;
    }

    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static int clamp(int val, int min, int max) {
        if (val < min) {
            val = min;
        }
        if (val > max) {
            val = max;
        }
        return val;
    }
}