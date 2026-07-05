import java.util.Scanner;

public class PalindromeSentence {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        s=s.replaceAll("[^a-zA-Z]","").toLowerCase();

        String rev=new StringBuilder(s).reverse().toString();

        System.out.println(s.equals(rev)?"Palindrome":"Not Palindrome");
    }
}