import java.util.*;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String s="programming";

        Set<Character> set=new LinkedHashSet<>();

        for(char c:s.toCharArray())
            set.add(c);

        for(char c:set)
            System.out.print(c);
    }
}