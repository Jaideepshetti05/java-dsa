import java.util.*;

public class CountDuplicatesHashMap {
    public static void main(String[] args){

        int[] arr={2,3,2,5,5,5,8};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int x:arr)
            map.put(x,map.getOrDefault(x,0)+1);

        System.out.println(map);
    }
}