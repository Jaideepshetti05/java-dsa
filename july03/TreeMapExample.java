import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(3,"Java");
        map.put(1,"Python");
        map.put(2,"C++");

        System.out.println(map);
    }
}