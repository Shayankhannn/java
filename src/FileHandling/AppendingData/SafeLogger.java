package FileHandling.AppendingData;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class SafeLogger {
    public static void main(String[] args){
        Path filePath = Path.of("user-activity.log");
        String newLog = "user updated profile at"+ System.currentTimeMillis();
        try(FileChannel channel = FileChannel.open(filePath, StandardOpenOption.WRITE,StandardOpenOption.APPEND)){
            // lock the file exclusively
            FileLock lock= channel.lock();
            try{
                // convert the bygte entry to byte buffer
                ByteBuffer buffer = ByteBuffer.wrap(newLog.getBytes());
                // write the buffer to the file
                while (buffer.hasRemaining()){
                    channel.write(buffer);
                }
                System.out.println("log entry added with safe concurrent access");

            }finally {
                //release the lock
                lock.release();

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
