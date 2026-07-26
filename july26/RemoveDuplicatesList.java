import java.util.*;

public class RemoveDuplicatesList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,4,1));

        HashSet<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}