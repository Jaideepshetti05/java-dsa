    public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10,11,12,13,14,15};

        int even = 0, odd = 0;

        for(int num : arr){
            if(num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}