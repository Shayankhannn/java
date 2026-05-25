package FileHandling.Navigating;

import java.io.File;

public class SimpleDirectoryTraversal {
    public static void main(String[] args){
        File directory = new File("D:\\Java");

        File[]  filesList  = directory.listFiles();
        if(filesList != null){
            for(File file : filesList){
                if (file.isFile()){
                    System.out.println("file" + file.getName());
                }else if(file.isDirectory()){
                    System.out.println("directory" + file.getName());

                }
            }
        }else{
                    System.out.println("the directory does not exist or is not accessible");

        }
    }
}
