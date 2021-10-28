// What’s a pure function - won’t mutate our website and create a bad user experience
A pure function is a function that does not change anything in the program outside of the scope of the function
// Pure function example
int twoPlusTwo() {
    return 2 + 2;
}
// A Non-pure function
int num = 0;
// calling this function will mutate this var num even tho num is outside of the function
void addTwo() {
    num += 2;
}
// writing unpure functions is an easy way to create bugs that are hard to trace

// What are the four pillars of OOP

// abstraction - Hiding away implementation details of a complex operation with a simple and easy to use interface. 
// We can achieve abstraction using the other three pillars. 
// Example of abstraction from movies project:
function addMovie(movie) {
    return fetch(url, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(movie),
    }).then(getMovies);
}
// Here we abstract away the complexity of adding a movie to a database into a simple function called "addMovie"
// This prevents us from having to write out the same code multiple times

// polymorphism - Polymorphism in Java is the ability of an object to take many forms. Simply put, polymorphism in java allows us to perform the same action in many different ways.
class Shapes {
  public void area() {
    System.out.println("The formula for area of ");
  }
}
class Triangle extends Shapes {
  public void area() {
    System.out.println("Triangle is ½ * base * height ");
  }
}
class Circle extends Shapes {
  public void area() {
    System.out.println("Circle is 3.14 * radius * radius ");
  }
}
class Main {
  public static void main(String[] args) {
    Shapes myShape = new Shapes();  // Create a Shapes object
    Shapes myTriangle = new Triangle();  // Create a Triangle object
    Shapes myCircle = new Circle();  // Create a Circle object
    myShape.area();
    myTriangle.area();
    myShape.area();
    myCircle.area();
    // The Polymorphism here is that all of these shapes can be used in the same way 
    // (They all call the area function)
  }
}

// inheritance - Inheritance lets one object acquire the properties and methods of another object
// Example: 
class Employee {
    String name;
    int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
// Accountant inherits all methods and properties of Employee because it extends the Employee class
class Accountant extends Employee {
    void sayHello() {
        System.out.println("Hi my name is " + this.name);
    }
}
Employee e = new Employee("Jane", 10);
Accountant a = new Accountant("Jane", 10);
String n = a.name;



// Term: Encapsulation
// Definition: Only exposing code to the classes and functions that need it. 
// Example and Explanation:
class Car {
    private int rpm = 200;
    private int horsepower = 10;
    
    public int getSpeed() {
        return rpm * horsepower;
    }
}
// In Java we can use access control (private, public, protected)
// In javascript we use IIFE (Immediately Invoked Function Expressions) 
// you can define a function and then call it in the same expression
// you can use it to implement encapsulation in JS only
var Car = (function(){
    // private
    var rpm = 200;
    var horsepower = 10; 

    return {
        // public
        getSpeed: function() {
            return rpm * horsepower;
        }
    }
})();

// Q: What is an IIFE and why would we use it?
// A: An IIFE is a function that is called as soon as it is defined. It can be used to encapsulate private functionality
// Example: See encapsulation example above

// What’s a higher order function

// These two are well defined in code up readings

// Know method overloading/overwriting

// Method overloading is defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.
// Overloaded methods can call other versions of themselves, and are commonly used to provide default values for arguments.
// Example 
// version 1
public static void sayHello(int times) {
    for (int i = 0; i < times; i += 1) {
        sayHello();
    }
}
// version 2
public static void sayHello() {
    sayHello("Hello", "World");
}
// version 3
public static void sayHello(String name) {
    sayHello("Hello", name);
}
// version 4
public static void sayHello(String greeting, String name) {
    System.out.println(greeting + ", " name "!");
}

//as long as they have diff paremeter types, you can define more than one function using the same name

// Method Overriding is the ability for subclasses(see inheritance) to override methods defined in the class they are extending from
// In addition to adding new fields, subclasses can override methods on the superclass. To do so, the subclass must define a method with the same name, return type, and parameters as in the superclass. This allows the subclass to provide it's own implementation of a method.
class Person {
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}

class Employee extends Person {
    private double salary;
    public void doWork() {
        System.out.println("Work, work...");
    }
    // method overriding
    public void sayHello() {
        System.out.println("How can I help you?");
    }
}
// Here the employee overrides the sayHello function defined in the Person class
// When the sayHello method is called on an instance of the Person class, the code from the sayHello method defined on the Person class will run, but when we call the sayHello method on the instance of the Employee class, the code from the sayHello method defined in the Employee class will run.

// What are BOM and DOMs
    // The Browser Object Model (BOM) allows JavaScript to interact with the web browser.

    // The Document Object Model (DOM) connects web pages to scripts or programming languages by representing the structure of a document—such as the HTML representing a web page—in memory. Usually it refers to JavaScript, even though modeling HTML, SVG, or XML documents as objects are not part of the core JavaScript language.

    // The DOM represents a document with a logical tree. Each branch of the tree ends in a node, and each node contains objects. DOM methods allow programmatic access to the tree. With them, you can change the document's structure, style, or content.

    // Nodes can also have event handlers attached to them. Once an event is triggered, the event handlers get executed.    


// Know checked/unchecked exceptions
// Checked exceptions must be handled in our code, either with a try-catch, or by declaring them in the method signature with the throws keyword. 
// Checked exceptions are enforced by the compiler, meaning that if a checked exception is not handled, the code will not compile.
// Unchecked are mostly exceptions that are built into the Java language, and do not need to be explicitly dealt with.


// Study your projects on your resume

// - WeatherMap

// What are APIs
// API stands for Application Programming Interface and is a way for computers or computer programs to communicate
// Example: Mapbox API: https://docs.mapbox.com/api/overview/
    // Description: The Mapbox web services APIs allow you to programmatically access Mapbox tools and services. You can use these APIs to retrieve information about your account, upload and change resources, use core Mapbox tools, and more.


// - Movie Project

// - Coffee Project 



// Recursion - a function that calls itself in order to get the result 
// the fibonacci equation is recursive because in order to calculate fibonacci for a number you also need to calculate fibonacci for the number before it
int fibonacci(int n) {
    // Base Case
    if (n <= 1) return n;
    // Recursive Call
    return fib(n - 1) + fib(n - 2);
}

// Take a num & multiply that number by 2 10 times
// (Use a for loop)
int num = 5;
for(int i = 0; i < 10; i++) {
    num *= 2;
}

// What’s the difference between == and === and =
// == will check if two values are equal regardless of what type they are
// so ("2" == 2) would be true 
// === will check if two values are equal AND their types are equal 
// ("2" === 2) would be false but (2 === 2) would be true
// = is completely different and doesn't check anything. = is for assignment
// var name = "Shelby"

// What are call back functions - functions that are defined when passed as a parameter to another function
// - event listeners, forEach, Map, filter, reduce
// Example:
button.addEventListener(
    'click', 
    // this is the call back function
    function(e) {
        console.log('button was clicked')
    }
)

// What are abstract classes
// An abstract class is a class that can serve as a superclass, but cannot be directly instantiated. A class is defined as abstract by using the abstract keyword in the class definition. Abstract classes can define abstract methods, which are methods with no body, they only provide information about the method name, return type, and parameters
// We would use an abstract class when we want to force subclasses to provide a unique implementation for a method. Let's look at an example of using an abstract class:
abstract class Employee {
    public abstract String work();
}

class Accountant extends Employee {
    public String work() {
        return "crunching numbers";
    }
}
// Above, the Accountant class must define a work method because it inherits from Employee and is not defined as abstract. We would expect to see a compile error if Accountant did not define a work method.

// What is the 'this' keyword and what it do
// See inheritance 
// The this keyword provides us a way to refer to the current instance. You can think of this as saying "this object". You can only use the this keyword inside of an instance method, as it is an error to do so elsewhere.


class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public sayHello() {
        return String.format("%s says hello!", this.name);
    }
}
// As you can see in the example above, in the constructor, the this keyword lets us unambiguously refer to the name property of the Person object that is being created, even though we already have a variable named name in scope.