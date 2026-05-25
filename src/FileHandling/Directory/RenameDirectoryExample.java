package FileHandling.Directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class RenameDirectoryExample {
    public static void main(String[] args){
        Path sourceDirectory = Paths.get("user_data/jo_gery");
        Path targetDirectory = Paths.get("user_data/john_smith");

        try{
            if(Files.exists(sourceDirectory)){
                Files.move(sourceDirectory,targetDirectory, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Directory rename successfully " + targetDirectory);
            }else{
                System.out.println("source directory does not exist" + sourceDirectory);
            }
        }catch (IOException e){
            System.out.println("Failed to rename directory");
            e.printStackTrace();
        }

    }
}
