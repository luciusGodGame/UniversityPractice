package semester1.practice07;

public class Engine {
    private String serialNumber;
    private int horsePower;
    private boolean isRunning;

    public Engine(String serialNumber, int horsePower, boolean isRunning) {
        this.serialNumber = serialNumber;
        this.horsePower = horsePower;
        this.isRunning = isRunning;
    }

    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public String toPrettyString() {
        return "#" + serialNumber + ": " + horsePower + " потужності. Наразі " + (isRunning ? "запущено" : " вимкнений");
    }
}
