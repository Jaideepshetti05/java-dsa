public class RotateMatrix90 {
    public static void main(String[] args) {

        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i=0;i<3;i++)
            for(int j=i;j<3;j++){
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }

        for(int i=0;i<3;i++){
            for(int j=0;j<3/2;j++){
                int t=a[i][j];
                a[i][j]=a[i][2-j];
                a[i][2-j]=t;
            }
        }

        for(int[] r:a){
            for(int x:r)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}