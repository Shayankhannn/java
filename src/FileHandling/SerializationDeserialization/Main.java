package FileHandling.SerializationDeserialization;

import java.io.*;

public class Main {
    public static void main(String[] args){
        Player gameMaster13 = new Player("john",12,1200);
        try(
                FileOutputStream fileOutputStream = new FileOutputStream("player.ser");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
                ){
            objectOutputStream.writeObject(gameMaster13);
            System.out.println("player object serialized and saved to player.");
        }catch (FileNotFoundException e){

            System.err.println("file not found");
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

        Player restoredPlayer = null;

        try(
                FileInputStream fileInputStream = new FileInputStream("player.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ){
            Object restoredObject = objectInputStream.readObject();
            restoredPlayer = (Player) restoredObject;
            System.out.println("restored object = " + restoredObject);
        }catch (FileNotFoundException e){
            System.err.println("file not found");
        }catch (IOException | ClassNotFoundException e){
            System.err.println(e.getMessage());
        }

    }
}
