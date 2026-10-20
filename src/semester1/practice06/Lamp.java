package semester1.practice06;

public class Lamp {
    private boolean isOn;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void toggle() {
        this.isOn = !this.isOn;
    }

    public void status() {
        if (this.isOn) {
            System.out.println("Лампа світить");
        } else {
            System.out.println("Лампа вимкнена");
        }
    }
}
