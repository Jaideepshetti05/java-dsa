import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c : str.toCharArray())
            set.add(c);

        for(char c : set)
            System.out.print(c);
    }
}