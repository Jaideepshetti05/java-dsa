public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = { 0, 5, 0, 3, 8, 0, 2 };

        int index = 0;

        for (int n : arr) {
            if (n != 0) {
                arr[index++] = n;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}