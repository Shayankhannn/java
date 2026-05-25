package FileHandling.AppendingData;

import java.io.FileWriter;
import java.io.IOException;

public class ActivityLogger {
    public  static void main(String[] args){
        String filePath = "user_activity.log";
        String newLog = "user sends new message at " + System.currentTimeMillis();

        try(FileWriter fw = new FileWriter(filePath,true)){
            fw.write(newLog);
            System.out.println("new log entry added");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
