import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader {

    public static void main(String[] args) {

        String file = "students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                for (String value : data)
                    System.out.print(value + "\t");

                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}