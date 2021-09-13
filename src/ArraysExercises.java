import java.util.Arrays;

//    Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
public class ArraysExercises extends Person {
    public static Person[] addPerson(Person[] arr, Person addPerson) {
        Person[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[arr.length] = addPerson;
        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
//        // if u print this out you get a ref number

//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person[] people = new Person[3];
        people[0] = new Person("Kristen");
        people[1] = new Person("OJ");
        people[2] = new Person("Anthony");

        for (int i = 0; i < people.length; i += 1) {
            System.out.println(people[i]);
        }
        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println("----------------");
        Person shelby = new Person(("Shelby"));
        people = addPerson(people, shelby);

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}