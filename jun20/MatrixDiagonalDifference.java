public class MatrixDiagonalDifference {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int p = 0, s = 0;

        for(int i=0;i<3;i++){
            p += a[i][i];
            s += a[i][2-i];
        }

        System.out.println(Math.abs(p-s));
    }
}