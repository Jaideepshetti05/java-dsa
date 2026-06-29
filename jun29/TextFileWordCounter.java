import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileWordCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter File Path: ");
        String path = input.nextLine();

        int lines = 0;
        int words = 0;
        int characters = 0;

        try {

            Scanner file = new Scanner(new File(path));

            while (file.hasNextLine()) {

                String line = file.nextLine();

                lines++;

                characters += line.length();

                if (!line.trim().isEmpty()) {
                    words += line.trim().split("\\s+").length;
                }
            }

            file.close();

            System.out.println("Lines : " + lines);
            System.out.println("Words : " + words);
            System.out.println("Characters : " + characters);

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }

        input.close();
    }
}