package movies;
//        Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
import util.Input;
import java.util.ArrayList;
import java.util.Arrays;

//Give the user a list of options for viewing all the movies or viewing movies by category.
//If a category is selected, only movies from that category should be displayed.
//        Your application should continue to run until the user chooses to exit.
//Bonus: Add functionality to allow a user to add a new movie to the list.
public class MoviesApplication {
    static ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(MoviesArray.findAll()));

    public static void viewAllMovies(){
        for (Movie movie : movies) {
            System.out.println(movie.getName());
        }
    }

    public static void viewAnimatedMovies() {
        for (Movie movie : movies) {
            if (movie.getCategory() == "animated") {
                System.out.println(movie.getName());
            }
        }
    }

    public static void viewDramaMovies() {
        for (Movie movie : movies) {
            if (movie.getCategory() == "drama") {
                System.out.println(movie.getName());
            }
        }
    }

    public static void viewHorrorMovies() {
        for (Movie movie : movies) {
            if (movie.getCategory() == "horror") {
                System.out.println(movie.getName());
            }
        }
    }

    public static void viewScifiMovies() {
        for (Movie movie : movies) {
            if (movie.getCategory() == "scifi") {
                System.out.println(movie.getName());
            }
        }
    }

    public static void addNewMovie() {
        Input input = new util.Input();
        String name = input.getString("Enter a movie: ");
        String category = input.getString("Enter a category: ");
        Movie movie = new Movie(name, category);
        movies.add(movie);
    }

    public static void listOptions(){
    System.out.println("What would you like to do?");
    System.out.println("0 - exit");
    System.out.println("1 - view all movies");
    System.out.println("2 - view movies in the animated category");
    System.out.println("3 - view movies in the drama category");
    System.out.println("4 - view movies in the horror category");
    System.out.println("5 - view movies in the scifi category");
    System.out.println("6 - add a new movie with the coinciding category");

    Input input = new util.Input();
    int option = input.getInt();

    switch (option) {
        case 1 : viewAllMovies();
        break;
        case 2 : viewAnimatedMovies();
        break;
        case 3 : viewDramaMovies();
        break;
        case 4 : viewHorrorMovies();
        break;
        case 5 : viewScifiMovies();
        break;
        case 6 : addNewMovie();
        break;
        case 0 :
        break;
        default :
            System.out.println("Enter your choice: ");
            listOptions();
        break;
        }
        if (input.yesNo("Would like you like to continue?")) {
            listOptions();
        }
    }




    public static void main(String[] args) {
        listOptions();
    }
}
