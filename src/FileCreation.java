import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreation {
    public static void main(String[] args) {
        //1. defining the path that points to the file
        try {
            String fileLocation = "/home/brwnboi/Desktop/cashout.txt"; // specify your directory.. and file to be created
            Path path = Paths.get(fileLocation);
            System.out.println(path.getFileSystem());
            System.out.println(path.getRoot());
            //2. use a method of class files to work with the path
            Files.write(path, "GOD IS GOOD".getBytes());
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }



    }
}

