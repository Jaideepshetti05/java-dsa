import java.util.*;

public class ArrayIntersection{
    public static void main(String[] args){

        int[] a={1,2,3,4,5};
        int[] b={3,4,5,6};

        Set<Integer> set=new HashSet<>();

        for(int i:a)
            set.add(i);

        for(int i:b)
            if(set.contains(i))
                System.out.print(i+" ");
    }
}