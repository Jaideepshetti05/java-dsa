public class SparseMatrix {

    public static void main(String[] args){

        int[][] mat={
                {0,0,3},
                {0,0,0},
                {5,0,0}
        };

        for(int i=0;i<mat.length;i++)
            for(int j=0;j<mat[0].length;j++)
                if(mat[i][j]!=0)
                    System.out.println(i+" "+j+" "+mat[i][j]);
    }
}