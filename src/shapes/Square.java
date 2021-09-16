package shapes;
//    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//        perimeter = 4 x side
//        area = side ^ 2
public class Square extends Rectangle {
    private double side;

//      constructor
        public Square(double side) {
            super(side, side);
//            we put this line is so the private prop gets set upon creation
            this.side = side;
        }

        public double getPerimeter() {
            System.out.println("Square getPerimeter method");

            return 4 * side;
        }

        public double getArea() {
            System.out.println("Square getArea method");
            return side * side;
        }
}



