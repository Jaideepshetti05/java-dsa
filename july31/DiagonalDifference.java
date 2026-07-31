public class DiagonalDifference {
    public static void main(String[] args) {

        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int d1 = 0, d2 = 0;

        for (int i = 0; i < a.length; i++) {
            d1 += a[i][i];
            d2 += a[i][a.length - 1 - i];
        }

        System.out.println(Math.abs(d1 - d2));
    }
}