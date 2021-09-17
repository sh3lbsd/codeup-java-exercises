package shapes;
//Change your existing Square class to extend Quadrilateral.
//
//        Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.
public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }










//    1ST SHAPES EXERCISE
//    In the Square class, override the getArea and         getPerimeter methods with the following              definitions for a square
//        perimeter = 4 x side
//        area = side ^ 2


//    public class Square extends Rectangle {
//    private double side;
//
////      constructor
//        public Square(double side) {
//            super(side, side);
////            we put this line is so the private prop gets set upon creation
//            this.side = side;
//        }
//
//        public double getPerimeter() {
//            System.out.println("Square getPerimeter method");
//
//            return 4 * side;
//        }
//
//        public double getArea() {
//            System.out.println("Square getArea method");
//            return side * side;
//        }
}



