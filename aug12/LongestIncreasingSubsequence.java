import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };

        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);

        int answer = 1;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            answer = Math.max(answer, dp[i]);
        }

        System.out.println("LIS length: " + answer);
    }
}