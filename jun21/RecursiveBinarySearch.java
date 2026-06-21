public class RecursiveBinarySearch {
    static int search(int[] arr, int l, int r, int key) {
        if (l > r) return -1;
        int mid = (l + r) / 2;

        if (arr[mid] == key) return mid;
        if (key < arr[mid])
            return search(arr, l, mid - 1, key);
        return search(arr, mid + 1, r, key);
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(search(arr,0,4,40));
    }
}