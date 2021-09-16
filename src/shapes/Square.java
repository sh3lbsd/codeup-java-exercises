package shapes;
//    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//        perimeter = 4 x side
//        area = side ^ 2
public class Square extends Rectangle {

        public Square(double side) {
            super(side, side);
        }

        public double getPerimeter() {
            return 4 * length;
        }

        public double getArea() {
            return length * width;
        }

        public void setLength(double length) {
            this.length = length;
            this.width = length;
        }

        public void setWidth(double width) {
            this.width = width;
            this.length = width;
        }
}



