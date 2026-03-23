import java.util.*;

class MergeSortedArrays {
    public static int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){
            if(a[i] < b[j]) res[k++] = a[i++];
            else res[k++] = b[j++];
        }
        while(i<a.length) res[k++] = a[i++];
        while(j<b.length) res[k++] = b[j++];

        return res;
    }

    public static void main(String[] args) {
        int[] res = merge(new int[]{1,3,5}, new int[]{2,4,6});
        System.out.println(Arrays.toString(res));
    }
}