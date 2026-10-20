package semester1.practice06;

public class TemperatureTracker {
    private double[] dailyTemps = new double[7];

    public void setTemps(double[] temps) {
        this.dailyTemps = temps;
    }

    public int countDaysAbove(double threshold) {
        int count = 0;
        for (double t : dailyTemps) {
            if (t > threshold) count++;
        }
        return count;
    }

    public void printWeeklyReport() {
        String[] days = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Нд"};
        int hottestDay = 0;
        for (int i = 1; i < dailyTemps.length; i++) {
            if (dailyTemps[i] > dailyTemps[hottestDay]) {
                hottestDay = i;
            }
        }
        for (int i = 0; i < dailyTemps.length; i++) {
            String mark = (i == hottestDay) ? " найтепліший" : "";
            System.out.printf("%s: %.1f°C%s%n", days[i], dailyTemps[i], mark);
        }
    }
}
