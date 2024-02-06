package Task_3;

public class Test3 {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        System.out.println("First triangle shape is: " + t1.getTriangleType());

        Triangle t2 = new Triangle(3);
        t2.side3=4;
        System.out.println("Second triangle shape is: " + t2.getTriangleType());

        Triangle t3 = new Triangle(3, 4,5);
        System.out.println("Third triangle shape is: " + t3.getTriangleType());
    }
}
