public class CC71 {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 7, 89, 34, 89 };
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second Largest = " + second);
    }
}