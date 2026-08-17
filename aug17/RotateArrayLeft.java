import java.util.*;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;

        k %= arr.length;

        for (int r = 0; r < k; r++) {
            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
        }

        System.out.println(Arrays.toString(arr));
    }
}