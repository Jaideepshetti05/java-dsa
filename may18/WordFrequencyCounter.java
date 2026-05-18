import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "java is powerful and java is easy";
        String[] words = text.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}