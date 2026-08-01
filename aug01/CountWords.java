import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        String text = "java python java c java python";
        Map<String, Integer> map = new HashMap<>();

        for (String s : text.split(" "))
            map.put(s, map.getOrDefault(s, 0) + 1);

        System.out.println(map);
    }
}