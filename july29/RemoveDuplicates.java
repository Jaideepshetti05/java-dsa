import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        System.out.println(set);
    }
}