package semester1.practice07;

public class SmartBulb {
    private int brightness;
    private int colorTemp;
    private boolean isOn;

    public SmartBulb(int brightness, int colorTemp, boolean isOn) {
        this.brightness = brightness;
        this.colorTemp = colorTemp;
        this.isOn = isOn;
        if ((this.brightness < 0) || (this.brightness > 100)) {
            this.brightness = 0;
        }
        if ((this.colorTemp < 2700) || (this.colorTemp > 6500)) {
            this.colorTemp = 4000;
        }
    }

    public SmartBulb(int brightness) {
        this(brightness, 4000, true);
    }

    public SmartBulb() {
        this(50);
    }

    public void printStatus() {
        System.out.println("Яскравість: " + brightness +
                "\nТемпература: " + colorTemp +
                "\nВключений:" + isOn);
    }
}
