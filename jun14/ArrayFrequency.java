import java.util.*;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4,2};

        Map<Integer,Integer> map = new HashMap<>();

        for(int n : arr)
            map.put(n, map.getOrDefault(n,0)+1);

        System.out.println(map);
    }
}