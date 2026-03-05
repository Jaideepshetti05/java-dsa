public class MissingNumber {
    public static int findMissing(int[] arr, int n){
        int sum = n*(n+1)/2;
        int arrSum = 0;

        for(int num:arr)
            arrSum += num;

        return sum-arrSum;
    }

    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        System.out.println(findMissing(arr,5));
    }
}