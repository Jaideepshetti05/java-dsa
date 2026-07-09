public class SecondLargestArray {
    public static void main(String[] args) {
        int[] arr = {15, 8, 22, 7, 19};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }

        System.out.println(second);
    }
}