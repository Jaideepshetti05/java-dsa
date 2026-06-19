public class PrimeRange {
    public static void main(String[] args) {
        int start = 1, end = 50;

        for (int i = start; i <= end; i++) {
            boolean prime = true;

            if (i < 2)
                prime = false;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.print(i + " ");
        }
    }
}