import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);

        System.out.println(map);
    }
}