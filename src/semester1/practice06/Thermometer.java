package semester1.practice06;

public class Thermometer {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double t) {
        if (t < -273.15) {
            System.out.println("Температура не може бути настільки малою");
        } else {
            temperature = t;
        }
    }
}
