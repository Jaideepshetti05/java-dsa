import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String[] words=sc.nextLine().split(" ");

        String ans="";

        for(String w:words)
            if(w.length()>ans.length())
                ans=w;

        System.out.println(ans);
    }
}