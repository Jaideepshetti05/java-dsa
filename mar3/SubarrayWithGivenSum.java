import java.util.*;

public class SubarrayWithGivenSum {
    public static void findSubarray(int[] arr, int target) {
        int sum = 0, start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target) {
                sum -= arr[start++];
            }

            if (sum == target) {
                System.out.println("Found from " + start + " to " + end);
                return;
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        findSubarray(arr, 33);
    }
}