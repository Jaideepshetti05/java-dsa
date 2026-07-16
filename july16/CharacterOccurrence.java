import java.util.*;

public class CharacterOccurrence {

    public static void main(String[] args) {

        String s="programming";

        Map<Character,Integer> map=new HashMap<>();

        for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);

        System.out.println(map);
    }
}