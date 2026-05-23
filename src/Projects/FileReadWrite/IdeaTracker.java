package Projects.FileReadWrite;
import java.util.Scanner;

public class IdeaTracker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Idea Tracker!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Read Idea from File");
            System.out.println("2. Write Idea to File");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("enter the path of file you want to read!");
                    String filePath = keyboard.next();
                    // TODO 6: Read idea from a file using IdeaReader
                    IdeaReader reader = new IdeaReader();
                    String content = reader.readIdea(filePath);
                    System.out.println(content);

                    break;

                case 2:
                    // TODO 11: Write idea to a file using IdeaWriter
                    System.out.println("please enter the name of the idea :");
                    String ideaName = keyboard.next();
                    keyboard.nextLine();
                    System.out.println("please enter the description of the idea :");
                    String ideaDescription = keyboard.nextLine();
                    IdeaWriter writeIdea = new IdeaWriter();
                    String writeFilePath = "src/" + ideaName + ".txt";
                    writeIdea.writeIdea(writeFilePath,ideaDescription);
                    System.out.println("idea saved successfully to  : " + writeFilePath);


                    break;

                case 3:
                    System.out.println("Thank you for using the Idea Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        keyboard.close();
    }
}
