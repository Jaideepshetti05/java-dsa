import java.io.*;

public class PrimeFileWriter{
    public static void main(String[] args)throws Exception{
        FileWriter fw=new FileWriter("prime.txt");

        for(int i=2;i<=100;i++){
            boolean prime=true;

            for(int j=2;j*j<=i;j++)
                if(i%j==0)
                    prime=false;

            if(prime)
                fw.write(i+"\n");
        }

        fw.close();
    }
}