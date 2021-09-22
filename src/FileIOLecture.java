import java.io.IOException;
import java.nio.file.*;

public class FileIOLecture {
    public static void main(String[] args) {
        Path pathToOurDataDir = Paths.get("src/data");
        try {
            Files.createDirectory(pathToOurDataDir);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Path pathToTestDataDir = Paths.get("src/test");
        try {
            Files.createDirectory(pathToTestDataDir);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
