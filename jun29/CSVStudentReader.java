import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVStudentReader {

    public static void main(String[] args) {

        String file = "students.csv";

        String line;

        int highest = 0;
        String topper = "";

        try {

            BufferedReader br = new BufferedReader(new FileReader(file));

            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int marks = Integer.parseInt(data[1]);

                if (marks > highest) {
                    highest = marks;
                    topper = name;
                }
            }

            br.close();

            System.out.println("Topper : " + topper);
            System.out.println("Marks : " + highest);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}