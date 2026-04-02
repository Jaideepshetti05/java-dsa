public class BinarySearchRecursive {
    public static int search(int[] arr, int l, int r, int key) {
        if (l > r) return -1;
        int mid = (l + r) / 2;
        if (arr[mid] == key) return mid;
        if (key < arr[mid]) return search(arr, l, mid - 1, key);
        return search(arr, mid + 1, r, key);
    }
}