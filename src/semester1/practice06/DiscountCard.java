package semester1.practice06;

public class DiscountCard {
    private String ownerName;
    private double totalSpent;
    private int discountPercent;

    public DiscountCard(String ownerName) {
        this.ownerName = ownerName;
        discountPercent = 1;
    }

    public void addPurchase(double cost) {
        totalSpent += cost;
        if (totalSpent >= 5000) {
            discountPercent = 5;
            if (totalSpent >= 10000) {
                discountPercent = 10;
            }
        }
    }

    public void printCardInfo() {
        System.out.println(ownerName + " " + totalSpent + " " + discountPercent + "%");
    }
}
