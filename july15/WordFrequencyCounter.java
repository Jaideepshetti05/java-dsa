import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "java python java c++ java python";
        Map<String, Integer> map = new HashMap<>();

        for (String word : text.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}