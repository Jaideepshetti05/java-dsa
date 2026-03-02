public class BinarySearchRecursive {
    static int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == key) return mid;
        if (arr[mid] > key)
            return binarySearch(arr, left, mid - 1, key);
        return binarySearch(arr, mid + 1, right, key);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 0, arr.length-1, 4));
    }
}