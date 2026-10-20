package semester1.practice06;

public class ShoppingCart {
    private double[] itemPrices = new double[10];
    private int count = 0;

    public void addItem(double price) {
        if (count < itemPrices.length) {
            itemPrices[count++] = price;
        }
    }

    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += itemPrices[i];
        }
        return total;
    }

    public void applyDiscount(double percent) {
        double factor = 1.0 - percent / 100.0;
        for (int i = 0; i < count; i++) {
            itemPrices[i] *= factor;
        }
    }

    public void printReceipt() {
        for (int i = 0; i < count; i++) {
            System.out.printf("Товар %d: %.2f грн%n", i + 1, itemPrices[i]);
        }
        System.out.printf("Разом: %.2f грн%n", getTotalCost());
    }
}
