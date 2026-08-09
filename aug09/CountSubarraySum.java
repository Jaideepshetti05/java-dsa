public class CountSubarraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        int target = 5;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == target) {
                    count++;
                }
            }
        }

        System.out.println("Subarrays: " + count);
    }
}