package semester1.practice06;

public class TrafficLight {
    private String currentColor;

    public void changeColor(String newColor) {
        this.currentColor = newColor;
    }

    public void showSignal() {
        switch (currentColor) {
            case "Червоний" -> System.out.println("Стій");
            case "Жовтий" -> System.out.println("Увага!");
            case "Зелений" -> System.out.println("Їдь!");
        }
    }
}
