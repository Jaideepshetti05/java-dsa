public class SecondLargestWithoutSorting {
    public static void main(String[] args) {
        int[] arr = {12, 8, 55, 21, 55, 30};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
            }
        }

        System.out.println(second);
    }
}