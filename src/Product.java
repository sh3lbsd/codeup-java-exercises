import java.util.Scanner;
/* TODO: create a class called Product with two private properties of name and priceInCents.
Add a public static method called, findAveragePrice, that takes in an array of products
and finds the average price of all products. Add a main method to the class to test some
values.
*/
public class Product {
//  Scanner scanner = new Scanner(System.in);

//  private variables
    private String name;
    private int priceInCents;

//  create getters and setters 1st
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

//  constructor
    public Product (String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

//  instance methods
    public void printDetails() {
        System.out.printf("The product name is: %s%nThe product price is: $%.2f", this.name, this.priceInCents / 100.0);
    }

//    static methods
//    this takes in an array of product objects
    public static double getAverageProductPrice(Product[] products) {
        int total = 0;
        // enhanced for loop
        for (Product product : products) {
            total += product.getPriceInCents();
        }
        return / products.length;
    }

    public static void main(String[] args) {
        Product a = new Product("Toothbrush", 199);
        Product b = new Product("Toothpaste", 299);
        Product c = new Product("Toilet paper", 99);
        //        System.out.println(product.findAveragePrice());
        a.printDetails();
        //creates a new line
        System.out.println();
        //creates a new line
        b.printDetails();
        //creates a new line
        c.printDetails();

        // products array
        Product[] products = {
                new Product("Toothbrush", 199),
                new Product("Toothpaste", 299),
                new Product("Toilet paper", 99)
        };

        double average = Product.getAverageProductPrice(products);
        System.out.println(average);

    }
}