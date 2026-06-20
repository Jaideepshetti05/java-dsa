import java.util.*;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String text = "java python java c python";
        Set<String> set = new LinkedHashSet<>(Arrays.asList(text.split(" ")));
        System.out.println(String.join(" ", set));
    }
}