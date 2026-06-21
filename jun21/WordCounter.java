import java.io.*;

public class WordCounter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        int count = 0;
        String line;
        while ((line = br.readLine()) != null)
            count += line.split("\\s+").length;
        br.close();
        System.out.println("Words: " + count);
    }
}