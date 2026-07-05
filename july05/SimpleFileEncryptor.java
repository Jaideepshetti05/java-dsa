import java.io.*;

public class SimpleFileEncryptor{

    public static void main(String[] args) throws Exception{

        FileReader fr=new FileReader("input.txt");

        FileWriter fw=new FileWriter("encrypted.txt");

        int c;

        while((c=fr.read())!=-1){

            fw.write(c+3);
        }

        fr.close();
        fw.close();
    }
}