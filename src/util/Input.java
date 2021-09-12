package util;
import java.util.Scanner;

public class Input {
     private Scanner scanner;

     public String getString(String prompt) {
         System.out.println(prompt);
         String userInput = scanner.nextLine();
         return userInput;
     }
    // BONUS: If passed, the method should show the given prompt to the user before parsing the input.
    public String getString(){
        return getString("Enter a String: ");
    }

     public boolean yesNo(String prompt) {
         System.out.println(prompt);
         String userInput = scanner.next();
         if(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
             return true;
         } else {
             return false;
         }
     }
    // BONUS: If passed, the method should show the given prompt to the user before parsing the input.
    public boolean yesNo(){
        return yesNo("Enter yes or no: ");
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public int getInt(){
        return getInt("Enter an integer: ");
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        // If userInput is within the min and max, return the input
        if(userInput > min && userInput < max) {
            return userInput;
        }
        // Otherwise, call getInt again to prompt the user for a new input
        return getInt(min, max);
    }
// BONUS: If passed, the method should show the given prompt to the user before parsing the input.
    public int getInt(int min, int max){
         String prompt = "Enter an integer between " + min + " and " + max + ": ";
        return getInt(min, max, prompt);
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        return userInput;
    }

// BONUS: If passed, the method should show the given prompt to the user before parsing the input.
    public double getDouble(){
        return getDouble("Enter a Decimal: ");
    }

    public double getDouble(double min, double max) {
        String prompt = "Enter a decimal between " + min + " and " + max + ": ";
        return getDouble(min, max, prompt);
    }

// double means decimal
    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        // If userInput is within the min and max, return the input
        if(userInput > min && userInput < max) {
            return userInput;
        }
        // Otherwise, call getInt again to prompt the user for a new input
        return getDouble(min, max, prompt);
    }

//     When an instance of this object is created, the scanner property should be set to  new instance of the Scanner class.
     public Input() {
         this.scanner = new Scanner(System.in);
     }
}
