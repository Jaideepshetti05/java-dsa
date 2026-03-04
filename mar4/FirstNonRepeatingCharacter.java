import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char c : str.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);

        for(char c : map.keySet()){
            if(map.get(c)==1){
                System.out.println("First Non Repeating: "+c);
                break;
            }
        }
    }
}