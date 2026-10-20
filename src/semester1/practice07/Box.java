package semester1.practice07;

public class Box {
    private double width;
    private double height;
    private double depth;
    private String material;

    public Box(double width, double height, double depth, String material) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.material = material;
    }

    public Box(double size, String material) {
        this(size, size, size, material);
    }

    public Box(Box other) {
        this(other.width, other.height, other.depth, other.material);
    }

    public double getVolume() {
        return width * height * depth;
    }

    public double getSurfaceArea() {
        return 2 * width + height + depth;
    }

    public void printBox() {
        System.out.println(width + "x" + height + "x" + depth + ", обєм: " + getVolume() + ", поверхність: " +
                getSurfaceArea() + " з матеріалу " + material);
    }
}
