public class RotateMatrix90 {
    public static void main(String[] args) {

        int[][] mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i=0;i<3;i++){
            for(int j=i;j<3;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3/2;j++){
                int t=mat[i][j];
                mat[i][j]=mat[i][2-j];
                mat[i][2-j]=t;
            }
        }

        for(int[] row:mat){
            for(int x:row)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}