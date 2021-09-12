package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        boolean isRunning = true;
        // this is the input class constructor so we can use the getDouble method to find the radius of the
        Input input = new util.Input();
        int numCircles = 0;
        // while isRunning variable is true then keep making circles
        while(isRunning) {
            numCircles++;
            double radius = input.getDouble("Enter a radius: ");
            Circle circle = new shapes.Circle(radius);
            circle.getArea();
            circle.getCircumference();
            //set is running to the value of the input.yesNo
            //if it's false, list how many circles have been made
            boolean userTypedYes =  input.yesNo("Would you like to make another circle?");
            if(userTypedYes) {
                isRunning = true;
            } else {
                isRunning  = false;
            }
        }
        System.out.println(" You made " + numCircles + " circles.");
    }
}
