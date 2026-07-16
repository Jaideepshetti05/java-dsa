public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = 6;

        int expected = n*(n+1)/2;
        int sum = 0;

        for(int x:arr)
            sum += x;

        System.out.println(expected-sum);
    }
}