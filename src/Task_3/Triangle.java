package Task_3;

public class Triangle {
    public int side1, side2, side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    Triangle(){
        this(1,1,1);
    }

    Triangle(int side1){
        this(side1,side1,side1);
    }

    public String getTriangleType(){
        if (side1==side2 && side2==side3){
    return "Equilateral";
        }else if (side1==side2 || side2==side3 || side1==side3 ){
            return "Isosceles";
        }else {
            return "Scalene";
        }
    }
}
