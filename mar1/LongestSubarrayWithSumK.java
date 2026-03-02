import java.util.*;

public class LongestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) maxLen = i + 1;

            if (!map.containsKey(sum))
                map.put(sum, i);

            if (map.containsKey(sum - k))
                maxLen = Math.max(maxLen, i - map.get(sum - k));
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        System.out.println(longestSubarray(arr, 15));
    }
}