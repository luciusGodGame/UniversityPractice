package semester1.practice07;

import java.util.Arrays;

public class Order {
    private Customer customer;
    private OrderProduct[] items;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(OrderProduct p) {
        if (items == null) {
            items = new OrderProduct[]{p};
            return;
        }
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = p;
    }

    public double calculateTotal() {
        int totalPrice = 0;
        for (OrderProduct p : items) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    public boolean checkout() {
        if (customer.pay(calculateTotal())) {
            System.out.println("ЧЕК:");
            for (OrderProduct p : items) {
                System.out.println(p.toPrettyString());
            }
            System.out.println("Загалом:" + calculateTotal());
            return true;
        }
        System.out.println("Недостатньо коштів!");
        return false;
    }
}

class OrderProduct {
    private int id;
    private String title;
    private double price;

    public OrderProduct(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public String toPrettyString() {
        return title + ": " + price + " грн";
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;
    private double walletBalance;

    public Customer(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public boolean pay(double amount) {
        if (amount > walletBalance) {
            return false;
        }
        walletBalance -= amount;
        return true;
    }
}
