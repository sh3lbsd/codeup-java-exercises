public class Main {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
            //casting
            int myFavoriteNumber = 25;
            String shelby = "Shelby";
            System.out.print("Hello, World!\n" + shelby + myFavoriteNumber);
            System.out.println(" and Good Morning!");
            System.out.println(myFavoriteNumber);
            String myString = "Weeeeewoooo";
            System.out.println(myString);
         /* myString prints out in another line
            char value is incompatible with a string
            myString = 3.14159;
            not allowed */
            long myNumber = 123L;
            System.out.println(myNumber);
//          sets the lossy conversion from double to long
            myNumber = 123;
            System.out.println(myNumber);
//          9 you can fix by casting as float instead of an                 integer
            double piNumber = 3.14;
//          float does not work but double does
//          int x = 5;
//          System.out.println(x++);
//          System.out.println(x);
            int x = 5;
            System.out.println(++x);
            System.out.println(x);
        }
}



