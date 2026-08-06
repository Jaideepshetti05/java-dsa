public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 20, 45, 12, 78, 54 };

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