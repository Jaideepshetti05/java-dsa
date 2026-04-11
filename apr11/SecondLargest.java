import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }
}