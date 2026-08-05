public class PrimeCounter {

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 10, 13, 17 };
        int count = 0;

        for (int x : arr)
            if (isPrime(x))
                count++;

        System.out.println(count);
    }
}