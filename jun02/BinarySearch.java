package jun02;

public class BinarySearch {
    // Returns index of x if it is present in arr[l..r], else returns -1
    public static int binarySearch(int[] arr, int l, int r, int x) {
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x) {
                return m;
            }

            // If x greater, ignore left half
            if (arr[m] < x) {
                l = m + 1;
            } else {
                // If x is smaller, ignore right half
                r = m - 1;
            }
        }

        // Element was not present
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = binarySearch(arr, 0, arr.length - 1, x);
        if (result == -1) {
            System.out.println("Element " + x + " is not present in array");
        } else {
            System.out.println("Element " + x + " is found at index " + result);
        }
    }
}
