package semester1.practice06;

public class Printer {
    public String model;
    public int paperCount;

    public void printDocument(String title, int pages) {
        if (this.paperCount >= pages) {
            this.paperCount -= pages;
            System.out.println("Успішний друк");
        } else {
            System.out.println("Помилка: Недостатньо паперу в принтері [" + this.model + "]");
        }
    }
}
