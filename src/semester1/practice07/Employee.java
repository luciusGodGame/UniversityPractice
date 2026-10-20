package semester1.practice07;

public class Employee {
    private int id;
    private String fullName;
    private String position;
    private double monthlySalary;

    public Employee(int id, String fullName, String position, double monthlySalary) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.monthlySalary = monthlySalary;
    }

    public void raiseSalary(double percent) {
        monthlySalary = monthlySalary * (percent * 0.01);
    }

    public double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public void printBadge() {
        System.out.println("№" + id + ": " + fullName + ", " + position + ". " + monthlySalary + " грн.");
    }
}
