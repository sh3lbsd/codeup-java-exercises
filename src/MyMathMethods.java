import java.util.Scanner;
//WARMUP 09/13/21
//Create a class called MyMathMethods
//        Create a method in there called multiply
//Have it take two integer parameters and return the product of the two integers
//Do not create a main method in your MyMathMethods class
//Instead, create a test class, and run your multiply method from a main method in your test class
//If you want a bonus, you can overload the method with a version that takes doubles instead of ints as its parameters
//As another bonus … after you’re done, refactor so the multiply method is static, then refactor your test so as to use the static method
// another bonus: getInput from the user
public class MyMathMethods {

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }


    // 1. use method overloading to create a public static multiply method that works with doubles
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    // 2. write a public static method named quotient that works with both integers and doubles (use method overloading) and returns the result of dividing the two passed numbers.
    public static int divide(int num1, int num2){
        return num1/num2;
    }
    public static double divide(double num1, double num2){
        return num1/num2;
    }
    // 3. Write a public static method named "arraySum" that takes in an array of int numbers (not a list, an array), and returns the sum of the numbers
    public static int arraySum(int[] myNumArray){
        int sum = 0;
        for (int i = 0; i < myNumArray.length; i++) {
            sum += myNumArray[i];
        }
        return sum;
    }
    // 4. Create a class called Movie. The class should define two instance variables of type String named 'name' and 'director'. Add a constructor that take two strings and sets the name and director properties based on the passed arguments. Make it so the instance variables are not accessible from outside the Movie class. Write getters n setters for the instance variables
    // Bonus: if the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException
}
