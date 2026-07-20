import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        Map<String,Integer> map = new HashMap<>();

        for(String w: words)
            map.put(w, map.getOrDefault(w,0)+1);

        System.out.println(map);
    }
}