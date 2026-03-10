import java.util.*;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        Set<Integer> set = new LinkedHashSet<>();

        for(int i:arr)
            set.add(i);

        System.out.println(set);
    }
}