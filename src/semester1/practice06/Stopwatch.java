package semester1.practice06;

public class Stopwatch {
    private int seconds;

    public void tick() {
        seconds++;
    }

    public void addSeconds(int s) {
        this.seconds += s;
    }

    public void displayTime() {
        int minutes = this.seconds / 60;
        int secs = this.seconds % 60;
        System.out.printf("%02d:%02d%n", minutes, secs);
    }
}
