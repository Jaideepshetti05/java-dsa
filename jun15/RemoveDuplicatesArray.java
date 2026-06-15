import java.util.*;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        Integer[] arr = {1,2,2,3,4,4,5};

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(set);
    }
}