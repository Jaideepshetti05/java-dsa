public class CheckHappyNumber {

    static int sumSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;

        while (n != 1 && n != 4)
            n = sumSquare(n);

        System.out.println(n == 1 ? "Happy Number" : "Not Happy");
    }
}