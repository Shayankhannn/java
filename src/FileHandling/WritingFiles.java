package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingFiles {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = keyboard.next();
        keyboard.close();
        File file = new File("src/"+fileName+".txt");

        //Using the File class to create a new file
//        try {
//            boolean isFileCreated = file.createNewFile();
//            if (isFileCreated){
//                System.out.println("File \"" + fileName + ".txt\" created successfully!");
//            }
//        } catch (IOException ioException) {
//            System.err.println("I/O Exception occurred!");
//            System.err.println(ioException.getMessage());
//        }


//        Using the FileOutputStream class to create a new file


//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
//            writer.write("This is a sample string content for the file.");
//            System.out.println("Data written to file successfully!");
//        }
        try (FileOutputStream outputStream = new FileOutputStream(file)){

           String fileContents = "Sample description for the file";
           byte[] fileContentsByte = fileContents.getBytes();
           outputStream.write(fileContentsByte);

        }catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        }  catch (IOException ioException) {
            System.err.println("I/O Exception occurred!");
            System.err.println(ioException.getMessage());
        }
    }
}
