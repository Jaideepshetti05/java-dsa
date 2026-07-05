import java.util.*;

public class RemoveDuplicateWords{

    public static void main(String[] args){

        String text="java python java c python java";

        LinkedHashSet<String> set=new LinkedHashSet<>(Arrays.asList(text.split(" ")));

        System.out.println(set);
    }
}