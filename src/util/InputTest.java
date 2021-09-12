package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new util.Input();

        input.getString("Enter a string: ");
        input.yesNo("Enter yes or no: ");
        input.getInt(10, 100);
        input.getInt();
        input.getDouble(1, 10);
        input.getDouble();

    }
}
