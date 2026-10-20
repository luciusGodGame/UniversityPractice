package semester1.practice07;

public class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    public Book() {
        title = "Невідомо";
        author = "Невідомий";
        year = 2000;
        price = 0.0;
    }

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Назва: " + title +
                "\nАвтор:  " + author +
                "\nРік видання: " + year +
                "\nЦіна: " + price);
    }
}
