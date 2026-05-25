package FileHandling.AppendingData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EfficientLogger {
public static void main(String[] args){
    String filePath = "user_activity.log";
    String newLog  = "user sent  a message at " + System.currentTimeMillis();
    try(BufferedWriter bw=new BufferedWriter(new FileWriter(filePath))){
        bw.write(newLog);
        System.out.println("log entry added efficiently");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
