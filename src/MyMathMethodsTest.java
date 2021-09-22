public class MyMathMethodsTest {

    public static int mathTestInt = -23;
    public static int absoluteValueTest = Math.abs(mathTestInt);
    public static void main(String[] args) {
//        System.out.println(absoluteValueTest);
//        MyMathMethods mathMethods = new MyMathMethods();
//        System.out.println(mathMethods.multiply(4, 5));
//        System.out.println(MyMathMethods.multiply(5,5));
//        System.out.println(MyMathMethods.multiply(5.6., 3.4));
        int[] myArray = {3, 4, 5};
        System.out.println(MyMathMethods.arraySum(myArray));


    }
}
