package Projects.writingDifferentFilesTypes;

import java.io.*;
import java.util.Scanner;

public class Main {

    // Task 2 - Write Person to file1.txt using FileWriter
    // TODO 4: Add a static method textFileWrite() that returns void
    public static void textFileWrite() {
        Person person = new Person("john", 23, 34);
        String personString = person.toString();
        try (FileWriter writer = new FileWriter("file1.txt")) {
            writer.write(personString);
            System.out.println("file written with filewriter");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    // TODO 5: Create Person object
    // TODO 6-7: Write to file using FileWriter in try-catch
    // TODO: Print message "File written with FileWriter..."


    //  Task 3 - Write user input to file2.txt using PrintWriter
    // TODO 8: Define a static method printWrite() that returns void
    // TODO 9: Take input using Scanner
    // TODO 10: Create Person object
    // TODO 11-12: Write to file using PrintWriter in try-catch
    // TODO: Print message "File written with PrintWriter..."
    public static void printWrite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();

        System.out.println("Enter your weight");
        double weight = in.nextDouble();
        System.out.println("Enter your age");
        int age = in.nextInt();
        Person person = new Person(name, age, weight);
        try (PrintWriter writer = new PrintWriter("file2.txt")) {
            writer.println(person.toString());
            System.out.println("File written with PrintWriter...");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Task 4 - Write byte array to binary file3.dat using FileOutputStream
    // TODO 13: Define a static method writeBinaryNumbers() that returns void
    // TODO 14: Declare byte array
    // TODO 15-17: Write bytes using FileOutputStream in try-catch
    // TODO: Print message "File written with FileOutputStream..."
    public static void writeBinaryNumbers() {
        byte[] arr = {1, 2, 3, 4, 5, 6};

        try (FileOutputStream outputStream = new FileOutputStream("file3.dat")) {
            for (byte arrbyte : arr) {
                outputStream.write(arrbyte);
                System.out.println("File written with FileOutputStream...");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    // Task 5 - Write Person object to binary file4.dat using DataOutputStream
    //TODO 18: Define a static method writePersonBinary() that returns void
    // TODO 19: Read input using Scanner
    // TODO 20: Create Person object
    // TODO 21-23: Write attributes using DataOutputStream in try-catch
    // TODO: Print message "File written with DataOutputStream..."
    public static void writePersonBinary() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();

        System.out.println("Enter your weight");
        double weight = in.nextDouble();
        System.out.println("Enter your age");
        int age = in.nextInt();
        Person person = new Person(name, age, weight);
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("file4.dat"))) {
            dataOutputStream.writeUTF(person.name);
            dataOutputStream.writeInt(person.age);
            dataOutputStream.writeDouble(person.weight);
            System.out.println("File written with DataOutputStream...");
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        // TODO 24: Call all static methods to test
        textFileWrite();
        printWrite();
        writeBinaryNumbers();
        writePersonBinary();
    }
}
