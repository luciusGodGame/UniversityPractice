package semester1.practice07;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        if (this.price < 0) {
            this.price = 0;
        }
        this.quantity = quantity;
        if (this.quantity < 0) {
            this.quantity = 0;
        }
        this.category = category;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public void applyDiscount(double percent) {
        price = price * (percent * 0.01);
    }

    public void printProduct() {
        System.out.println(name + "(" + price + "грн)" + category + ". " + quantity + "шт." +
                "\nВартість присутнього товару:" + getTotalValue());
    }
}
