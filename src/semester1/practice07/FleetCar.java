package semester1.practice07;

public class FleetCar {
    private static int totalCars = 0;
    private static double totalCompanyMileage = 0.0;
    private String vinCode;
    private double currentMileage;

    public FleetCar(String vinCode, double initialMileage) {
        this.vinCode = vinCode;
        this.currentMileage = initialMileage;
        totalCompanyMileage += initialMileage;
        totalCars++;
    }

    public static void printFleetSummary() {
        System.out.println("Загальна кількість машин: " + totalCars + " (" + totalCompanyMileage + ")");
    }

    public void addTrip(double km) {
        currentMileage += km;
        totalCompanyMileage += km;
    }
}
