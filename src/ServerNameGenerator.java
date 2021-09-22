//Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//        Create a method that will return a random element from an array of strings.
//        Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

public class ServerNameGenerator {
    static String[] nouns = new String[]{
            "cats", "dogs", "pineapple", "curtain", "flower", "chicha", "food", "smoothies", "bowling ball", "zucchini"
    };
    static String[] adjectives = new String[]{
            "ugly", "snooty", "silly", "edgy", "smelly", "smarty", "buff", "sad", "chatty", "cute"
    };

    public static String getRandomValue(String[] array) {
        // this is a java util class for getting random numbers
        int randomIndex = new java.util.Random().nextInt(array.length);
        return array[randomIndex];
    }

    public static void main(String[] args) {
        String nounAdj = getRandomValue(adjectives) + "-" + getRandomValue(nouns);
        System.out.println("Here is your server name: ");
        System.out.println(nounAdj);
    }
}
