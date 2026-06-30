import java.io.*;

public class TemperatureLogger{

    public static void main(String[] args)throws Exception{

        FileWriter fw=new FileWriter("temperature.txt");

        for(int i=20;i<=30;i++)
            fw.write(i+"\n");

        fw.close();

        System.out.println("Saved");

    }
}