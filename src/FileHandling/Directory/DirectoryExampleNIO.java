package FileHandling.Directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExampleNIO {
    public static void main(String[] args){
        Path directoryPath = Paths.get("user_data/jo_gery");
        try{
            //check if directory already exists
            if(Files.exists(directoryPath)){
                System.out.println("directory already exists" + directoryPath);
            }else{
                //create the directory if doesnt exist
                Files.createDirectories(directoryPath);
                System.out.println("directory created " + directoryPath);
            }
        }catch (IOException e){
            System.out.println("failed to create directory" + directoryPath);
            e.printStackTrace();
        }
    }
}
