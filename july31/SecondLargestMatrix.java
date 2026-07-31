public class SecondLargestMatrix {
    public static void main(String[] args) {
        int[][] a = { { 4, 8 }, { 15, 2 } };
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int[] row : a)
            for (int n : row) {
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