package semester1.practice07;

public class DataService {
    private int day;
    private int month;
    private int year;

    public DataService(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void add(int days, int months, int year) {
        day += days;
        if (days > 30) {
            days -= 30;
            months++;
        }
        month += months;
        if (month > 12) {
            month -= 12;
            year++;
        }
        year += year;
    }

    public void add(int days, int months) {
        add(days, months, 0);
    }

    public void add(int days) {
        add(days, 0);
    }

    public void printDate() {
        System.out.printf("%02d.%02d.%04d", day, month, year);
    }
}
