package shapes;
//Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
public class Rectangle {
    protected double width;
    protected double length;

    public double Rectangle(length, width) {
        super(length, width);
    }

    public void setLength(double length) {

    }

    public void setWidth(double width) {

    }

//        Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//        perimeter = 2 x length + 2 x width
//        area = length x width
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public double getArea() {
        return length * width;
    }

}
