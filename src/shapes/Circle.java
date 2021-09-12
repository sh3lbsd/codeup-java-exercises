package shapes;
// This class should have a private radius property that is set through the constructor
public class Circle {
    private double radius;

    public double getArea() {
        double area = Math.PI * (this.radius * this.radius);
        System.out.println("The area is: " + area);
        return area;
    }

    public double getCircumference() {
        double circumference = 2 * Math.PI * this.radius;
        System.out.println("The circumference is: " + circumference);
        return circumference;
    }
//the constructor sets the radius
    public Circle(double radius) {
        this.radius = radius;
    }
}
