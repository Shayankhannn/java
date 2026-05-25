package FileHandling;

import java.io.*;

public class Encoding {
    public static void writeUTF8( ){
    try(OutputStreamWriter writer = new OutputStreamWriter(
            new FileOutputStream( "patient.txt"),"UTF-8"
    )){
        writer.write("Jose alvarez\n");
        writer.write("Muller\n");
        writer.write("赵赵\n");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
    public static void readUTF8(){
        try(InputStreamReader reader = new InputStreamReader(
                new FileInputStream("patient.txt"),"UTF-8"
        )){
            int data;
            while ((data = reader.read()) != -1){
                System.out.println((char) data) ;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readISO(){
        StringBuilder content = new StringBuilder();
        // read file with iso-8859-1 encoding
        try(InputStreamReader reader = new InputStreamReader(
                new FileInputStream("patient.txt"),"ISO-8859-1"
        )){
            int data ;
            while((data = reader.read()) != -1){
            content.append((char) data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("patientutf8.txt"),"UTF-8"
        )){
            writer.write(content.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args){
        System.out.println("hello world");

        writeUTF8();
        readUTF8();
    }

}
