import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(add(5, 4));
//        System.out.println(subtract(1, 2));
//        System.out.println(multiply(5, 4));
//        System.out.println(divide(1, 2));
//        System.out.println(modulo(5, 4));
        int userInput = getInteger(1, 10);
    }
    //    number 1
    public static int add ( int num1, int num2) {
            return num1 + num2;
        }

        public static int subtract ( int num1, int num2){
            return num1 - num2;
        }

        public static int multiply ( int num1, int num2){
            return num1 * num2;
        }

        public static int divide ( int num1, int num2){
            return num1 / num2;
        }

        public static int modulo ( int num1, int num2){
            return num1 % num2;
        }

//    number 2.. figured out with Anthony
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = sc.nextInt();
        if(userInput < min || userInput > max) {
            return getInteger(min, max);
        } else {
            return userInput;
        }

    }

    //    number 3

    public static int integerInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int input = sc.nextInt();
            return input;
    }


    public static long factorial(int x) {
        if(x==1) return 1;
        return x * factorial(x-1);
    }


    //    number 4
    public static void diceRoll(int sides, int numberOfDice) {
        for (int i = 1; i <= numberOfDice; i++) {
            int result = (int) Math.floor(Math.random() * ((sides - 1) + 1) + 1);
            System.out.println(result);
        }
    }
    public static void diceRoll() {
        boolean keepGoing = true;
        while (keepGoing) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many sides is the die?");
            int sides = sc.nextInt();
            System.out.println("How many die are you wanting to roll?");
            int numDice = sc.nextInt();
            diceRoll(sides, numDice);
            sc.nextLine();
            String answer = " ";
            while (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")) {
                System.out.println("Keep playing? [Yes/No]");
                answer = sc.nextLine();
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Thanks for playing!");
                keepGoing = false;
            }
        }
    }
}
