import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};

        int[] merged = new int[a.length + b.length];

        System.arraycopy(a,0,merged,0,a.length);
        System.arraycopy(b,0,merged,a.length,b.length);

        System.out.println(Arrays.toString(merged));
    }
}