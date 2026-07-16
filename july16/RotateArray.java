import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        int k=2;

        int n=arr.length;

        int[] ans=new int[n];

        for(int i=0;i<n;i++)
            ans[(i+k)%n]=arr[i];

        System.out.println(Arrays.toString(ans));
    }
}