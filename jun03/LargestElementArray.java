public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 89};

        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }

        System.out.println("Largest: " + max);
    }
}