public class MatrixRotation {

    static void rotate(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - j - 1];
                mat[i][n - j - 1] = temp;
            }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotate(mat);

        for(int[] row:mat){
            for(int x:row)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}