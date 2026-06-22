public class MatrixDiagonalSum {
    public static void main(String[] args) {

        int[][] m = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum = 0;

        for(int i=0;i<m.length;i++)
            sum += m[i][i];

        System.out.println(sum);
    }
}