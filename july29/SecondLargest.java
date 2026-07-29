public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 8, 76, 33 };

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println(second);
    }
}