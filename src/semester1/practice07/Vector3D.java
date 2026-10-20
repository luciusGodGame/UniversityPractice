package semester1.practice07;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        this(0.0, 0.0, 0.0);
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public double dotProduct(Vector3D other) {
        return (this.x * other.x) + (this.y * other.y) + (this.z * other.z);
    }

    public Vector3D crossProduct(Vector3D other) {
        return new Vector3D((this.y * other.z) - (this.z * other.y),
                (this.z * other.x) - (this.x * other.z),
                (this.x * other.y) - (this.y * other.x));
    }

    public boolean isOrthogonalTo(Vector3D other) {
        return dotProduct(other) == 0;
    }

    public boolean isEqualTo(Vector3D other) {
        return (this.x == other.x) &&
                (this.y == other.y) &&
                (this.z == other.z);
    }
}
