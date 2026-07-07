import java.util.Arrays;

public class FindMedianArray {
    public static void main(String[] args) {
        int[] arr={4,8,1,3,9};

        Arrays.sort(arr);

        System.out.println(arr[arr.length/2]);
    }
}