package shapes;
//Modify your ShapesTest class, use it to:
//
//        declare a variable of the type Measurable named myShape.
//        Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.
public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4, 5);
        //        Measurable myShape = new Square(5);

        Quadrilateral theirShape = new Rectangle(3,4);
        System.out.println(theirShape.getLength());
        System.out.println(theirShape.getWidth());

        // TODO: Why does the code fail to complile if you leave off the getPerimeter method in Rectangle?

        // it's defined in the Measurable interface and is an abstract method, it's required in the Rectangle class to show implementation.

        //TODO: What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?

        // The getters should only be accessible in Quadrilateral because that is where they are defined. if we wanted to use these methods we would need to ref the Quadrilateral type.














//    1ST SHAPES EXERCISE
////    Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,
//    public static void main(String[] args) {
////        create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//        Rectangle box1 = new Rectangle(5, 4);
////        verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
////      Create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//        Rectangle box2 = new Square(5);
////        verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//
//
////        Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?
    }
}
