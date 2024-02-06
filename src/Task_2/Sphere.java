package Task_2;

public class Sphere {
    private int radius;
    private final double PI=3.14;

    public Sphere(int radius) {
        this.radius=radius;
    }

    public Sphere() {
        this.radius=1;
    }

    double getSurfaceArea() {
      return 4*PI*radius*radius;
    }

    double getVolume() {
        return 4.0/3*PI*radius*radius*radius;
    }
}
