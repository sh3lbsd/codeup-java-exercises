package miniExercisesWarmups;
// 4. Create a class called Movie. The class should define two instance variables of type String named 'name' and 'director'. Add a constructor that take two strings and sets the name and director properties based on the passed arguments. Make it so the instance variables are not accessible from outside the Movie class. Write getters n setters for the instance variables
// Bonus: if the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException
// Create a Comedy class that inherits from Movie
// Add a protected instance variable named funny that is boolean
// Add a protected instance variable named funny that is boolean
// Write getters and setters for funny. The getter should be named isFunny
public class MovieWarmup {
    private String name;
    private String director;

    public MovieWarmup(){}

    public MovieWarmup(String name, String director) {
        this.name = name;
        this.director = director;
    }

}
