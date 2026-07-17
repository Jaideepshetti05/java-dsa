import java.util.Arrays;

public class MoveZerosEnd {
    public static void main(String[] args) {
        int[] arr={1,0,4,0,7,0,9};

        int j=0;
        for(int x:arr)
            if(x!=0)
                arr[j++]=x;

        while(j<arr.length)
            arr[j++]=0;

        System.out.println(Arrays.toString(arr));
    }
}