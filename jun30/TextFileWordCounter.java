import java.io.*;

public class TextFileWordCounter {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

        int words=0;

        String line;

        while((line=br.readLine())!=null){
            words += line.split("\\s+").length;
        }

        br.close();

        System.out.println(words);
    }
}