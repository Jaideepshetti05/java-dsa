public class MagicSquareChecker {

    public static void main(String[] args) {

        int[][] mat = {
                {8,1,6},
                {3,5,7},
                {4,9,2}
        };

        int sum = 15;
        boolean magic = true;

        for(int i=0;i<3;i++){
            int r=0,c=0;
            for(int j=0;j<3;j++){
                r+=mat[i][j];
                c+=mat[j][i];
            }
            if(r!=sum||c!=sum) magic=false;
        }

        System.out.println(magic?"Magic":"Not Magic");
    }
}