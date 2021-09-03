public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
            //casting
            int myFavoriteNumber = 25;
            String myString = "Shelby";
//                    you cannot shove a char into a string
            System.out.print("Hello, World!\n" + myString + myFavoriteNumber);
            System.out.println(" and Good Morning!");
            System.out.println(myFavoriteNumber);
            System.out.println(myString);
         /* myString prints out in another line
            myString = 3.14159;
            not allowed */
//            long myNumber = 123L;
//            System.out.println(myNumber);
//            this WORKS

//            myNumber = 3.14;
//          we can't do this bc possible lossy conversion from double to long
            float myNumber = 3.14F;
//            w/o the f we can't do this bc possible lossy conversion from double to float
            myNumber = 123;
            System.out.println(myNumber);
//          9 you can fix by casting as float instead of an                 integer
            double piNumber = 3.14;
//          float does not work but double does
//          int x = 5;
//          System.out.println(x++);
//          System.out.println(x);
//            in this one it gets printed out and THEN incremented so we just get 6 once
            int x = 5;
            System.out.println(++x);
            System.out.println(x);
//            gets incremented FIRST and then output so we get 6 twice
//            String class = "booboop";
//            the compiler and the jvn are expecting a class to be defined but that's not what it's getting
            String theNumberThree = "three";
            Object o = theNumberThree;
            int three = (int) o;
//            class cast exception error if we comment out int
//          the variable theNumberThree contains a ref to the object, o contains a ref to the string
//            If you get rid of three the issue stays even though you don’t see an error

//            int x = 4;
//            x += 5;

//            int x = 3;
//            int y = 4;
//            y *= x;

//            int x = 10;
//            int y = 2;
//            x /= y;
//            y -= x;

// What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//            Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

            System.out.println(Integer.MAX_VALUE);
        }
}



