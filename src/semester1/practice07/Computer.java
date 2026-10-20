package semester1.practice07;

public class Computer {
    private String title;
    private Processor cpu;
    private Memory ram;
    private double casePrice;

    public Computer(String title, Processor cpu, Memory ram, double casePrice) {
        this.title = title;
        this.cpu = cpu;
        this.ram = ram;
        this.casePrice = casePrice;
    }

    public double calculateTotalPrice() {
        return casePrice + cpu.getPrice() + ram.getPrice();
    }

    public void updateMemory(Memory newRam) {
        ram = newRam;
    }

    public void printSpecs() {
        System.out.println(title + ": " + calculateTotalPrice() +
                "\n Процесор:" + cpu.toPrettyString() +
                "\n Память:" + ram.toPrettyString());
    }
}

class Processor {
    private String model;
    private double frequencyGHz;
    private double price;

    public Processor(String model, double frequencyGHz, double price) {
        this.model = model;
        this.frequencyGHz = frequencyGHz;
        this.price = price;
    }

    public String toPrettyString() {
        return model + "(" + frequencyGHz + " GHz) - " + price + " грн";
    }

    public double getPrice() {
        return price;
    }
}

class Memory {
    private int sizeGB;
    private int frequencyMHz;
    private double price;

    public Memory(int sizeGB, int frequencyMHz, double price) {
        this.sizeGB = sizeGB;
        this.frequencyMHz = frequencyMHz;
        this.price = price;
    }

    public String toPrettyString() {
        return sizeGB + " (" + frequencyMHz + " MHz) - " + price + " грн";
    }

    public double getPrice() {
        return price;
    }
}