import java.util.*;

public class CountWordFrequency {
    public static void main(String[] args) {
        String s="java python java c java python";

        Map<String,Integer> map=new HashMap<>();

        for(String word:s.split(" "))
            map.put(word,map.getOrDefault(word,0)+1);

        System.out.println(map);
    }
}