public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr={5,10,15,20};

        int sum=0;

        for(int n:arr)
            sum+=n;

        System.out.println((double)sum/arr.length);
    }
}