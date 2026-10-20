package semester1.practice07;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private boolean engineStarted;

    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        engineStarted = false;
    }

    public Car(String brand, String model, int year) {
        this(brand, model, year, 0.0);
    }

    public Car() {
        this("Unknown", "Standart", 2024);
    }

    public void startEngine() {
        engineStarted = true;
    }

    public void stopEngine() {
        engineStarted = false;
    }

    public void drive(double distance) {
        if (engineStarted) {
            mileage += distance;
            return;
        }
        System.out.println("Cпершу заведіть двигун!");
    }
}
