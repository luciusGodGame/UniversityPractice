package semester1.practice07;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        if ((this.hours > 23) || this.hours < 0) {
            this.hours = 0;
        }
        this.minutes = minutes;
        if ((this.minutes > 59) || this.minutes < 0) {
            this.minutes = 0;
        }
        this.seconds = seconds;
        if ((this.seconds > 59) || this.seconds < 0) {
            this.seconds = 0;
        }
    }

    public void tick() {
        if (++seconds >= 60) {
            seconds = 0;
            if (++minutes >= 60) {
                minutes = 0;
                if (++hours >= 24) {
                    hours = 0;
                }
            }
        }
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public String toStandartString() {
        if ((hours - 12) > 0) {
            return String.format("%02d:%02d:%02d PM", hours - 12, minutes, seconds);
        }
        return String.format("%02d:%02d:%02d AM", hours, minutes, seconds);
    }
}
