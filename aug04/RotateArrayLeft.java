import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 2;

        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++)
            res[i] = arr[(i + d) % n];

        System.out.println(Arrays.toString(res));
    }
}