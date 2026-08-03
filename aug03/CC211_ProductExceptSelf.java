import java.util.Arrays;

public class CC211_ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int[] result = new int[n];

        int left = 1;
        for(int i=0;i<n;i++){
            result[i] = left;
            left *= arr[i];
        }

        int right = 1;
        for(int i=n-1;i>=0;i--){
            result[i] *= right;
            right *= arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
import java.util.Arrays;

public class CC211_ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int n = arr.length;
        int[] result = new int[n];

        int left = 1;
        for (int i = 0; i < n; i++) {
            result[i] = left;
            left *= arr[i];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}