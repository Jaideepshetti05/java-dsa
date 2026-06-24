public class LargestInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20},
            {30,40}
        };

        int max = arr[0][0];

        for(int[] row : arr)
            for(int n : row)
                if(n > max) max = n;

        System.out.println(max);
    }
}