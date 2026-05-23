package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args){

        File file = new File("src/ReadingFile.txt");


//        buffer Reader

//        try (BufferedReader inputStream = new BufferedReader(new FileReader(myTest))) {
//            int character;
//            while ((character = inputStream.read()) != -1) {
//                System.out.print((char) character);
//            }

//    file input stream
    try (FileInputStream inputStream= new FileInputStream(file)){

        byte[] fileContentsAsBytes = inputStream.readAllBytes();
        for (int i = 0; i < fileContentsAsBytes.length;i++){
            System.out.println((char) fileContentsAsBytes[i]);
        }

    } catch (FileNotFoundException e) {
        System.err.println("File Not Found!");
    } catch (IOException ioException) {
        System.err.println(ioException.getMessage());
    }


    }
}
