import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,2,5,6,5,8};

        Set<Integer> set = new LinkedHashSet<>();

        for(int n:arr)
            set.add(n);

        System.out.println(set);
    }
}