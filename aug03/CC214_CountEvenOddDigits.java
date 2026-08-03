public class CC214_CountEvenOddDigits {
    public static void main(String[] args) {
        int n = 92834765;
        int even = 0, odd = 0;

        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0)
                even++;
            else
                odd++;
            n /= 10;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}