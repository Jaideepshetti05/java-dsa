import java.io.*;

public class CSVFileReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        String line;
        while((line = br.readLine()) != null){
            String[] arr = line.split(",");
            for(String s : arr)
                System.out.print(s + " ");
            System.out.println();
        }
        br.close();
    }
}