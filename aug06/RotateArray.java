import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;

        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            res[(i + k) % arr.length] = arr[i];

        System.out.println(Arrays.toString(res));
    }
}