import java.util.Scanner;

public class TextStatistics {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        System.out.println("Characters: "+text.length());
        System.out.println("Words: "+text.split("\\s+").length);
    }
}