public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10,45,23,89,12};

        int max = arr[0];

        for(int n : arr) {
            if(n > max)
                max = n;
        }

        System.out.println("Largest = " + max);
    }
}