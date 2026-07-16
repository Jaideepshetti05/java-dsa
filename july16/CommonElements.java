import java.util.*;

public class CommonElements {

    public static void main(String[] args) {

        int[] a={1,2,3,4,5};
        int[] b={3,5,7};

        Set<Integer> set=new HashSet<>();

        for(int x:a)
            set.add(x);

        for(int x:b)
            if(set.contains(x))
                System.out.println(x);
    }
}