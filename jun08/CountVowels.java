import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        int count = 0;

        for(char c : str.toCharArray()){
            if("aeiou".indexOf(c) != -1)
                count++;
        }

        System.out.println(count);
    }
}