package semester1.practice07;

public class PhysicsEngine {
    public static final double G = 9.80665;
    public static final double SPEED_OF_LIGHT = 299792458.0;

    private PhysicsEngine() {
    }

    public static double freeFallDistance(Double seconds) {
        return G * Math.pow(seconds, 2) / 2.0;
    }

    public static double kineticEnergy(double massKg, double velocityMs) {
        return massKg * Math.pow(velocityMs, 2) / 2.0;
    }

    public static double restEnergy(double massKg) {
        return massKg * Math.pow(SPEED_OF_LIGHT, 2);
    }
}
