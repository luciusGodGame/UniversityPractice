package semester1.practice07;

public class SalaryCalculator {
    public double calculate(double baseRate) {
        return baseRate;
    }

    public double calculate(double baseRate, double fixedBonus) {
        return baseRate + fixedBonus;
    }

    public double calculate(double baseRate, double bonusPercent, boolean isTaxDeducted) {
        return baseRate * (bonusPercent * 0.01 + 1 - (isTaxDeducted ? 0.195 : 0));
    }

    public double calculate(double baseRate, int overtimeHours, double overtimeHourlyRate) {
        return baseRate + (overtimeHours * overtimeHourlyRate);
    }
}
