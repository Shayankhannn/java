package FileHandling;

import java.io.*;
import java.util.Random;

public class BinaryFile {
    public static void binaryWrite(){
        int sensorid = 1;
        Random rd = new Random();
        float sensorValue = rd.nextFloat();
        String timeStamp = "2024-5-23 16:00:00";
        try(DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("sensorData.bin")
        )){
            dos.writeInt(sensorid);
            dos.writeFloat(sensorValue);
            dos.writeUTF(timeStamp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void binaryRead(){
        try(DataInputStream dis = new DataInputStream(
                new FileInputStream("sensorData.bin")
        )){
            while (true){
                try{
                    int sensorId = dis.readInt();
                    float sensorValue = dis.readFloat();
                    String timeStamp = dis.readUTF();
                    System.out.println("Id:"+sensorId+"sensorvalue:"+sensorValue+"timesamp:"+timeStamp);
                }catch (EOFException e){break;}
                catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

public static void main(String[] args){
        binaryWrite();
        binaryRead();
}

}
