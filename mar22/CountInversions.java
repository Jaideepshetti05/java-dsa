// File: CountInversions.java
import java.util.*;

public class CountInversions {
    static int merge(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
        int i = 0, j = 0, k = l, inv = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                inv += (left.length - i);
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
        return inv;
    }

    static int mergeSort(int[] arr, int l, int r) {
        int inv = 0;
        if (l < r) {
            int m = (l + r) / 2;
            inv += mergeSort(arr, l, m);
            inv += mergeSort(arr, m + 1, r);
            inv += merge(arr, l, m, r);
        }
        return inv;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(mergeSort(arr, 0, arr.length - 1));
    }
}