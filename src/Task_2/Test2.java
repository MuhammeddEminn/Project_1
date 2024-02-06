package Task_2;

public class Test2 {
    public static void main(String[] args) {
        Sphere s1 = new Sphere();
        System.out.println("Surface area of "+"s1"+" is: "+ s1.getSurfaceArea());
        System.out.println("The Volume is: "+ s1.getVolume());

        Sphere s2 = new Sphere(2);
        System.out.println("Surface area of "+"s2"+" is: "+ s2.getSurfaceArea());
        System.out.println("The Volume is: "+ s2.getVolume());
    }
}
