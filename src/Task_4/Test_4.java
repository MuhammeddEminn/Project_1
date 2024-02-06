package Task_4;

public class Test_4 {
    public static void main(String[] args) {
        Time t1 = new Time(12,30, 30);
            t1.showTime1(true);
            t1.showTime1(false);
            System.out.println("Day part is: " + t1.getDayPart());

            Time t2 = new Time(11);
            t2.showTime1(true);
            t2.showTime1(false);
            System.out.println("Day part is: " + t2.getDayPart());

        Time t3 = new Time(22,15, 15);
        t3.showTime1(true);
        t3.showTime1(false);
        System.out.println("Day part is: " + t3.getDayPart());
    }
}
