import java.io.*;

public class FileCopyUsingStreams {

    public static void main(String[] args)throws Exception{

        FileInputStream in=new FileInputStream("input.txt");
        FileOutputStream out=new FileOutputStream("output.txt");

        int ch;

        while((ch=in.read())!=-1)
            out.write(ch);

        in.close();
        out.close();

        System.out.println("Copied Successfully");
    }
}