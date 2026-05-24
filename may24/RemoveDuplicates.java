import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for(char ch : str.toCharArray()) {
            if(!set.contains(ch)) {
                System.out.print(ch);
                set.add(ch);
            }
        }
    }
}