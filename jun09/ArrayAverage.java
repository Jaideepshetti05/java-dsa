public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        double sum=0;

        for(int n:arr) sum+=n;

        System.out.println("Average: "+sum/arr.length);
    }
}