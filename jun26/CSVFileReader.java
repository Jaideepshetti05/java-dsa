import java.io.*;

public class CSVFileReader {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));

        String line;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            System.out.println("Name: " + data[0] + " Marks: " + data[1]);
        }

        br.close();
    }
}