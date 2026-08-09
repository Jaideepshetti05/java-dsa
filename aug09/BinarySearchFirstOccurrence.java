public class BinarySearchFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 4, 5, 6 };
        int target = 2;

        int left = 0;
        int right = arr.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                answer = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("First Occurrence: " + answer);
    }
}