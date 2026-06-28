import java.io.*;

public class SimpleLogger{
    public static void main(String[] args)throws Exception{
        FileWriter fw=new FileWriter("log.txt",true);
        fw.write("Program Executed\n");
        fw.close();
    }
}