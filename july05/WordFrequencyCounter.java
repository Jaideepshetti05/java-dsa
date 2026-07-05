import java.util.*;

public class WordFrequencyCounter{

    public static void main(String[] args){

        String s="apple banana apple orange banana apple";

        HashMap<String,Integer> map=new HashMap<>();

        for(String w:s.split(" ")){

            map.put(w,map.getOrDefault(w,0)+1);
        }

        System.out.println(map);
    }
}