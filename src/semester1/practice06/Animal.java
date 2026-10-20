package semester1.practice06;

public class Animal {
    public String species;
    public String name;

    public void makeSound() {
        System.out.println(this.name + " видає звук!");
    }

    public void printInfo() {
        System.out.println("Це " + this.species + " виду " + this.name);
    }
}
