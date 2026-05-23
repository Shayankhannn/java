package FileHandling;
import java.io.File;
public class FilePathExample {

public static void main(String[] args){
//    defining file path

String notesPath = "Documents/notes.txt";
String docsPath = "Documents/docs.txt";
String imagesPath = "Documents/images";
String diagramPath = "Documents/images/diagram.png";

    checkFileOrDirectory(notesPath);
    checkFileOrDirectory(docsPath);
    checkFileOrDirectory(imagesPath);
    checkFileOrDirectory(diagramPath);


}

public static void checkFileOrDirectory(String path){
    File file = new File(path);

    if (file.exists()){
        System.out.println("Path : " + file.getAbsolutePath());
        if (file.isFile()){
        System.out.println("this path points to a file " );

        }else if (file.isDirectory()){
        System.out.println("this path points to a directory " );

        }else{

        System.out.println("this path \"" + path + "\" does not exist" );
        }
        System.out.println();
    }
}

}
