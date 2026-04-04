public class KadaneAlgorithm {
    public static int maxSubArray(int[] arr) {
        int max = arr[0], curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
}