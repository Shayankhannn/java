package DefensiveProgramming;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class TryWithesources {
    public static void main(String[] args){
        // try-with automatically close resources after code is executed
        // automatic cleanup resource
        try (FileInputStream fis = new FileInputStream("providefilename.txt")){
        int content;
        while ((content = fis.read()) != -1){
            System.out.println((char) content);
        }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
