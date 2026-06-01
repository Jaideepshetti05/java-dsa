import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        
        int low = 0, high = arr.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            }
            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
        sc.close();
    }
}
