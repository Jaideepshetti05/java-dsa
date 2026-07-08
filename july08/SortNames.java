import java.util.Arrays;

public class SortNames {

    public static void main(String[] args){

        String names[]={"Rahul","Ankit","Neha","Priya"};

        Arrays.sort(names);

        for(String s:names)
            System.out.println(s);
    }
}