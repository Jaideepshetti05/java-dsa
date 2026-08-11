import java.util.*;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 9, 3 };
        int target = 10;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];

            if (map.containsKey(required)) {
                System.out.println("Pair: " + required + " + " + arr[i]);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }
}