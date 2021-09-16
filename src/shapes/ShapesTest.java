package shapes;

public class ShapesTest {
//    Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,
    public static void main(String[] args) {
//        create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Length: " + box1.getLength() + ". Width: " + box1.getWidth());
        System.out.println("Perimeter: " + box1.getPerimeter() + ". Area: " + box1.getArea());
//        verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        System.out.println(myShape.getArea()); // should expect 20 for rectangle
        System.out.println(myShape.getPerimeter()); // should expect 18 for rectangle

//      Create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        Rectangle box2 = new Square(5);
        System.out.println("Length: " + box2.getLength() + ". Width: " + box2.getWidth());
        System.out.println("Perimeter: " + box2.getPerimeter() + ". Area: " + box2.getArea());
//        verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        System.out.println(myShape.getArea()); // should expect 25 for square
        System.out.println(myShape.getPerimeter()); // should expect 20 for square


//        Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?
    }
}
