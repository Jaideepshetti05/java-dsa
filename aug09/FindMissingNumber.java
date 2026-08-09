public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6 };

        int n = arr.length + 1;
        int expected = n * (n + 1) / 2;

        int actual = 0;
        for (int x : arr) {
            actual += x;
        }

        System.out.println("Missing Number: " + (expected - actual));
    }
}