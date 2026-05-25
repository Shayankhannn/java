package FileHandling.Directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryDeletionExample {
    public static void main(String[] args){
        Path path = Paths.get("user_data/jo_grey");
        try{
            Files.delete(path);
            System.out.println("Directory Deleted successfully " + path);
        } catch (IOException e) {
            System.out.println("failed to delete directory " + path);
            throw new RuntimeException(e);
        }
    }
}
