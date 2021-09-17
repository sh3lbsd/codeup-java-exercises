package shapes;
//Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }














//    1ST SHAPES EXERCISE
//    Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.


//    public class Rectangle {
//    protected double width;
//    protected double length;
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
////        Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
////        perimeter = 2 x length + 2 x width
////        area = length x width
//    public double getPerimeter() {
//        System.out.println("Rectangle getPerimeter method");
//        return ((this.length * 2) + (this.width * 2));
//    }
//
//    public double getArea() {
//        System.out.println("Rectangle getArea method");
//        return this.length * this.width;
//    }
//
//
//    //  default constructor
//    public Rectangle(){};
//
//    //  getters n setters
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }

}
