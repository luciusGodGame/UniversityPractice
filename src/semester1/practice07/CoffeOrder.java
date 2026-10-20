package semester1.practice07;

public class CoffeOrder {
    private String type;
    private String size;
    private int sugarCount;
    private boolean withSyrup;
    private double finalPrice;

    public CoffeOrder(String type, String size, int sugarCount, boolean withSyrup) {
        this.type = type;
        this.size = size;
        this.sugarCount = sugarCount;
        this.withSyrup = withSyrup;
    }

    public CoffeOrder(String type, String size) {
        this(type, size, 0, false);
    }

    public CoffeOrder(String type) {
        this(type, "Medium");
    }

    private double calculatePrice() {
        double price = 0;
        switch (type) {
            case "Експресо" -> price += 40;
            case "Капучино" -> price += 55;
            case "Лате" -> price += 60;
        }
        switch (size) {
            case "Small" -> price = price * 1.0;
            case "Medium" -> price = price * 1.3;
            case "Large" -> price = price * 1.6;
        }
        if (withSyrup) {
            price += 15;
        }
        return price;
    }

    public void printReceipt() {
        System.out.println("Стаканчик" + type + " (" + size + ") " + sugarCount + " ложок цукру, сироп: " + withSyrup);
    }
}
