import java.io.*;

public class CSVReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            for (String s : data)
                System.out.print(s + " ");
            System.out.println();
        }
        br.close();
    }
}