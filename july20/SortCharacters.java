import java.util.Arrays;
import java.util.Scanner;

public class SortCharacters {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        char[] ch=sc.nextLine().toCharArray();

        Arrays.sort(ch);

        System.out.println(ch);
    }
}