public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {12,45,2,78,34};

        int max = arr[0];

        for(int n : arr){
            if(n > max)
                max = n;
        }

        System.out.println(max);
    }
}